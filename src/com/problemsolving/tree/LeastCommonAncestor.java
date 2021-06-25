package com.problemsolving.tree;

import java.util.ArrayList;
import java.util.List;

public class LeastCommonAncestor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int lca(TreeNode A, int B, int C) {
		int ans = 0;
		List<Integer> listB = getListForTree(A, new ArrayList<>(), B);
		List<Integer> listC = getListForTree(A, new ArrayList<>(), C);

		
		System.out.println();
		
		for (int b : listB)
			for (int c : listC)
				if (b == c)
					ans = b;
		return ans;
	}

	public List<Integer> getListForTree(TreeNode A, List<Integer> list, int x) {

		if (A.val == x)
			return list;

		list = new ArrayList<>(list);

		list.add(A.val);
		getListForTree(A.left, list, x);
		getListForTree(A.right, list, x);

		return list;
	}

}
