package com.problemsolving.tree;

public class ValidBinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	public int isValidBST2(TreeNode A) {

		if (A == null)
			return 1;

		Integer value = A.val;
		TreeNode left = A.left;
		TreeNode right = A.right;

		if (left != null && value < left.val)
			return 0;

		if (right != null && value > right.val)
			return 0;

		if (isValidBST(left) == 0 || isValidBST(right) == 0)
			return 0;

		return 1;
	}

	public int isValidBST(TreeNode a) {
		return isBSTUtil(a, Integer.MIN_VALUE, Integer.MAX_VALUE) ? 1 : 0;
	}

	boolean isBSTUtil(TreeNode node, int min, int max) {
		if (node == null)
			return true;
		if (node.val < min || node.val > max)
			return false;
		return (isBSTUtil(node.left, min, node.val - 1) && isBSTUtil(node.right, node.val + 1, max));
	}

}
