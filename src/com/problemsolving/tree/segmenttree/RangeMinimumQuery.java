package com.problemsolving.tree.segmenttree;

import java.util.*;

public class RangeMinimumQuery {

	ArrayList<Integer> input;
	int[] segmentTreeArray;

	public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
		int n = A.size();
		init(A);
		ArrayList<Integer> res = new ArrayList<>();
		for (ArrayList<Integer> l : B) {
			int key = l.get(0);
			switch (key) {
			case 0:
				int updIndex = l.get(1);
				int value = l.get(2);
				update(1, 0, n - 1, updIndex, value);
				break;
			case 1:
				int left = l.get(1);
				int right = l.get(2);
				int ans = query(1, 0, n - 1, left, right);
				res.add(ans);
				break;
			default:
				break;
			}
		}

		return res;
	}

	// initialization
	void init(ArrayList<Integer> A) {
		input = A;
		segmentTreeArray = new int[input.size() * 4];
		build(1, 0, input.size() - 1);
	}

	// build Segment Tree
	void build(int index, int start, int end) {
		if (start == end) {
			segmentTreeArray[index] = input.get(start);
			return;
		}

		int midIndex = (start + end) / 2;
		build(2 * index, start, midIndex);
		build(2 * index + 1, midIndex + 1, end);
		segmentTreeArray[index] = Math.min(segmentTreeArray[2 * index], segmentTreeArray[2 * index + 1]);
	}

	// fetch data from Segment Tree
	int query(int index, int start, int end, int left, int right) {
		if (end < left || right < start) {
			return Integer.MAX_VALUE;
		}
		if (left <= start && end <= right) {
			return segmentTreeArray[index];
		}

		int midIndex = (start + end) / 2;
		int l = query(2 * index, start, midIndex, left, right);
		int r = query(2 * index + 1, midIndex + 1, end, left, right);
		return Math.min(l, r);
	}

	// update data in Segment Tree
	void update(int index, int start, int end, int updIndex, int value) {
		if (start == end) {
			segmentTreeArray[index] = value;
			return;
		}
		int midIndex = (start + end) / 2;

		if (updIndex <= midIndex) {
			update(2 * index, start, midIndex, updIndex, value);
		} else {
			update(2 * index + 1, midIndex + 1, end, updIndex, value);
		}
		segmentTreeArray[index] = Math.min(segmentTreeArray[2 * index], segmentTreeArray[2 * index + 1]);
	}

}
