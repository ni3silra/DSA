package com.problemsolving.tree;

public class BalancedBinaryTree {

	public static void main(String[] args) {
		System.out.println(new BalancedBinaryTree().isBalanced(null));
	}

	public int isBalanced(TreeNode A) {
		return isBalancedUtil(A).isBST ? 1 : 0;
	}

	public TreeInfo isBalancedUtil(TreeNode A) {
		if (A == null)
			return new TreeInfo(-1, true);
		TreeInfo left = isBalancedUtil(A.left);
		TreeInfo right = isBalancedUtil(A.right);
		boolean isBST = Math.abs(left.size - right.size) <=1 && left.isBST && right.isBST;
		return new TreeInfo(Math.max(left.size, right.size) + 1, isBST);

	}

	public TreeInfo isBalanceUtil(){

		// h(l) - h(r) != 2

		return null;
	}


}
