package com.datastructure.map;

public class HashTable<K, V> implements Map<K, V> {

	private KeyValuePair<K, V>[] map;

	@SuppressWarnings("unchecked")
	public HashTable() {
		super();
		this.map = new KeyValuePair[50];
	}

	private int getHash(K key) {
		int hash = 0;
		if (key instanceof Number)
			hash = Integer.parseInt(key.toString()) % map.length;
		else if (key instanceof CharSequence)
			for (int i = 0; i < ((String) key).length(); i++) {
				hash = (hash + ((String) key).charAt(i) * i) % map.length;
			}
		else if (key instanceof Object) {
			// to do
		}
		return hash;
	} // It always fast so we can assume it is O(1)

	@Override
	public boolean put(K key, V value) {
		boolean isSuccessfull = false;
		int index = getHash(key);
		KeyValuePair<K, V> pair = new KeyValuePair<K, V>(key, value);
		map[index] = pair.setKey(key).setValue(value);
		return isSuccessfull;
	}// O(1)

	@Override
	public V get(K key) {
		return map[getHash(key)].getValue();
	}// O(1)

	@Override
	public Object[] keys() {
		int counter = 0;
		for (KeyValuePair<K, V> pair : map)
			if (pair != null)
				counter++;

		Object[] keys = new Object[counter];

		counter = 0;

		for (int i = 0; i < map.length; i++) {
			if (map[i] != null)
				keys[counter++] = map[i].getKey();
		}

		return keys;
	}// O(n)

	@Override
	public boolean containsKey(K key) {
		for (Object obj : keys())
			if (key.equals(obj))
				return true;
		return false;
	} // O(n)
}
