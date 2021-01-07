package com.datastructure.list;

public interface LinkedList<E> {

	public E get(int index);

	public void insert(E element);

	public void remove(int index);

	public void remove(E element) throws Exception;

	public boolean contains(E element);

	public int size();

	public String toString();

}
