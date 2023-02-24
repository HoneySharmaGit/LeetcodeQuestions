package leetcode.easy;

import java.util.Arrays;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 7 };
		int[] arr2 = { 2, 4, 9 };
		int m = arr1.length;
		int n = arr2.length;

		int[] newArray = new int[m + n];

		for (int i = 0; i < m; i++) {
			newArray[i] = arr1[i];
		}

		for (int i = 0; i < n; i++) {
			newArray[i + m] = arr2[i];
		}

		Arrays.sort(newArray);
		for (int x : newArray) {
			System.out.print(x + " ");
		}

	}

}
