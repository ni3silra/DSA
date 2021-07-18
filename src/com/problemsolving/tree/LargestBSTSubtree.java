package com.problemsolving.tree;

public class LargestBSTSubtree {
	public int largestBSTSubtree(TreeNode root) {
		return isBST(root).size;
	}

	Node isBST(TreeNode root) {
		Node node = new Node();

		if (root == null)
			return node;

		Node l = isBST(root.left);
		Node r = isBST(root.right);

		node.left = Math.min(l.left, root.val);
		node.right = Math.max(r.right, root.val);

		if (l.isBst && r.isBst && l.right <= root.val && r.left >= root.val) {
			node.size = l.size + r.size + 1;
			node.isBst = true;
		} else {
			node.size = Math.max(l.size, r.size);
			node.isBst = false;
		}

		return node;
	}

}

