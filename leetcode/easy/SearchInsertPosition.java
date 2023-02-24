package leetcode.easy;

import java.util.Scanner;

public class SearchInsertPosition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lenght of the array: ");
		int len = sc.nextInt();
		int[] arr = new int[len];
		System.out.println("Enter the elements into the array:");
		for (int i = 0; i < len; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the number for it's position: ");
		int target = sc.nextInt();
		sc.close();

		if (target > arr[len - 1]) {
			System.out.println("not possible!");
		} else {
			int index = getIndex(arr, target);
			System.out.println("index is or will be: " + index);
		}

	}

	public static int getIndex(int[] arr, int target) {
		int min = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}
			if (arr[i] < target) {
				min = i;
			}
		}
		return min + 1;
	}

}
