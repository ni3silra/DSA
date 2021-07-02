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

	public static TreeNode createTree(int[] arr) {
		TreeNode root = new TreeNode(arr[0]);

		return root;
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

}
