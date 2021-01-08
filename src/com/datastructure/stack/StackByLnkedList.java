package com.datastructure.stack;

import com.datastructure.list.LinkedList;
import com.datastructure.list.SinglyLinkedList;

public class StackByLnkedList<E> implements Stack<E> {

	private LinkedList<E> list;

	public StackByLnkedList() {
		super();
		list = new SinglyLinkedList<>();
	}

	@Override
	public boolean lookUp(E element) {
		return list.contains(element);
	}

	@Override
	public void pop() {
		try {
			list.remove(list.get(list.size() - 1));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void push(E element) {
		list.insert(element);
	}

	@Override
	public E peek() {
		return list.get(0);
	}

}
