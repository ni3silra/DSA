package com.problemsolving.tree;

public class Diameter {

	public int solve(TreeNode A) {

		if (A == null)
			return -1;
		int sizeLst = getHight(A.left);
		int sizeRst = getHight(A.right);

		return (int) Math.max(Math.max(sizeLst + sizeRst + 2, solve(A.left)), solve(A.right));

	}

	public Info getDia(TreeNode A) {
		if (A == null)
			return new Info(-1, -1);
		int sizeLst = getHight(A.left);
		int sizeRst = getHight(A.right);

		return (int) Math.max(Math.max(sizeLst + sizeRst + 2, solve(A.left)), solve(A.right));
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
