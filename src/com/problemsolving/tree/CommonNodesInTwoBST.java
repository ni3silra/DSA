package com.problemsolving.tree;

import java.util.HashSet;

public class CommonNodesInTwoBST {

	HashSet<Integer> set = new HashSet<>();
	long ans = 0;
	int mod = (int) Math.pow(10, 9) + 7;

	public int solve(TreeNode A, TreeNode B) {
		inorderTraversal(A);
		inorderTraversal(B);
		return (int) ans;
	}

	private void inorderTraversal(TreeNode A) {
		if (A == null)
			return;

		inorderTraversal(A.left);
		if (!set.add(A.val)) {
			ans += A.val;
			ans %= mod;
		}
		inorderTraversal(A.right);
	}

}
