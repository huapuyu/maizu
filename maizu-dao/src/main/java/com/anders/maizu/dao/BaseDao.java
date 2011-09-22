package com.anders.maizu.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.SessionFactory;

import com.anders.maizu.beans.Condition;

public interface BaseDao<T, ID extends Serializable> {

	public void setSessionFactory0(SessionFactory sessionFactory);

	public Class<T> getEntityClass();

	/**
	 * 增
	 */
	public <T> T saveOrUpdate(T entity);

	public <T> T saveNotUpdate(T entity);

	/**
	 * 删
	 */
	public void delete(T entity);

	public void deleteById(ID id);

	/**
	 * 改
	 */

	/**
	 * 查
	 */
	public <T> T get(ID id);

	public List<T> getAll();

	public List<T> getByCriteria(Condition condition);
	/**
	 * 工具方法
	 */
}
