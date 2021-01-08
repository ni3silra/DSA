package com.datastructure.queue;

import com.datastructure.list.*;

public class QueueByLinkedList<E> implements Queue<E> {

	private LinkedList<E> list;

	public QueueByLinkedList() {
		super();
		list = new SinglyLinkedList<>();
	}

	@Override
	public boolean lookUp(E element) {
		return list.contains(element);
	}

	@Override
	public void enqueue(E element) {
		list.insert(element);
	}

	@Override
	public void dequeue() {
		try {
			list.remove(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public E peek() {
		return list.get(0);
	}
}
