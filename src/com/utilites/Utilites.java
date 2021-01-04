package com.utilites;

public class Utilites {

	public static int compareTo(Object o1, Object o2) {

		try {
			Integer obj1 = Integer.parseInt(o1.toString());
			Integer obj2 = Integer.parseInt(o2.toString());

			if (obj1 == obj2)
				return 0;
			else if (obj1 > obj2)
				return 1;
			else
				return -1;

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

		try {
			Integer obj1 = Integer.parseInt(o1.toString());
			Integer obj2 = Integer.parseInt(o2.toString());
			return obj1 == obj2;
		} catch (NumberFormatException e) {
			return (o1.toString().charAt(0) == o2.toString().charAt(0));
		}

	}

}
