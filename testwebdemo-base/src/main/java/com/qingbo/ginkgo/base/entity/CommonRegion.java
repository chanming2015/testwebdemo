package com.qingbo.ginkgo.base.entity;

import javax.persistence.Entity;

/**
 * 地区
 */

@Entity
public class CommonRegion extends BaseEntity {

	private static final long serialVersionUID = 7813965968530463146L;
	
	private Integer code;			// 地区代码
	private String name;			// 地区名称
	private Integer parentCode;		// 上级地区代码
	private Integer level;			// 地区层级
	
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getParentCode() {
		return parentCode;
	}
	public void setParentCode(Integer parentCode) {
		this.parentCode = parentCode;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
}
