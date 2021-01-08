package com.datastructure.queue;

public interface Queue<E> {

	public boolean lookUp(E element);

	public void enqueue(E element);

	public void dequeue();

	public E peek();
}
