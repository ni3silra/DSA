package com.datastructure.list;

import java.util.Iterator;

import com.datastructure.array.Arrays;

public class ArrayList<E> implements List<E> {

	Object[] list;
	int currentIndex;

	public ArrayList() {
		super();
		list = new Object[INITIAL_SIZE];
		currentIndex = 0;
	}

	@SuppressWarnings("unchecked")
	@Override
	public E get(int index) {
		return (E) list[index];
	}

	@Override
	public void add(E element) {

		if (currentIndex == list.length) {

			Object[] tempList = new Object[currentIndex];

			tempList = list;

			list = new Object[list.length + VARIABLE_SIZE];

			for (int i = 0; i < currentIndex; i++)
				list[i] = tempList[i];

			tempList = null;
		}

		list[currentIndex++] = element;

	}

	@Override
	public int getIndex(E element) throws Exception {

		for (int i = 0; i < list.length; i++)
			if (list[i] == element)
				return i;

		throw new Exception("ElemenNotFoundExecption");
	}

	@Override
	public Object[] sort() {
		return Arrays.sort(list);
	}

	@Override
	public int size() {
		int size = 0;
		for (Object obj : list)
			if (obj != null)
				size++;
		return size;
	}

	@Override
	public void delete(int index) {
		list = Arrays.delete(list, index);
	}

	@Override
	public void delete(E element) throws Exception {
		list = Arrays.delete(list, getIndex(element));
	}

	public boolean contains(E element) {

		return Arrays.contains(nullFilterList(), element);
	}

	@Override
	public String toString() {

		return Arrays.toString(nullFilterList());
	}

	private Object[] nullFilterList() {
		Object[] outList = new Object[size()];
		int counter = 0;
		for (int i = 0; i < list.length; i++) {
			if (list[i] != null)
				outList[counter++] = list[i];
		}
		return outList;
	}

	@Override
	public Iterator<E> iterator() {
		return null;
	}

}
