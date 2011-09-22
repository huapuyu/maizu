package com.anders.maizu.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
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

import com.anders.maizu.model.tools.FieldInitTools;

/**
 * 出租房
 * 
 * @author Anders
 * 
 */
@Entity
@Table(name = "tb_rent_house")
public class RentHouse implements Serializable {

	private static final long serialVersionUID = 780341474894787956L;
	/**
	 * 编号（主键）
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	/**
	 * 租金
	 */
	@Column
	private BigDecimal price = new BigDecimal(0);

	/**
	 * 支付方式
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "paid_type_id", nullable = false)
	private Data paidType;

	/**
	 * 出租面积
	 */
	@Column
	private BigDecimal area;

	/**
	 * 租房方式
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "rent_type_id", nullable = false)
	private Data rentType;

	/**
	 * 合租要求
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "rent_demand_id")
	private Data rentDemand;

	/**
	 * 签约时间
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "deal_time_id", nullable = false)
	private Data dealTime;

	/**
	 * 看房时间
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "visit_time_id", nullable = false)
	private Data visitTime;

	/**
	 * 有效期
	 */
	@Temporal(TemporalType.TIMESTAMP)
	private Date expiration = FieldInitTools.getDateAgainstMonth(2);

	// 房屋信息

	/**
	 * 楼盘名称
	 */
	@Column(nullable = false, length = 50)
	private String title;

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
	 * 室
	 */
	@Column
	private Byte bedroomCount;
	/**
	 * 厅
	 */
	@Column
	private Byte livingRoomCount;
	/**
	 * 厨
	 */
	@Column
	private Byte kitchenCount;
	/**
	 * 卫
	 */
	@Column
	private Byte washroomCount;
	/**
	 * 阳台
	 */
	@Column
	private Byte balconyCount;

	/**
	 * 期望租期
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "rend_period_id")
	private Data rendPeriod;

	/**
	 * 朝向
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "orientation_id")
	private Data orientation;
	/**
	 * 物业类型
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "property_type_id")
	private Data propertyType;
	/**
	 * 住宅类别（对应数据配置表类型7）
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "residence_type_id")
	private Data residenceType;
	/**
	 * 建筑年代
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "construction_year_id")
	private Data constructionYear;
	/**
	 * 装修程度
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "decoration_id")
	private Data decoration;
	/**
	 * 总楼层
	 */
	@Column
	private Byte totalFloor;
	/**
	 * 所在楼层
	 */
	@Column
	private Byte floor;
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
	@OneToMany(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY, mappedBy = "rentHouse")
	private Set<FacilityToRentHouse> facilityToRentHouses = new HashSet<FacilityToRentHouse>(0);
	/**
	 * 房源特色
	 */
	@OneToMany(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY, mappedBy = "rentHouse")
	private Set<FeatureToRentHouse> featureToRentHouses = new HashSet<FeatureToRentHouse>(0);

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Data getPaidType() {
		return paidType;
	}

	public void setPaidType(Data paidType) {
		this.paidType = paidType;
	}

	public BigDecimal getArea() {
		return area;
	}

	public void setArea(BigDecimal area) {
		this.area = area;
	}

	public Data getRentType() {
		return rentType;
	}

	public void setRentType(Data rentType) {
		this.rentType = rentType;
	}

	public Data getRentDemand() {
		return rentDemand;
	}

	public void setRentDemand(Data rentDemand) {
		this.rentDemand = rentDemand;
	}

	public Data getDealTime() {
		return dealTime;
	}

	public void setDealTime(Data dealTime) {
		this.dealTime = dealTime;
	}

	public Data getVisitTime() {
		return visitTime;
	}

	public void setVisitTime(Data visitTime) {
		this.visitTime = visitTime;
	}

	public Date getExpiration() {
		return expiration;
	}

	public void setExpiration(Date expiration) {
		this.expiration = expiration;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Area getProvince() {
		return province;
	}

	public void setProvince(Area province) {
		this.province = province;
	}

	public Area getCity() {
		return city;
	}

	public void setCity(Area city) {
		this.city = city;
	}

	public Area getDistrict() {
		return district;
	}

	public void setDistrict(Area district) {
		this.district = district;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Byte getBedroomCount() {
		return bedroomCount;
	}

	public void setBedroomCount(Byte bedroomCount) {
		this.bedroomCount = bedroomCount;
	}

	public Byte getLivingRoomCount() {
		return livingRoomCount;
	}

	public void setLivingRoomCount(Byte livingRoomCount) {
		this.livingRoomCount = livingRoomCount;
	}

	public Byte getKitchenCount() {
		return kitchenCount;
	}

	public void setKitchenCount(Byte kitchenCount) {
		this.kitchenCount = kitchenCount;
	}

	public Byte getWashroomCount() {
		return washroomCount;
	}

	public void setWashroomCount(Byte washroomCount) {
		this.washroomCount = washroomCount;
	}

	public Byte getBalconyCount() {
		return balconyCount;
	}

	public void setBalconyCount(Byte balconyCount) {
		this.balconyCount = balconyCount;
	}

	public Data getOrientation() {
		return orientation;
	}

	public void setOrientation(Data orientation) {
		this.orientation = orientation;
	}

	public Data getPropertyType() {
		return propertyType;
	}

	public void setPropertyType(Data propertyType) {
		this.propertyType = propertyType;
	}

	public Data getConstructionYear() {
		return constructionYear;
	}

	public void setConstructionYear(Data constructionYear) {
		this.constructionYear = constructionYear;
	}

	public Data getDecoration() {
		return decoration;
	}

	public void setDecoration(Data decoration) {
		this.decoration = decoration;
	}

	public Byte getTotalFloor() {
		return totalFloor;
	}

	public void setTotalFloor(Byte totalFloor) {
		this.totalFloor = totalFloor;
	}

	public Byte getFloor() {
		return floor;
	}

	public void setFloor(Byte floor) {
		this.floor = floor;
	}

	public String getTransport() {
		return transport;
	}

	public void setTransport(String transport) {
		this.transport = transport;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Data getRendPeriod() {
		return rendPeriod;
	}

	public void setRendPeriod(Data rendPeriod) {
		this.rendPeriod = rendPeriod;
	}

	public Data getResidenceType() {
		return residenceType;
	}

	public void setResidenceType(Data residenceType) {
		this.residenceType = residenceType;
	}

}
