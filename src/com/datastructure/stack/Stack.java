package com.datastructure.stack;

public interface Stack<E> {

	public boolean lookUp(E element);

	public void pop();

	public void push(E element);

	public E peek();

}
