package com.anders.maizu.model.tools;

import java.util.Calendar;
import java.util.Date;

public class FieldInitTools {

	public static Date getDateAgainstDay(int amount) {
		Calendar ca = Calendar.getInstance();
		ca.add(Calendar.DAY_OF_YEAR, amount);
		return ca.getTime();
	}

	public static Date getDateAgainstMonth(int amount) {
		Calendar ca = Calendar.getInstance();
		ca.add(Calendar.MONTH, amount);
		return ca.getTime();
	}

	public static Date getDateAgainstWeek(int amount) {
		Calendar ca = Calendar.getInstance();
		ca.add(Calendar.WEEK_OF_YEAR, amount);
		return ca.getTime();
	}
}
