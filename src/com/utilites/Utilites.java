package com.utilites;

public class Utilites {

	public static int compareTo(Object o1, Object o2) {
		if (o1.equals(o2))
			return 0;
		else if ((o1 instanceof Number && o1 instanceof Number)
				&& (Integer.parseInt(o1.toString()) > Integer.parseInt(o2.toString())))
			return 1;
		else if ((o1 instanceof String && o1 instanceof String) && (o1.toString().charAt(0) > o2.toString().charAt(0)))
			return 1;
		else
			return -1;
	}

	public static boolean equals(Object o1, Object o2) {
		Integer obj1 = Integer.parseInt(o1.toString());
		Integer obj2 = Integer.parseInt(o2.toString());

		if (obj1 instanceof Number && obj2 instanceof Number)
			return obj1 == obj2;
		return (o1.toString().charAt(0) == o2.toString().charAt(0));
	}

}
