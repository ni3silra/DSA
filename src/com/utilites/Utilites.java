package com.utilites;

public class Utilites {

	public static int compareTo(Object o1, Object o2) {
		if (o1.equals(o2))
			return 0;
		else if (o1.toString().charAt(0) > o2.toString().charAt(0))
			return 1;
		else
			return -1;
	}

	public static boolean equals(Object o1, Object o2) {
		return (o1.toString().charAt(0) == o2.toString().charAt(0));
	}

}
