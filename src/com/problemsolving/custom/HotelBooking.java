package com.problemsolving.custom;

import java.util.*;

public class HotelBooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {

		Collections.sort(arrive);
		Collections.sort(depart);

		int arrived = 0, departed = 0, required = K;

		while (arrived < arrive.size() && departed < depart.size()) {
			if (arrive.get(arrived) < depart.get(departed)) {
				arrived++;
				required--;
			} else if (arrive.get(arrived) == depart.get(departed)) {
				arrived++;
				departed++;
			} else {
				departed++;
				required++;
			}

			if (required < 0)
				return false;
		}

		return true;
	}

}

class Booking implements Comparator<Booking> {
	int time;
	boolean indicator;

	public Booking() {
	}

	public Booking(int time, boolean indicator) {
		this.time = time;
		this.indicator = indicator;
	}

	public int getTime() {
		return time;
	}

	public boolean getIndicator() {
		return indicator;
	}

	public int compare(Booking b1, Booking b2) {
		int t1 = b1.getTime();
		int t2 = b2.getTime();

		if (t1 == t2)
			return 0;
		else if (t1 > t2)
			return 1;
		else
			return -1;

	}

}
