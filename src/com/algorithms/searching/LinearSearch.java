package com.algorithms.searching;

import com.utilites.Utilities;

public class LinearSearch implements Search {

	Object[] array;

	public LinearSearch(Object[] array) {
		super();
		this.array = array;
	}

	@Override
	public boolean find(Object o) {
		
		for (int i = 0; i < array.length; i++)
			if (Utilities.equals(array[i], o))
				return true;

		return false;
	}

}
