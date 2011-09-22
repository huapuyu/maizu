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
@Table(name = "rlt_feature_renthouse")
public class FeatureToRentHouse implements Serializable {

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
	@JoinColumn(name = "rent_house_id")
	private RentHouse rentHouse;
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

	public RentHouse getRentHouse() {
		return rentHouse;
	}

	public void setRentHouse(RentHouse rentHouse) {
		this.rentHouse = rentHouse;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

}
