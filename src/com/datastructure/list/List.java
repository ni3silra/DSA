package com.datastructure.list;

public interface List<E> {

	int INITIAL_SIZE = 5;
	int VARIABLE_SIZE = 2;

	E get(int index);

	int getIndex(E element) throws Exception;

	void add(E element);

	void delete(int index);

	void delete(E element) throws Exception;

	Object[] sort();

	int size();

}
