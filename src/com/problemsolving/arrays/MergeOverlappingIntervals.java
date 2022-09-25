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
		Collections.sort(intervals, Comparator.comparingInt(i -> i.start));
	}

	public int[][] merge(int[][] intervals) {
		if (intervals == null || intervals.length <= 1) return intervals;

		// otherwise sort the interval on basis of start index using comparator.
		Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[0]));

		List<int[]> outputList = new ArrayList<>();
		int[] currInterval = intervals[0];
		outputList.add(currInterval);

		for (int[] intrvl : intervals) {
			int currBegin = currInterval[0];
			int currEnd = currInterval[1];
			int nextBegin = intrvl[0];
			int nextEnd = intrvl[1];

			if (currEnd >= nextBegin) {
				currInterval[1] = Math.max(currEnd, nextEnd);
			} else {
				currInterval = intrvl;
				outputList.add(currInterval);
			}
		}

		return outputList.toArray(new int[outputList.size()][]);
	}

}

