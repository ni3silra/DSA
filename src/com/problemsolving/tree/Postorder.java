package com.problemsolving.tree;

import java.util.ArrayList;

public class Postorder {

	ArrayList<Integer> ans;

	public ArrayList<Integer> postorderTraversal(TreeNode A) {
		ans = new ArrayList<>();
		postorderTraversal(A, ans);
		return ans;
	}

	private void postorderTraversal(TreeNode A, ArrayList<Integer> list) {
		if (A == null)
			return;

		postorderTraversal(A.left, list);
		postorderTraversal(A.right, list);
		list.add(A.val);
	}

}
