/*Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).

You may assume that the intervals were initially sorted according to their start times.
*/

package com.problemsolving.arrays;

import java.util.*;

public class MergeIntervals {

	public static void main(String[] args) {
		System.out.println(new MergeIntervals().insert(new ArrayList<>(List.of(new Interval(1, 3), new Interval(6, 9))),
				new Interval(2, 6)));
	}

	public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
		int n = intervals.size();
		int start = newInterval.start;
		int end = newInterval.end;

		for (int i = 0; i < n - 1; i++) {
			if (checkOverLap(start, end, intervals.get(i).start, intervals.get(i).end)) {
				intervals.add(i,
						new Interval(Math.min(start, intervals.get(i).start), Math.max(end, intervals.get(i).end)));
			}
		}
		return intervals;
	}

	boolean checkOverLap(int start1, int end1, int start2, int end2) {
		return (start1 >= start2 && end2 <= end1) || (start2 >= start1 && end1 <= end2)
				|| (start1 >= end2 && start1 >= start2) || (start2 >= end1 && start2 >= start1);
	}

	public ArrayList<Interval> merge(ArrayList<Interval> intervals, int index) {

		return intervals;
	}

}
