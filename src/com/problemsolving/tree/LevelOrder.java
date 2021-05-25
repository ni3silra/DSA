package com.problemsolving.tree;

import java.util.*;

public class LevelOrder {
	public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<>();
		ArrayList<ArrayList<Integer>> levelOrder = new ArrayList<>();

		if (root == null)
			return levelOrder;

		queue.add(root);

		while (!queue.isEmpty()) {
			int count = queue.size();
			ArrayList<Integer> levelList = new ArrayList<>();
			for (int i = 0; i < count; i++) {
				TreeNode popped = queue.poll();
				levelList.add(popped.val);
				if (popped.left != null)
					queue.add(popped.left);
				if (popped.right != null)
					queue.add(popped.right);
			}
			levelOrder.add(levelList);
		}

		return levelOrder;
	}
}
