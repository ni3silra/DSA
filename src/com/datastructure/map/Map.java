package com.datastructure.map;

public interface Map<K, V> {

	public V get(K key);

	public Object[] keys();

	public boolean containsKey(K key);

	boolean put(K key, V value);

}
