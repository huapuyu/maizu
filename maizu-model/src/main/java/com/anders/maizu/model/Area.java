package com.anders.maizu.model;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

/**
 * 区域配置
 * 
 * @author Anders Zhu
 * 
 */
@Entity
@Table(name = "cfg_area")
public class Area implements Serializable {

	private static final long serialVersionUID = 1691841638736947172L;

	public enum AreaType {
		/**
		 * 0：省、自治区、直辖市
		 */
		PROVINCE,
		/**
		 * 1：城市
		 */
		CITY,
		/**
		 * 2：区、县
		 */
		DISTRICT
	}

	/**
	 * 编号（主键）
	 */
	@Id
	private Long id;
	/**
	 * 名称
	 */
	@Column(nullable = false, length = 50)
	private String title;
	/**
	 * 类型（0：省、自治区、直辖市；1：城市；2：区、县）
	 */
	@Enumerated
	@Column(nullable = false)
	private AreaType type;

	/**
	 * 上级区域
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "parent_id")
	private Area parentArea;

	/**
	 * 下级区域
	 */
	@OneToMany(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY, mappedBy = "parentArea")
	@OrderBy("id")
	private List<Area> sonAreas = Collections.emptyList();

	/**
	 * 启用符（1：启用；0：停用）
	 */
	@Column(nullable = false)
	private Boolean enable = true;

	/*
	 * getters and setters
	 */

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public AreaType getType() {
		return type;
	}

	public void setType(AreaType type) {
		this.type = type;
	}

	public Area getParentArea() {
		return parentArea;
	}

	public void setParentArea(Area parentArea) {
		this.parentArea = parentArea;
	}

	public List<Area> getSonAreas() {
		return sonAreas;
	}

	public void setSonAreas(List<Area> sonAreas) {
		this.sonAreas = sonAreas;
	}

	public Boolean getEnable() {
		return enable;
	}

	public void setEnable(Boolean enable) {
		this.enable = enable;
	}

}