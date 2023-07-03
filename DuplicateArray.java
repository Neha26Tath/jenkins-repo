package com.csi.palindrome;

public class DuplicateArray {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 2, 5, 4, 7, 6, 7 };
		System.out.println("duplicate elements in the array:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[j]);
				}
			}

		}
	}

}
