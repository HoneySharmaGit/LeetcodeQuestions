package leetcode.easy;

import java.util.ArrayList;
import java.util.Scanner;

public class TwoSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the array: ");
		int len = sc.nextInt();

		int[] arr = new int[len];
		System.out.println("Enter the element into the array:");
		for (int i = 0; i < len; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the number(sum): ");
		int target = sc.nextInt();
		sc.close();

		ArrayList<Integer> index = getIndex(arr, target);

		if (index.size() == 0) {
			System.out.println("no index found!");
		} else {
			System.out.println("array of index is: " + index);
		}

	}

	public static ArrayList<Integer> getIndex(int[] arr, int target) {
		ArrayList<Integer> index = new ArrayList<Integer>();
		int flag = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] + arr[i] == target) {
					index.add(i);
					index.add(j);
					break;
				}
			}
		}
		return index;
	}

}
