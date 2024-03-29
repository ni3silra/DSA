package com.utilites;

public class Utilities {

	public static int compareTo(Object o1, Object o2) {

		if (o1 == null || o2 == null)
			return -2;

		try {
			int obj1 = Integer.parseInt(o1.toString());
			int obj2 = Integer.parseInt(o2.toString());

			return Integer.compare(obj1, obj2);

		} catch (NumberFormatException e) {

			if (o1.equals(o2))
				return 0;
			else if (o1.toString().charAt(0) > o2.toString().charAt(0))
				return 1;
			else
				return -1;
		}

	}

	public static boolean equals(Object o1, Object o2) {

		if (o1 == null || o2 == null)
			return false;

		try {
			int obj1 = Integer.parseInt(o1.toString());
			int obj2 = Integer.parseInt(o2.toString());
			return obj1 == obj2;
		} catch (NumberFormatException e) {
			return (o1.toString().charAt(0) == o2.toString().charAt(0));
		}

	}

}
