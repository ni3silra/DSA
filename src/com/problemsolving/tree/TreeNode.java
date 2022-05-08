package com.problemsolving.tree;

public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	public TreeNode(int x) {
		val = x;
		left = null;
		right = null;
	}

    public TreeNode(int val, TreeNode left, TreeNode right) {
		this.val =val;
		this.left = left;
		this.right = right;
    }

	public TreeNode() {
	}
}

class Node {
	int size;
	int left, right;
	boolean isBst;

	Node() {
		size = 0;
		isBst = true;
		left = Integer.MAX_VALUE;
		right = Integer.MIN_VALUE;
	}
}

class TreeInfo {
	int size;
	int miniElement;
	int maxiElement;
	int maxBSTSize;
	boolean isBST;

	public TreeInfo(int size, int miniElement, int maxiElement, int maxBSTSize, boolean isBST) {
		super();
		this.size = size;
		this.miniElement = miniElement;
		this.maxiElement = maxiElement;
		this.maxBSTSize = maxBSTSize;
		this.isBST = isBST;
	}

	public TreeInfo(int size, boolean isBST) {
		super();
		this.size = size;
		this.isBST = isBST;
	}

}
