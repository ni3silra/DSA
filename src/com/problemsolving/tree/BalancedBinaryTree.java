package com.problemsolving.tree;

public class BalancedBinaryTree {

	public static void main(String[] args) {
		System.out.println();
	}

	public int isBalanced(TreeNode A) {
		return isBalancedUtil(A).isBST ? 1 : 0;
	}

	public TreeInfo isBalancedUtil(TreeNode A) {
		if (A == null)
			return new TreeInfo(-1, true);
		TreeInfo left = isBalancedUtil(A.left);
		TreeInfo right = isBalancedUtil(A.right);
		boolean isBST = (left.size == right.size) && left.isBST && right.isBST;
		return new TreeInfo(Math.max(left.size, right.size) + 1, isBST);

	}

}
