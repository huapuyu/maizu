package com.anders.maizu.dao.impl;

import org.springframework.stereotype.Repository;

import com.anders.maizu.dao.BaseDaoSkeleton;
import com.anders.maizu.dao.DataDao;
import com.anders.maizu.model.Data;

@Repository("dataDao")
public class DataDaoImpl extends BaseDaoSkeleton<Data, Long> implements DataDao {

}
