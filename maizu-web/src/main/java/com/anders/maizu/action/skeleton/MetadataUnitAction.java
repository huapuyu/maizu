package com.anders.maizu.action.skeleton;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.anders.maizu.action.BaseAction;
import com.anders.maizu.api.common.CommonService;
import com.anders.maizu.model.Area;
import com.anders.maizu.model.Data;
import com.anders.maizu.model.Data.DataType;

public abstract class MetadataUnitAction extends BaseAction {

	private List<Area> areas;
	private List<Data> payMentData;
	private List<Data> dealTimeData;
	private List<Data> visitTimeData;
	private List<Data> rentPeriodData;
	private List<Data> decorationData;
	private List<Data> residenceTypeData;
	private List<Data> orientationData;
	private List<Data> constructionYearData;

	private List<Byte> bedroomCounts;
	private List<Byte> livingRoomCounts;
	private List<Byte> washroomCounts;

	protected boolean createFlag = false;

	private CommonService commonService;

	protected void doGetAreas(Long parentCityId) {
		this.areas = this.commonService.getSonAreasBy(parentCityId);
	}

	protected void doGetPayMentData(DataType dataType) {
		this.payMentData = this.commonService.getData(dataType);
	}

	protected void doGetDealTimeData(DataType dataType) {
		this.dealTimeData = this.commonService.getData(dataType);
	}

	protected void doGetVisitTimeData(DataType dataType) {
		this.visitTimeData = this.commonService.getData(dataType);
	}

	protected void doGetRentPeriodData(DataType dataType) {
		this.rentPeriodData = this.commonService.getData(dataType);
	}

	protected void doGetDecorationData(DataType dataType) {
		this.decorationData = this.commonService.getData(dataType);
	}

	protected void doGetResidenceTypeData(DataType dataType) {
		this.residenceTypeData = this.commonService.getData(dataType);
	}

	protected void doGetOrientationData(DataType dataType) {
		this.orientationData = this.commonService.getData(dataType);
	}

	protected void doGetConstructionYearData(DataType dataType) {
		this.constructionYearData = this.commonService.getData(dataType);
	}

	@Autowired
	public void setCommonService(CommonService commonService) {
		this.commonService = commonService;
	}

	public CommonService getCommonService() {
		return commonService;
	}

	public List<Area> getAreas() {
		return areas;
	}

	public List<Byte> getBedroomCounts() {
		Byte[] roomCounts = new Byte[] { 1, 2, 3, 4, 5, 6, 7 };
		bedroomCounts = Arrays.asList(roomCounts);
		return bedroomCounts;
	}

	public List<Byte> getLivingRoomCounts() {
		Byte[] roomCounts = new Byte[] { 0, 1, 2, 3, 4 };
		livingRoomCounts = Arrays.asList(roomCounts);
		return livingRoomCounts;
	}

	public List<Byte> getWashroomCounts() {
		Byte[] roomCounts = new Byte[] { 0, 1, 2, 3, 4 };
		washroomCounts = Arrays.asList(roomCounts);
		return washroomCounts;
	}

	public List<Data> getPayMentData() {
		return payMentData;
	}

	public void setPayMentData(List<Data> payMentData) {
		this.payMentData = payMentData;
	}

	public List<Data> getDealTimeData() {
		return dealTimeData;
	}

	public void setDealTimeData(List<Data> dealTimeData) {
		this.dealTimeData = dealTimeData;
	}

	public List<Data> getVisitTimeData() {
		return visitTimeData;
	}

	public void setVisitTimeData(List<Data> visitTimeData) {
		this.visitTimeData = visitTimeData;
	}

	public List<Data> getRentPeriodData() {
		return rentPeriodData;
	}

	public void setRentPeriodData(List<Data> rentPeriodData) {
		this.rentPeriodData = rentPeriodData;
	}

	public List<Data> getDecorationData() {
		return decorationData;
	}

	public void setDecorationData(List<Data> decorationData) {
		this.decorationData = decorationData;
	}

	public List<Data> getResidenceTypeData() {
		return residenceTypeData;
	}

	public void setResidenceTypeData(List<Data> residenceTypeData) {
		this.residenceTypeData = residenceTypeData;
	}

	public List<Data> getOrientationData() {
		return orientationData;
	}

	public void setOrientationData(List<Data> orientationData) {
		this.orientationData = orientationData;
	}

	public boolean isCreateFlag() {
		return createFlag;
	}

	public void setCreateFlag(boolean createFlag) {
		this.createFlag = createFlag;
	}

	public List<Data> getConstructionYearData() {
		return constructionYearData;
	}

	public void setConstructionYearData(List<Data> constructionYearData) {
		this.constructionYearData = constructionYearData;
	}

}
