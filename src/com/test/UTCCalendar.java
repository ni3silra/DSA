package com.test;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class UTCCalendar extends GregorianCalendar {
	private static final SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd' 'HH:mm:ss.SSS");
	static {
		formatter.setTimeZone(TimeZone.getTimeZone("UTC"));
	}
	
	public UTCCalendar() {
		setTimeZone(TimeZone.getTimeZone("UTC"));
	}
	
	public UTCCalendar(long milliseconds) {
		this();
		setTime(new Date(milliseconds));
	}

	public UTCCalendar(Calendar calendar) {
		this();
		setTime(calendar.getTime());
	}
	
	public UTCCalendar(Timestamp timestamp) {
		this();
		setTime(new Date(timestamp.getTime()));
		
	}

	public static UTCCalendar fromString(String formattedDate) {
		if (formattedDate == null || formattedDate.equals("")) {
			return null;
		}

		UTCCalendar utcCalendar = new UTCCalendar();
		utcCalendar.setFromDateString(formattedDate);
		return utcCalendar;
	}
	
	public static UTCCalendar from(ZonedDateTime zdt) {
		return new UTCCalendar(GregorianCalendar.from(zdt));
	}

	public String getDateAsString(){
		return formatter.format(getTime());
	}
	
	public void setFromDateString(String dateString) {
		try {
			setTime(formatter.parse(dateString));
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void zeroOutTime() {
		set(Calendar.HOUR_OF_DAY, 0);
		set(Calendar.MINUTE, 0);
		set(Calendar.SECOND, 0);
		set(Calendar.MILLISECOND, 0);
	}

	public UTCCalendar noSeconds() {
		set(Calendar.SECOND, 0);
		set(Calendar.MILLISECOND, 0);
		return this;
	}

}
