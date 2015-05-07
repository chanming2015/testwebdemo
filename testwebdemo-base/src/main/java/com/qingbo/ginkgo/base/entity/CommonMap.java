package com.qingbo.ginkgo.base.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import com.qingbo.ginkgo.base.entity.BaseEntity;

/**
 * 通用字典
 */

@Entity
public class CommonMap extends BaseEntity {

	private static final long serialVersionUID = -3416043189456897495L;
	
	private String name;			// 字典名称

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "map")
    private Set<CommonMapEntry> entries = new HashSet<CommonMapEntry>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<CommonMapEntry> getEntries() {
		return entries;
	}

	public void setEntries(Set<CommonMapEntry> entries) {
		this.entries = entries;
	}
	
}
