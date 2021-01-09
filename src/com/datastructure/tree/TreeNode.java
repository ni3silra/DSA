package com.datastructure.tree;

public class TreeNode<E> {

	TreeNode<E> leftNode;
	E value;
	TreeNode<E> rightNode;

	public TreeNode() {
		super();
		this.value = null;
		this.leftNode = null;
		this.rightNode = null;
	}

	public TreeNode(E value) {
		super();
		this.value = value;
		this.leftNode = null;
		this.rightNode = null;
	}

	public TreeNode<E> getLeftNode() {
		return leftNode;
	}

	public TreeNode<E> setLeftNode(TreeNode<E> leftNode) {
		this.leftNode = leftNode;
		return this;
	}

	public E getValue() {
		return value;

	}

	public TreeNode<E> setValue(E value) {
		this.value = value;
		return this;
	}

	public TreeNode<E> getRightNode() {
		return rightNode;
	}

	public TreeNode<E> setRightNode(TreeNode<E> rightNode) {
		this.rightNode = rightNode;
		return this;
	}

	@Override
	public String toString() {
		String leftNodeString = leftNode != null ? leftNode.toString() : null;
		String rightNodeString = rightNode != null ? rightNode.toString() : null;
		return "[leftNode=" + leftNodeString + ", value=" + value + ", rightNode=" + rightNodeString + "]";
	}

}
