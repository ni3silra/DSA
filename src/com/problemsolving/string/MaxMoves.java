package com.problemsolving.string;

public class MaxMoves {

	public static void main(String[] args) {
		System.out.println(maxMoves(
				"fdzrwwkfowojhqrtmvaxhvxzsgtjcdqxsboqhgxiuveavhpgfknuvioxrulqddrwwqgbfzdfyafdzrwwkfowojhqrtmvaxhvxzsgtjcdqxsboqhgxiuveavhpgfknuvioxrulqddrwwqgbfzdfyafdzrwwkfowojhqrtmvaxhvxzsgtjcdqxsboqhgxiuveavhpgfknuvioxrulqddrwwqgbfzdfyafdzrwwkfowojhqrtmvaxhvxzsgtjcdqxsboqhgxiuveavhpgfknuvioxrulqddrwwqgbfzdfyafdzrwwkfowojhqrtmvaxhvxzsgtjcdqxsboqhgxiuveavhpgfknuvioxrulqddrwwqgbfzdfyafdzrwwkfowojhqrtmvaxhvxzsgtjcdqxsboqhgxiuveavhpgfknuvioxrulqddrwwqgbfzdfyafdzrwwkfowojhqrtmvaxhvxzsgtjcdqxsboqhgxiuveavhpgfknuvioxrulqddrwwqgbfzdfyafdzrwwkfowojhqrtmvaxhvxzsgtjcdqxsboqhgxiuveavhpgfknuvioxrulqddrwwqgbfzdfyafdzrwwkfowojhqrtmvaxhvxzsgtjcdqxsboqhgxiuveavhpgfknuvioxrulqddrwwqgbfzdfyafdzrwwkfowojhqrtmvaxhvxzsfdzrwwkfowojhqrtmvaxhvxzsfdzrwwkfowojhqrtmvaxhvxzsfdzrwwkfowojhqrtmvaxhvxzsfdzrwwkfowojhqrtmvaxhvxzsfdzrwwkfowojhqrtmvaxhvxzsfdzrwwkfowojhqrtmvaxhvxzsfdzrwwkfowojhqrtmvaxhvxzsfdzrwwkfowojhqrtmvaxhvxzsn",
				"fdzrwwkfowojhqrtmvaxhvxzsgtjcdqxsboqhgxiuveavhpgfknuvioxrulqddrwwqgbfzdfyafdzrwwkfowojhqrtmvaxhvxzs"));
	}

	public static int maxMoves(String s, String t) {
		int left2right = countMove(s, t);
		String revS = new StringBuffer(s).reverse().toString();
		int right2left = countMove(revS, t);
		return left2right > right2left ? left2right : right2left;
	}

	public static int countMove(String s, String t) {
		int total = 0;

		if (s == null || s.equals("") || t == null || t.equals(""))
			return 0;

		while (s.contains(t)) {
			total++;
			int delIndex = s.indexOf(t);
			s = s.substring(0, delIndex) + s.substring(delIndex + t.length(), s.length());
		}

		return total;
	}

}
