package com.problemsolving.arrays;

import java.util.*;

public class MergeOverlappingIntervals {

	public static void main(String[] args) {
		System.out.println(new MergeOverlappingIntervals().merge(new ArrayList<Interval>(
				List.of(new Interval(2, 6), new Interval(1, 4), new Interval(6, 10), new Interval(15, 18)))));
	} // 1,6 8,10 15,18

	public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
		int n = intervals.size();
		sort(intervals);
		System.out.println(intervals);
		Stack<Interval> res = new Stack<>();
		res.push(intervals.get(0));
		for (int i = 1; i < n; i++) {
			Interval existingInterval = res.peek();
			Interval currentInterval = intervals.get(i);

			if (existingInterval.end >= currentInterval.start) {
				res.pop();
				res.push(new Interval(existingInterval.start, Math.max(existingInterval.end, currentInterval.end)));
			} else {
				res.push(currentInterval);
			}
		}

		ArrayList<Interval> ans = new ArrayList<>();

		for (Interval in : res)
			ans.add(in);
		return ans;
	}

	void sort(ArrayList<Interval> intervals) {
		Collections.sort(intervals, new Comparator<Interval>() {
			public int compare(Interval i1, Interval i2) {
				return i1.start - i2.start;
			}
		});
	}

}

class Interval {
	int start;
	int end;

	Interval() {
		start = 0;
		end = 0;
	}

	Interval(int s, int e) {
		start = s;
		end = e;
	}

	@Override
	public String toString() {
		return "Interval [start=" + start + ", end=" + end + "]";
	}

}
