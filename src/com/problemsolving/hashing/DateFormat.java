package com.problemsolving.hashing;

import java.util.*;

public class DateFormat {

	public static void main(String[] args) {
		System.out.println(new DateFormat().solve("25th Apr 2217"));
	}

	public String solve(String A) {

		String[] months = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

		List<String> days = new ArrayList<String>();

		days.add("1st");
		days.add("2nd");
		days.add("3rd");

		for (int i = 4; i <= 31; i++)
			days.add(i + "th");
		String[] date = A.split(" ");
		int year = Integer.parseInt(date[2]);
		int month = 0;
		int day = 0;

		for (int i = 0; i < months.length; i++)
			if (months[i].equals(date[1])) {
				month = i + 1;
				break;
			}

		for (int i = 0; i < days.size(); i++)
			if (days.get(i).equals(date[0])) {
				day = i + 1;
				break;
			}

		StringBuffer dateBuffer = new StringBuffer();

		dateBuffer.append(year).append("-");
		
		if (month > 9)
			dateBuffer.append(month).append("-");
		else
			dateBuffer.append("0").append(month).append("-");

		if (day > 9)
			dateBuffer.append(day);
		else
			dateBuffer.append("0").append(day);

		return dateBuffer.toString();
	}

}
