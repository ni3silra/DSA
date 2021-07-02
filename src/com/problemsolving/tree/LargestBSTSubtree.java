package com.problemsolving.tree;

public class LargestBSTSubtree {

	public int solve(TreeNode A) {
		return getTreeInfo(A).maxBSTSize;
	}

	public TreeInfo getTreeInfo(TreeNode A) {
		if (A == null)
			return new TreeInfo(0, Integer.MAX_VALUE, Integer.MIN_VALUE, 0, true);

		TreeInfo leftTreeInfo = getTreeInfo(A.left);
		TreeInfo rightTreeInfo = getTreeInfo(A.right);

		if (leftTreeInfo.isBST && rightTreeInfo.isBST) {
			if (leftTreeInfo.maxiElement < A.val && rightTreeInfo.miniElement > A.val) {
				return new TreeInfo(1 + Math.max(leftTreeInfo.size, rightTreeInfo.size),
						Math.min(Math.min(A.val, leftTreeInfo.miniElement), rightTreeInfo.miniElement),
						Math.max(Math.max(A.val, leftTreeInfo.maxiElement), rightTreeInfo.maxiElement),
						1 + Math.max(leftTreeInfo.size, rightTreeInfo.size), true);
			}
		}

		return new TreeInfo(0, Integer.MAX_VALUE, Integer.MIN_VALUE, 0, false);
	}

}
