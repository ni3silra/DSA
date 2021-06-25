package com.problemsolving.tree;

public class InvertTheBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	public TreeNode invertTree(TreeNode A) {
		TreeNode revertNode = A;
		return invertTreeUtil(revertNode);
	}

	public TreeNode invertTreeUtil(TreeNode root) {
		if (root != null) {
			TreeNode left = invertTreeUtil(root.left);
			TreeNode right = invertTreeUtil(root.right);
			root.left = right;
			root.right = left;
		}
		return root;
	}

}
