package com.qingbo.ginkgo.base.util;

import java.util.Random;

/**
 * 
 * Project:testwebdemo-base
 * Package:com.qingbo.ginkgo.base.util
 * FileName:CodeGenerator.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015年5月7日 下午4:52:54
 * Modified By:XuMaoSen
 * Modified Time:
 * What is Modified:
 * Description: 随机代码生成器
 * Version:
 */
public class CodeGenerator {
	
	private static String uppercaseCandidate = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static String lowercaseCandidate = "abcdefghijklmnopqrstuvwxyz";
	private static String characterCandidate = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	private static String digitCandidate = "0123456789";
	private static String symbolCandidate = "~!@#$%^&*()<>{}_+:;,.=-|/";
	private static String symbolDigitCandidate = "~!@#$%^&*()<>{}_+:;,.=-|/0123456789";
	private static String characterSymbolCandidate = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz~!@#$%^&*()<>{}_+:;,.=-|/";
	private static String characterDigitCandidate = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	private static String fullDoseCandidate = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz~!@#$%^&*()<>{}_+:;,.=-|/0123456789";
	
	private static Random random = new Random();

	public static final int UPPERCASE 			= 1;
	public static final int LOWERCASE 			= 2;
	public static final int CHARACTER 			= 3;
	public static final int DIGIT 				= 4;
	public static final int SYMBOL 				= 5;
	public static final int CHARACTER_SYMBOL 	= 6;
	public static final int SYMBOL_DIGIT 		= 7;
	public static final int CHARACTER_DIGIT 	= 8;
	public static final int FULL_DOSE 			= 9;
	
	public static String generate(int type, int length){
		if(length <= 0){
			return "";
		}
		
		String candidate;
		switch(type){
			case UPPERCASE :{
				candidate = uppercaseCandidate;
				break;
			}
			case LOWERCASE :{
				candidate = lowercaseCandidate;
				break;
			}
			case CHARACTER :{
				candidate = characterCandidate;
				break;
			}
			case DIGIT :{
				candidate = digitCandidate;
				break;
			}
			case SYMBOL :{
				candidate = symbolCandidate;
				break;
			}
			case CHARACTER_SYMBOL :{
				candidate = characterSymbolCandidate;
				break;
			}
			case SYMBOL_DIGIT :{
				candidate = symbolDigitCandidate;
				break;
			}
			case CHARACTER_DIGIT :{
				candidate = characterDigitCandidate;
				break;
			}
			case FULL_DOSE :{
				candidate = fullDoseCandidate;
				break;
			}
			default:{
				candidate = fullDoseCandidate;
				break;
			}
		}
		
		String result = "";
		for(int i = 0; i < length; i ++){
			int pos = Math.abs(random.nextInt())%candidate.length();
			result += candidate.substring(pos, pos + 1);
		}
		return result;
	}
	
	public static void main(String[] args) {
		for(int i = 0; i < 20; i ++){
			System.out.println(generate(CodeGenerator.UPPERCASE, 2) + generate(CodeGenerator.DIGIT, 2) + generate(CodeGenerator.CHARACTER_DIGIT, 1).toUpperCase());
		}
	}
}
