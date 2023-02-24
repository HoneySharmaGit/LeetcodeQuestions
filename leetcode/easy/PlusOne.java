package leetcode.easy;

public class PlusOne {

	public static void main(String[] args) {
		int[] arr = { 9, 9, 8, 9 };
		int flag = 0;
		int[] newArray = new int[arr.length + 1];
		for (int i = arr.length - 1; i >= 0; i--) {
			flag = 0;
			if (arr[i] < 9) {
				arr[i] = arr[i] + 1;
				break;

			} else {
				arr[i] = 0;
				flag = 1;
			}
		}

		if (flag != 0) {
			newArray[0] = 1;
			System.out.println("the new array of number is:");
			for (int x : newArray) {
				System.out.print(x + " ");
			}
		} else {
			System.out.println("the new array of number is:");
			for (int x : arr) {
				System.out.print(x + " ");
			}
		}

	}

}
