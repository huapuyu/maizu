package com.anders.maizu.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 房源特色
 * 
 * @author Anders
 * 
 */
@Entity
@Table(name = "rlt_feature_secondhandhouse")
public class FeatureToSecondHandHouse implements Serializable {

	private static final long serialVersionUID = 6906958662410550819L;

	/**
	 * 编号（主键）
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	/**
	 * 房屋编号
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "second_house_id")
	private SecondHandHouse secondHandHouse;
	/**
	 * 数据配置编号（对应数据配置表类型5）
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "data_id")
	private Data data;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public SecondHandHouse getSecondHandHouse() {
		return secondHandHouse;
	}

	public void setSecondHandHouse(SecondHandHouse secondHandHouse) {
		this.secondHandHouse = secondHandHouse;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

}
