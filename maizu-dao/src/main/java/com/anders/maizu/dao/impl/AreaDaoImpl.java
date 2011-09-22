package com.anders.maizu.dao.impl;

import org.springframework.stereotype.Repository;

import com.anders.maizu.dao.AreaDao;
import com.anders.maizu.dao.BaseDaoSkeleton;
import com.anders.maizu.model.Area;

@Repository("areaDao")
public class AreaDaoImpl extends BaseDaoSkeleton<Area, Long> implements AreaDao {

}
