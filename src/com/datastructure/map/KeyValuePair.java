package com.datastructure.map;

public class KeyValuePair<K, V> {

	K key;
	V value;

	public KeyValuePair(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public KeyValuePair<K, V> setKey(K key) {
		this.key = key;
		return this;
	}

	public V getValue() {
		return value;
	}

	public KeyValuePair<K, V> setValue(V value) {
		this.value = value;
		return this;
	}

	@Override
	public String toString() {
		return "[key=" + key + ", value=" + value + "]";
	}

}
