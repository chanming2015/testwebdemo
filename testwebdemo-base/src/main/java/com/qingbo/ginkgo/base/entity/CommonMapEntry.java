package com.qingbo.ginkgo.base.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * 通用字典条目
 */

@Entity
public class CommonMapEntry extends BaseEntity {

	private static final long serialVersionUID = 329697596530480194L;
	
	private String key;			// 键
	private String value;		// 值

	@ManyToOne(cascade = { CascadeType.REFRESH, CascadeType.MERGE }, optional = false)
    private CommonMap map;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public CommonMap getMap() {
		return map;
	}

	public void setMap(CommonMap map) {
		this.map = map;
	}
}
