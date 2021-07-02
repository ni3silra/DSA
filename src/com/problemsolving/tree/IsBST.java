package com.problemsolving.tree;

public class IsBST {

	public boolean isBST(TreeNode node) {

		if (node == null)
			return true;

		if ((node.left.val < node.val 
				&& node.val < node.right.val) 
				&& isBST(node.left) 
				&& isBST(node.right))
			return true;
		return false;
	}

}
