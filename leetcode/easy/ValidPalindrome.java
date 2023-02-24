package leetcode.easy;

import java.util.*;

public class ValidPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string: ");
		String st = sc.nextLine().toLowerCase();
		sc.close();

		String big = "";

		StringTokenizer stk = new StringTokenizer(st, "[^ !@#$%&*()_+-=[]{};:'\".,<>?/]");
		while (stk.hasMoreTokens()) {
			String token = stk.nextToken();
			big = big + token;
		}

		boolean pal = checkString(big);
		if (pal) {
			System.out.println("the given string is Palindrome.");
		} else {
			System.out.println("the given string is not Palindrome.");
		}

	}

	public static boolean checkString(String big) {
		if (big.length() == 0) {
			return true;
		}

		String pal = "";
		int i = big.length() - 1;
		while (i >= 0) {
			char ch = big.charAt(i);
			pal = pal + ch;
			i--;
		}
		if (pal.equals(big)) {
			return true;
		}
		return false;
	}

}
