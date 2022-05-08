package com.datastructure.trie;

import java.util.HashMap;

public class TrieNode {
	HashMap<Character, TrieNode> edge;
	boolean isEnd;

	public TrieNode(Character ch) {
		edge = new HashMap<>();
		edge.put(ch, null);
	}

	public boolean search(TrieNode node, String s) {
		for (char c : s.toCharArray()) {
			if (node.edge.get(c) == null)
				return false;
			node = node.edge.get(c);
		}
		return node.isEnd;
	}

	public void insert(TrieNode node, String s) {
		for (char c : s.toCharArray()) {
			node.edge.putIfAbsent(c, null);
			node = node.edge.get(c);
		}
		node.isEnd = true;
	}

}
