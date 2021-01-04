package com.algorithms.searching;

import com.utilites.Utilites;

public class LinearSearch implements Search {

	Object[] array;

	public LinearSearch(Object[] array) {
		super();
		this.array = array;
	}

	@Override
	public boolean search(Object o) {
		
		for (int i = 0; i < array.length; i++)
			if (Utilites.equals(array[i], o))
				return true;

		return false;
	}

}
