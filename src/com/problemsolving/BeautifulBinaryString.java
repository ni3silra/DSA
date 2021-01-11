/*
 * Alice has a binary string. She thinks a binary string is beautiful if and only if it doesn't contain the substring .
 * In one step, Alice can change a  to a  or vice versa. Count and print the minimum number of steps needed to make Alice see the string as beautiful.
 */
package com.problemsolving;

public class BeautifulBinaryString {

	public static void main(String[] args) {
		String str = "0101010";
		System.out.println(beautifulBinaryString(str));

	}

	static int beautifulBinaryString(String b) {

		if (!b.contains("010"))
			return 0;
		else {
			String newString = b.replace("010", "Z");
			int countZ = 0;
			for (char c : newString.toCharArray())
				if (c == 'Z')
					countZ++;
			return countZ;
		}

	} // O(n)

}
