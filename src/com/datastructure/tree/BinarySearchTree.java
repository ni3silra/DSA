package com.datastructure.tree;

import com.utilites.Utilities;

public class BinarySearchTree<E> implements Tree<E> {

	private TreeNode<E> node;
	private E element;
	private int size;

	public BinarySearchTree() {
		super();
		this.node = new TreeNode<E>();
	}

	@Override
	public void insert(E element) {
		this.element = element;
		if (node.getValue() == null)
			this.node = new TreeNode<E>(element);
		else
			insert(this.node);
		size++;
	}

	private int insert(TreeNode<E> node) {

		if (node.getValue() == null)
			node = new TreeNode<E>(element);
		else {
			if (Utilities.compareTo(node.getValue(), element) == 1) {
				if (node.getLeftNode() == null)
					node.setLeftNode(new TreeNode<>(element));
				else
					return insert(node.getLeftNode());
			} else {
				if (node.getRightNode() == null)
					node.setRightNode(new TreeNode<>(element));
				else
					return insert(node.getRightNode());
			}
		}
		return 0;
	}

	public boolean lookUp(E element) {
		return false;
	}

	@Override
	public String toString() {
		return "BinarySearchTree [rootNode=" + node.toString() + "]";
	}

}
