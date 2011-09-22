package com.anders.maizu.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.anders.maizu.beans.Condition;

public abstract class BaseDaoSkeleton<T, ID extends Serializable> extends
		HibernateDaoSupport implements BaseDao<T, ID> {

	@Resource
	public void setSessionFactory0(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	protected Class<T> entityClass;

	@SuppressWarnings("unchecked")
	public BaseDaoSkeleton() {
		entityClass = getEntityClass();
	}

	public Class<T> getEntityClass() {
		Type type = getClass().getGenericSuperclass();
		Type[] params = ((ParameterizedType) type).getActualTypeArguments();
		return (Class<T>) params[0];
	}

	@SuppressWarnings("hiding")
	public <T> T saveOrUpdate(T entity) {
		getHibernateTemplate().saveOrUpdate(entity);
		return entity;
	}

	@SuppressWarnings("hiding")
	public <T> T saveNotUpdate(T entity) {
		getHibernateTemplate().save(entity);
		return entity;
	}

	public void delete(T entity) {
		getHibernateTemplate().delete(entity);
	}

	public void deleteById(ID id) {
		getHibernateTemplate().delete(get(id));
	}

	@SuppressWarnings({ "hiding", "unchecked" })
	public <T> T get(ID id) {
		return (T) getHibernateTemplate().get(entityClass, id);
	}

	public List<T> getAll() {
		return getHibernateTemplate().find(
				"from " + entityClass.getSimpleName());
	}

	public List<T> getByCriteria(final Condition condition) {
		HibernateCallback callBack = new HibernateCallback() {
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Criteria criteria = session
						.createCriteria(BaseDaoSkeleton.this.entityClass);
				criteria = criteria.add(createCondition(condition));
				for (String ascProName : condition.getAscOrders()) {
					criteria.addOrder(Order.asc(ascProName));
				}
				for (String descProName : condition.getDescOrders()) {
					criteria.addOrder(Order.desc(descProName));
				}
				return criteria.list();
			}
		};
		return getHibernateTemplate().executeFind(callBack);
	}

	public Criterion createCondition(Condition condition) {
		Criterion returnCri = activeCondition(condition);
		if (condition.getAndCondition() != null) {
			Restrictions.and(returnCri,
					createCondition(condition.getAndCondition()));
		}

		if (condition.getOrCondition() != null) {
			Restrictions.or(returnCri,
					createCondition(condition.getAndCondition()));
		}

		return returnCri;
	}

	protected Criterion activeCondition(Condition condition) {
		Criterion activeCondition = null;
		switch (condition.getCompareTyle()) {
		case EQ:
			activeCondition = Restrictions.eq(condition.getPropertyName(),
					condition.getValues()[0]);
			break;
		case UEQ:
			activeCondition = Restrictions.not(Restrictions.eq(
					condition.getPropertyName(), condition.getValues()[0]));
			break;

		case GT:
			activeCondition = Restrictions.gt(condition.getPropertyName(),
					condition.getValues()[0]);
			break;
		case GEQ:
			activeCondition = Restrictions.ge(condition.getPropertyName(),
					condition.getValues()[0]);
			break;

		case LT:
			activeCondition = Restrictions.lt(condition.getPropertyName(),
					condition.getValues()[0]);
			break;
		case LEQ:
			activeCondition = Restrictions.le(condition.getPropertyName(),
					condition.getValues()[0]);
			break;

		case LIKE:
			activeCondition = Restrictions.like(condition.getPropertyName(),
					condition.getValues()[0]);
			break;
		case ULIKE:
			activeCondition = Restrictions.not(Restrictions.like(
					condition.getPropertyName(), condition.getValues()[0]));
			break;

		case ISNULL:
			activeCondition = Restrictions.isNull(condition.getPropertyName());
			break;
		case UISNULL:
			activeCondition = Restrictions.isNotNull(condition
					.getPropertyName());
			break;

		case IN:
			activeCondition = Restrictions.in(condition.getPropertyName(),
					condition.getValues());
			break;
		case UIN:
			activeCondition = Restrictions.not(Restrictions.in(
					condition.getPropertyName(), condition.getValues()));
			break;

		case BETWEEN:
			activeCondition = Restrictions.between(condition.getPropertyName(),
					condition.getValues()[0], condition.getValues()[1]);
			break;
		case UBETWEEN:
			activeCondition = Restrictions.not(Restrictions.between(
					condition.getPropertyName(), condition.getValues()[0],
					condition.getValues()[1]));
			break;
		default:
			break;
		}
		return activeCondition;
	}
}
