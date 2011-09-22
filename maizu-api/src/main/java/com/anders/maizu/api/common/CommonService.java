package com.anders.maizu.api.common;

import java.util.List;

import com.anders.maizu.model.Area;
import com.anders.maizu.model.Data;

public interface CommonService {
	/**
	 * 
	 * @param parentId
	 * @return 子区域列表
	 */
	public List<Area> getSonAreasBy(Long parentId);
	
	/**
	 * 
	 * @param parentId
	 * @return 得到所属类型的Data
	 */
	public List<Data> getData(Data.DataType dataType);
}
