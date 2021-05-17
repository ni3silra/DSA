package com.problemsolving.tree;

import java.util.ArrayList;

public class PreorderTraversal {

	ArrayList<Integer> ans;

	public ArrayList<Integer> preorderTraversal(TreeNode A) {
		ans = new ArrayList<>();
		preorderTraversal(A, ans);
		return ans;
	}

	private void preorderTraversal(TreeNode A, ArrayList<Integer> list) {
		if (A == null)
			return;

		list.add(A.val);
		preorderTraversal(A.left, list);
		preorderTraversal(A.right, list);
	}

}
