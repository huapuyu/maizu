package com.anders.maizu.service.common;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anders.maizu.api.common.CommonService;
import com.anders.maizu.beans.Condition;
import com.anders.maizu.dao.AreaDao;
import com.anders.maizu.dao.DataDao;
import com.anders.maizu.dao.util.ConstantUtil;
import com.anders.maizu.model.Area;
import com.anders.maizu.model.Data;
import com.anders.maizu.model.Data.DataType;


@Service("commonService")
public class CommonServiceImpl implements CommonService {
	
	@Autowired
	private AreaDao areaDao;

	@Autowired
	private DataDao dataDao;

	public List<Area> getSonAreasBy(Long parentId) {
		Condition condition = new Condition("parentArea.id", ConstantUtil.CompareType.EQ, parentId);
		condition.setAscOrders("id");
		return areaDao.getByCriteria(condition);
	}

	@Override
	public List<Data> getData(DataType dataType) {
		Condition condition = new Condition("type", ConstantUtil.CompareType.EQ, dataType);
		condition.setAscOrders("id");
		return dataDao.getByCriteria(condition);
	}

}
