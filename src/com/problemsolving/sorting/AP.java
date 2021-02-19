package com.problemsolving.sorting;

import java.util.*;

public class AP {

	public static void main(String[] args) {
		int[] a1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] b1 = { 10, 13, 11, 14, 15, 12, 13, 13, 18, 13 }; // {1,2,2}

		ArrayList<Integer> A = new ArrayList<>();

		for (int i : a1)
			A.add(i);
		ArrayList<Integer> B = new ArrayList<>();
		for (int i : b1)
			B.add(i);

		System.out.println(new AP().solve(A, B));
	}

	public int solve(ArrayList<Integer> A, ArrayList<Integer> B) {
		int minimumCost = Integer.MAX_VALUE;

		ArrayList<Tree> trees = new ArrayList<>();

		for (int i = 0; i < A.size(); i++) {
			Tree newTree = new Tree(A.get(i), B.get(i));
			if (!trees.contains(newTree)) {
				trees.add(newTree);
				System.out.println(newTree.toString());
			}
		}

		Collections.sort(trees, new SortTreeByPrice());

		if (trees.size() >= 3) {
			for (int i = 2; i < trees.size(); i++) {
				int newCost = trees.get(i - 2).getCost() + trees.get(i - 1).getCost() + trees.get(i).getCost();
				if (minimumCost > newCost) {
					minimumCost = newCost;
				}
			}
		}

		else {
			minimumCost = -1;
		}

		return minimumCost;
	}

}

class Tree {
	int height;
	int cost;

	public Tree(int height, int cost) {
		this.height = height;
		this.cost = cost;
	}

	public int getHeight() {
		return height;
	}

	public int getCost() {
		return cost;
	}

	@Override
	public boolean equals(Object t) {
		if (t instanceof Tree) {
			Tree tree = (Tree) t;
			if (this.getHeight() == tree.getHeight())
				return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Tree [height=" + height + ", cost=" + cost + "]";
	}

}

class SortTreeByHeight implements Comparator<Tree> {
	@Override
	public int compare(Tree t1, Tree t2) {
		return t1.getHeight() - t2.getHeight();
	}

}

class SortTreeByPrice implements Comparator<Tree> {
	@Override
	public int compare(Tree t1, Tree t2) {
		return t1.getCost() - t2.getCost();
	}

}
