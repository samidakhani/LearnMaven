package org.dakhani.learn.jaxb.adapter;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.bind.DatatypeConverter;

/**
 * @author Sami Dakhani Created on Nov 5, 2016
 *
 */
public class DateAdapter {

	/**
	 * Parses the date.
	 *
	 * @param s
	 *            the s
	 * @return the date
	 */
	public static Date parseDate(final String s) {
		return DatatypeConverter.parseDate(s).getTime();
	}

	/**
	 * Prints the date.
	 *
	 * @param dt
	 *            the dt
	 * @return the string
	 */
	public static String printDate(final Date dt) {
		Calendar cal = new GregorianCalendar();
		cal.setTime(dt);
		return DatatypeConverter.printDate(cal);
	}

	/**
	 * Dummy test method-To be removed for actual project use
	 * 
	 * @return
	 */
	public String adaptDate() {
		return "Adapt date";
	}
}
