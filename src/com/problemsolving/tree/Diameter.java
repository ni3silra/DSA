package com.problemsolving.tree;

public class Diameter {

	public int solve(TreeNode A) {
		if (A == null)
			return -1;
		int sizeLst = getHight(A.left);
		int sizeRst = getHight(A.right);
		return (int) Math.max(Math.max(sizeLst + sizeRst + 2, solve(A.left)), solve(A.right));
	}

	public Info treeUtils(TreeNode A) {
		if (A == null)
			return new Info(-1, -1);
		Info l = treeUtils(A.left);
		Info r = treeUtils(A.right);
		return new Info(Math.max(l.hight, r.hight), Math.max(Math.max(l.hight + r.hight + 2, l.diameter), r.diameter));
	}

	public int getHight(TreeNode node) {
		if (node == null)
			return -1;
		return 1 + Math.max(getHight(node.left), getHight(node.right));
	}

}

class Info {
	int hight;
	int diameter;

	public Info(int hight, int diameter) {
		super();
		this.hight = hight;
		this.diameter = diameter;
	}
}
