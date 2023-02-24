package leetcode.easy;

import java.util.Scanner;

public class SingleNumberInArray {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter the length of the array:");
		 int len = sc.nextInt();
		
		 int[] arr = new int[len];
		 for (int i = 0; i < arr.length; i++) {
		 arr[i] = sc.nextInt();
		 }
		 sc.close();

		// int[] arr = { 1, 2, 3, 3, 2, 1, 4 };

		int number = getSingleNumber(arr);
		System.out.println("Single number in the given array is: " + number);
	}

	public static int getSingleNumber(int[] arr) {
		int number = 0;
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 1) {
				number = arr[i];
			}
		}
		return number;
	}

}
