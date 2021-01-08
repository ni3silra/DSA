package com.datastructure.stack;

import com.datastructure.list.*;

public class StackByLinkedList<E> implements Stack<E> {

	private LinkedList<E> list;

	public StackByLinkedList() {
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
			System.out.println(list.size());
			list.remove(list.size() - 1);
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
