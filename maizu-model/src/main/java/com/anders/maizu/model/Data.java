package com.anders.maizu.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 数据配置
 * 
 * @author Anders Zhu
 * 
 */
@Entity
@Table(name = "cfg_data")
public class Data implements Serializable {

	private static final long serialVersionUID = 2757892825868662843L;

	public enum DataType {

		/**
		 * 0：朝向（房屋）
		 */
		ORIENTATION,
		/**
		 * 1：物业类型（房屋）
		 */
		PROPERTY_TYPE,
		/**
		 * 2：建筑年代（房屋）
		 */
		CONSTRUCTION_YEAR,
		/**
		 * 3：装修程度（房屋）
		 */
		DECORATION,
		/**
		 * 4：配套设施（房屋）
		 */
		FACILITY,
		/**
		 * 5：房源特色（房屋）
		 */
		FEATURE,
		/**
		 * 6：产权性质（二手房）
		 */
		PROPERTY_RIGHT,
		/**
		 * 7：住宅类别（二手房）
		 */
		RESIDENCE_TYPE,
		/**
		 * 8：建筑类别（二手房）
		 */
		CONSTRUCTION_TYPE,
		/**
		 * 9：房屋结构（二手房）
		 */
		BUILDING_STRUCTURE,
		/**
		 * 10：看房时间（二手房）
		 */
		VISIT_TIME,
		/**
		 * 11：租房方式（租房）
		 */
		SHARE_TYPE,
		/**
		 * 12：合租人性别要求（租房）
		 */
		ROOMMATE_GENDER_PREFERENCE,
		/**
		 * 13：支付方式（租房）
		 */
		PAYMENT,
		/**
		 * 14：期望成交时间（租房）
		 */
		DEAL_TIME,
		/**
		 * 15：租期（租房）
		 */
		RENT_PERIOD
	}

	public Data(Long id) {
		this.id = id;
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
	 * 类型
	 */
	@Enumerated
	@Column(nullable = false)
	private DataType type;
	/**
	 * 启用符（1：启用；0：停用）
	 */
	@Column(nullable = false)
	private Boolean enable = true;

	public Data() {
	}

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

	public DataType getType() {
		return type;
	}

	public void setType(DataType type) {
		this.type = type;
	}

	public Boolean getEnable() {
		return enable;
	}

	public void setEnable(Boolean enable) {
		this.enable = enable;
	}

}
