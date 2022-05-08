package com.problemsolving.tree;

public class InvertTheBinaryTree {

	public TreeNode invertTree(TreeNode A) {
		return A == null ? null :
				new TreeNode(A.val,invertTree(A.right),invertTree(A.left));
	}

}
