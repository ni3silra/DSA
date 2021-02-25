package com.algorithms.recursion;

public class ReverseString {

	public static final String EM = "";

	String reverse(String string) {

		if (string.equals(""))
			return "";
		else
			return reverse(string.substring(1)) + string.charAt(0);

	} // O(n)

	char[] reverseStringByIteration(String string) {
		char reverseString[] = new char[string.length()];

		for (int i = 0; i < string.length(); i++) {
			reverseString[i] = string.charAt(string.length() - i - 1);
		}

		return reverseString;
	} // O(n)

	public static void main(String[] args) {
		ReverseString reverseString = new ReverseString();

		for (char out : reverseString.reverseStringByIteration("OyoY"))
			System.out.print(out);
		System.out.println("\n" + reverseString.reverse("YoYo"));
	}

}
