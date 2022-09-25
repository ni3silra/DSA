package com.datastructure.stack;

public interface Stack<E> {

	public void pop();

	public void push(E element);

	public E peek();

	public int size();

	public boolean isEmpty();
}
