package com.datastructure.list;

import java.util.Iterator;

public class LinkedList<E> implements List<E> {

	Node<E> node;
	static int size = 0;

	public LinkedList() {
		super();
		this.node = Node.createNode(null);
	}

//	public LinkedList(E element) {
//		super();
//		this.node = Node.createNode(null);
//		add(element);
//	}

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

	@Override
	public int getIndex(E element) throws Exception {
		int index = 0;
		Node<E> currentNode = this.node;

		while (currentNode.getNextNode() != null) {
			if (element.equals(currentNode.getValue()))
				return index;
			currentNode = currentNode.getNextNode();
			index++;
		}

		return index;
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

	@Override
	public void delete(int index) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(E element) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public Object[] sort() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean contains(E element) {
		// TODO Auto-generated method stub
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
