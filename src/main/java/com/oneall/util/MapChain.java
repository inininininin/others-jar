package com.oneall.util;

import java.util.Map;

public class MapChain<K, V> {

	public Map<K, V> map = null;

	public MapChain(Map<K, V> map) {
		super();
		this.map = map;
	}

	public MapChain<K, V> put(K key, V value) {
		map.put(key, value);
		return this;
	}

	public V get(K key) {
		return map.get(key);
	}
}
