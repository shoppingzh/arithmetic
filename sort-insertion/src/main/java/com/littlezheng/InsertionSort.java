package com.littlezheng;

import java.util.Arrays;

public class InsertionSort {
	
	static int[] arr = { 12, 6, 4, 2, 7, 15, 3, 45, 5, 23 };

	public static void main(String[] args) {
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void sort(int[] arr) {
		int len = arr.length;
		for (int i = 1; i < len; i++) {
			int start = i;
			while (start > 0 && arr[start] < arr[start - 1]) {
				int temp = arr[start];
				arr[start] = arr[start - 1];
				arr[start - 1] = temp;
				start--;
			}
		}

	}
	
	
}
