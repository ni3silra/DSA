package com.datastructure.list;

import java.util.Iterator;

public class LinkedList<E> implements List<E> {

	Node<E> node;
	static int size = 0;

	public LinkedList() {
		super();
		this.node = Node.createNode(null);
	}

	public LinkedList(E element) {
		super();
		this.node = Node.createNode(null);
		add(element);
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
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

	public Node<E> getNode(int index) {
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

	@Override
	public int getIndex(E element) throws Exception {
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

	@Override
	public void add(E element) {

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
	@Override
	public void delete(int index) {

		try {
			delete((E) getNode(index).getValue());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void delete(E element) throws Exception {

		int deletionIndex = getIndex(element);

		if (deletionIndex == 0)
			this.node = getNode(1);
		else if (deletionIndex == size - 1)
			getNode(deletionIndex - 1).setNextNode(null);
		else
			getNode(deletionIndex - 1).setNextNode(getNode(deletionIndex + 1));

		// getNode(deletionIndex).setValue(null);

		size--;

	}

	@Override
	public Object[] sort() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean contains(E element) {

		try {
			if (getIndex(element) != -1)
				return true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public String toString() {
		return "LinkedList [node=" + node.toString() + "]";
	}

}
