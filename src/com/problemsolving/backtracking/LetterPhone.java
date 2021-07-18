package com.problemsolving.backtracking;

import java.util.*;

public class LetterPhone {

	HashMap<Character, Character[]> letterMap;
	ArrayList<String> list;

	public static void main(String[] args) {
		new LetterPhone().letterCombinations("23");
	}

	public void letterCombinations(String A) {
		init();
		letterCombinationsUtil(A, 0, new StringBuffer());
		System.out.println(list);
	}

	void init() {
		list = new ArrayList<>();
		letterMap = new HashMap<>();
		letterMap.put('0', new Character[] { '0' });
		letterMap.put('1', new Character[] { '1' });
		letterMap.put('2', new Character[] { 'a', 'b', 'c' });
		letterMap.put('3', new Character[] { 'd', 'e', 'f' });
		letterMap.put('4', new Character[] { 'g', 'h', 'i' });
		letterMap.put('5', new Character[] { 'j', 'k', 'l' });
		letterMap.put('6', new Character[] { 'm', 'n', 'o' });
		letterMap.put('7', new Character[] { 'p', 'q', 'r', 's' });
		letterMap.put('8', new Character[] { 't', 'u', 'v' });
		letterMap.put('9', new Character[] { 'w', 'x', 'y', 'z' });
	}

	void letterCombinationsUtil(String A, int index, StringBuffer buffer) {
		if (index == A.length()) {
			list.add(buffer.toString());
			return;
		}
		char currentNum = A.charAt(index);
		Character[] charArray = letterMap.get(currentNum);

		for (char c : charArray) {
			buffer.append(c);
			letterCombinationsUtil(A, index + 1, buffer);
			buffer.deleteCharAt(buffer.length() - 1);
		}
	}

}
