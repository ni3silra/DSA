package com.problemsolving.hashing;

import java.util.*;

public class PerfectCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	public String solve(ArrayList<Integer> A) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i : A) {
			if (map.get(i) == null)
				map.put(i, 1);
			else
				map.put(i, map.get(i) + 1);
		}

		int common = map.get(A.get(0));
		boolean check = true;
		if (map.keySet().size() == 2) {
			for (int i : map.keySet())
				if (map.get(i) != common) {
					check = false;
					break;
				}
		} else {
			check = false;
		}

		if (check)
			return "WIN";
		return "LOSE";

	}

}
