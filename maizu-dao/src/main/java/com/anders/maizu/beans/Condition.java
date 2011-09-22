package com.anders.maizu.beans;

import com.anders.maizu.dao.util.ConstantUtil;

public class Condition {

	private String propertyName;
	private ConstantUtil.CompareType compareTyle;
	private Object[] values;
	private Condition andCondition;
	private Condition orCondition;
	private String[] ascOrders;
	private String[] descOrders;

	public Condition() {
	}

	public Condition(String propertyName, ConstantUtil.CompareType compareTyle,
			Object... values) {
		this.propertyName = propertyName;
		this.compareTyle = compareTyle;
		this.values = values;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public ConstantUtil.CompareType getCompareTyle() {
		return compareTyle;
	}

	public void setCompareTyle(ConstantUtil.CompareType compareTyle) {
		this.compareTyle = compareTyle;
	}

	public Object[] getValues() {
		return values;
	}

	public void setValues(Object[] values) {
		this.values = values;
	}

	public Condition getAndCondition() {
		return andCondition;
	}

	public void setAndCondition(Condition andCondition) {
		this.andCondition = andCondition;
	}

	public Condition getOrCondition() {
		return orCondition;
	}

	public void setOrCondition(Condition orCondition) {
		this.orCondition = orCondition;
	}

	public String[] getAscOrders() {
		return ascOrders == null ? new String[] {} : ascOrders;
	}

	public void setAscOrders(String... ascOrders) {
		this.ascOrders = ascOrders;
	}

	public String[] getDescOrders() {
		return descOrders == null ? new String[] {} : descOrders;
	}

	public void setDescOrders(String[] descOrders) {
		this.descOrders = descOrders;
	}
}
