package com.datastructure.list;

public class SinglyLinkedList<E> implements LinkedList<E> {

	Node<E> node;
	private static int size = 0;

	public SinglyLinkedList() {
		super();
		this.node = Node.createNode(null);
	}

	public SinglyLinkedList(E element) {
		this();
		insert(element);
	}

	@SuppressWarnings("unchecked")
	public E get(int index) {
		int initial = 0;
		Node<E> currentNode = this.node;
		while (initial < size) {

			if (initial == index)
				return (E) currentNode.getValue();

			currentNode = currentNode.getNextNode();
			initial++;
		}
		return null;
	}

	private Node<E> getNode(int index) {
		int initial = 0;
		Node<E> currentNode = this.node;
		while (initial < size) {

			if (initial == index)
				return currentNode;

			currentNode = currentNode.getNextNode();
			initial++;
		}
		return null;
	}

	private int getIndex(E element) throws Exception {
		int index = 0;
		Node<E> currentNode = this.node;

		while (currentNode != null) {
			if (element.equals(currentNode.getValue()))
				return index;
			currentNode = currentNode.getNextNode();
			index++;
		}
		return -1;
	}

	public void insert(E element) {

		Node<E> newNode = Node.createNode(element).setNextNode(null);

		if (node.getValue() == null)
			node = newNode;
		else {
			Node<E> currentNode = this.node;
			while (currentNode.getNextNode() != null)
				currentNode = currentNode.getNextNode();
			currentNode.setNextNode(newNode);
		}
		size++;
	}

	@SuppressWarnings("unchecked")

	public void remove(int index) {
		try {
			remove((E) getNode(index).getValue());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void remove(E element) throws Exception {

		int deletionIndex = getIndex(element);

		if (deletionIndex == 0)
			this.node = getNode(1);
		else if (deletionIndex == size - 1)
			getNode(deletionIndex - 1).setNextNode(null);
		else
			getNode(deletionIndex - 1).setNextNode(getNode(deletionIndex + 1));

		size--;

	}

	public boolean contains(E element) {
		try {
			if (getIndex(element) != -1)
				return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public int size() {
		return size;
	}

	public String toString() {
		return "LinkedList [node=" + node.toString() + "]";
	}

}
