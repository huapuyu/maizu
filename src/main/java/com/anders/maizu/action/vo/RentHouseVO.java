package com.anders.maizu.action.vo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.anders.maizu.model.Area;
import com.anders.maizu.model.Data;
import com.anders.maizu.model.FacilityToRentHouse;
import com.anders.maizu.model.FeatureToRentHouse;
import com.anders.maizu.model.tools.FieldInitTools;

public class RentHouseVO {

	private BigDecimal price = new BigDecimal(0);
	private Data paidType;
	private BigDecimal area;
	private Data rentType;
	private Data rentDemand;
	private Data dealTime;
	private Data visitTime;
	private Date expiration = FieldInitTools.getDateAgainstMonth(2);

	private String title;
	private Area province;
	private Area city;
	private Area district;
	private String address;
	private Byte bedroomCount;
	private Byte livingRoomCount;
	private Byte kitchenCount;
	private Byte washroomCount;
	private Byte balconyCount;
	private Data rendPeriod;
	private Data orientation;
	private Data propertyType;
	private Data residenceType;
	private Data constructionYear;
	private Data decoration;
	private Byte totalFloor;
	private Byte floor;
	private String transport;
	private String environment;
	private String remark;
	private Set<FacilityToRentHouse> facilityToRentHouses = new HashSet<FacilityToRentHouse>(0);
	private Set<FeatureToRentHouse> featureToRentHouses = new HashSet<FeatureToRentHouse>(0);

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
