package com.anders.maizu.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 二手房
 * 
 * @author Anders
 * 
 */
@Entity
@Table(name = "tb_second_hand_house")
public class SecondHandHouse implements Serializable {

	private static final long serialVersionUID = -8981569640271697506L;

	/**
	 * 编号（主键）
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	/**
	 * 标题
	 */
	@Column(nullable = false, length = 50, unique = true)
	private String title;
	/**
	 * 楼盘名称
	 */
	@Column(nullable = false, length = 50)
	private String name;
	/**
	 * 省、自治区、直辖市编号（对应区域配置表类型0）
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "province_id")
	private Area province;
	/**
	 * 城市编号（对应区域配置表类型1）
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "city_id")
	private Area city;
	/**
	 * 区、县、市编号（对应区域配置表类型2）
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "district_id")
	private Area district;
	/**
	 * 详细地址
	 */
	@Column(nullable = false, length = 100)
	private String address;
	/**
	 * 售价
	 */
	@Column(nullable = false, scale = 2)
	private BigDecimal price;
	/**
	 * 建筑面积
	 */
	@Column(name = "building_area", nullable = false, scale = 2)
	private BigDecimal buildingArea;
	/**
	 * 使用面积
	 */
	@Column(name = "usable_area", nullable = false, scale = 2)
	private BigDecimal usableArea;
	/**
	 * 室
	 */
	@Column(nullable = false)
	private Byte bedroomCount;
	/**
	 * 厅
	 */
	@Column(nullable = false)
	private Byte livingRoomCount;
	/**
	 * 厨
	 */
	@Column(nullable = false)
	private Byte kitchenCount;
	/**
	 * 卫
	 */
	@Column(nullable = false)
	private Byte washroomCount;
	/**
	 * 阳台
	 */
	@Column(nullable = false)
	private Byte balconyCount;
	/**
	 * 建筑年代（对应数据配置表类型2）
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "construction_year_id")
	private Data constructionYear;
	/**
	 * 总楼层
	 */
	@Column(name = "total_floor", nullable = false)
	private Byte totalFloor;
	/**
	 * 所在楼层
	 */
	@Column(nullable = false)
	private Byte floor;

	/*
	 * 以下为选填信息
	 */

	/**
	 * 朝向（对应数据配置表类型0）
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "orientation_id")
	private Data orientation;
	/**
	 * 物业类型（对应数据配置表类型1）
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "property_type_id")
	private Data propertyType;
	/**
	 * 装修程度（对应数据配置表类型3）
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "decoration_id")
	private Data decoration;
	/**
	 * 产权性质（对应数据配置表类型6）
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "property_right_id")
	private Data propertyRight;
	/**
	 * 住宅类别（对应数据配置表类型7）
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "residence_type_id")
	private Data residenceType;
	/**
	 * 建筑类别（对应数据配置表类型8）
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "construction_type_id")
	private Data constructionType;
	/**
	 * 房屋结构（对应数据配置表类型9）
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "building_structure_id")
	private Data buildingStructure;
	/**
	 * 看房时间（对应数据配置表类型10）
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "visit_time_id")
	private Data visitTime;
	/**
	 * 交通状况
	 */
	@Column(length = 500)
	private String transport;
	/**
	 * 周边配套
	 */
	@Column(length = 500)
	private String environment;
	/**
	 * 房源描述
	 */
	@Column(length = 500)
	private String remark;
	/**
	 * 配套设施
	 */
	@OneToMany(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY, mappedBy = "secondHandHouse")
	private Set<FacilityToSecondHandHouse> facilityToSecondHandHouses = Collections.emptySet();
	/**
	 * 房源特色
	 */
	@OneToMany(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY, mappedBy = "secondHandHouse")
	private Set<FeatureToSecondHandHouse> featureToSecondHandHouses = Collections.emptySet();
	/**
	 * 有效期
	 */
	@Temporal(TemporalType.TIMESTAMP)
	private Date expiration;

}
