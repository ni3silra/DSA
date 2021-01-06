package com.datastructure.list;

public class Node<E> {
	E value;
	Node<E> nextNode;

	public Node(E value) {
		super();
		this.value = value;
	}

	public static <E> Node<E> createNode(E value) {
		return new Node<E>(value);
	}

	public Object getValue() {
		return value;
	}

	public Node<E> setValue(E value) {
		this.value = value;
		return this;
	}

	public Node<E> getNextNode() {
		return nextNode;
	}

	public Node<E> setNextNode(Node<E> nextNode) {
		this.nextNode = nextNode;
		return this;
	}

	@Override
	public String toString() {
		String nextNodeString = nextNode != null ? nextNode.toString() : null;
		return "[value=" + value + ", nextNode=" + nextNodeString + "]";
	}

}
