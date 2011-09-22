package com.anders.maizu.dao.impl;

import org.springframework.stereotype.Repository;

import com.anders.maizu.dao.BaseDaoSkeleton;
import com.anders.maizu.dao.UserDao;
import com.anders.maizu.model.User;

@Repository("userDao")
public class UserDaoImpl extends BaseDaoSkeleton<User, Long> implements UserDao {

}
