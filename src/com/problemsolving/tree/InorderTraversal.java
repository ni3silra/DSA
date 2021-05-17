package com.problemsolving.tree;

import java.util.ArrayList;

public class InorderTraversal {

	ArrayList<Integer> ans;

	public ArrayList<Integer> inorderTraversal(TreeNode A) {
		ans = new ArrayList<>();
		inorderTraversal(A, ans);
		return ans;
	}

	private void inorderTraversal(TreeNode A, ArrayList<Integer> list) {
		if (A == null) {
			return;
		}

		inorderTraversal(A.left, list);
		list.add(A.val);
		inorderTraversal(A.right, list);
	}

}
