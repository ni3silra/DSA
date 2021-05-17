package com.problemsolving.tree;

public class SizeOfTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int getHight(TreeNode node) {
		if (node == null)
			return -1;
		return 1 + Math.max(getHight(node.left), getHight(node.right));
	}

}
