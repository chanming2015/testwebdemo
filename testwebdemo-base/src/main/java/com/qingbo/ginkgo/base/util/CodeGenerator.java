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
	
	/**
	 * 全部大写字母
	 */
	private static String uppercaseCandidate = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	/**
	 * 全部小写字母
	 */
	private static String lowercaseCandidate = "abcdefghijklmnopqrstuvwxyz";
	/**
	 * 全部大写和小写字母
	 */
	private static String characterCandidate = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	/**
	 * 全部数字
	 */
	private static String digitCandidate = "0123456789";
	/**
	 * 全部特殊符号
	 */
	private static String symbolCandidate = "~!@#$%^&*()<>{}_+:;,.=-|/";
	/**
	 * 全部特殊符号和数字
	 */
	private static String symbolDigitCandidate = "~!@#$%^&*()<>{}_+:;,.=-|/0123456789";
	/**
	 * 全部大写、小写字母和特殊符号
	 */
	private static String characterSymbolCandidate = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz~!@#$%^&*()<>{}_+:;,.=-|/";
	/**
	 * 全部大写、小写字母和数字
	 */
	private static String characterDigitCandidate = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	/**
	 * 全部大写、小写字母、特殊符号和数字
	 */
	private static String fullDoseCandidate = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz~!@#$%^&*()<>{}_+:;,.=-|/0123456789";
	
	private static Random random = new Random();

	/**
	 * 大写字母
	 */
	public static final int UPPERCASE 			= 1;
	/**
	 * 小写字母
	 */
	public static final int LOWERCASE 			= 2;
	/**
	 * 大写和小写字母
	 */
	public static final int CHARACTER 			= 3;
	/**
	 * 数字
	 */
	public static final int DIGIT 				= 4;
	/**
	 * 特殊符号
	 */
	public static final int SYMBOL 				= 5;
	/**
	 * 字母和特殊符号
	 */
	public static final int CHARACTER_SYMBOL 	= 6;
	/**
	 * 特殊符号和数字
	 */
	public static final int SYMBOL_DIGIT 		= 7;
	/**
	 * 字母和数字
	 */
	public static final int CHARACTER_DIGIT 	= 8;
	/**
	 * 所有
	 */
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
