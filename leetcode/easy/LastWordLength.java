package leetcode.easy;

import java.util.Scanner;
import java.util.StringTokenizer;

public class LastWordLength {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String:");
		String st = sc.nextLine();
		sc.close();

		String token = "";
		StringTokenizer stk = new StringTokenizer(st, "[^ !@#$%&*()_+-=[]{};:'\".,<>?/]");
		while (stk.hasMoreTokens()) {
			token = stk.nextToken();
		}

		System.out.println("the length of the last word from the given String is: " + token.length());

	}

}
