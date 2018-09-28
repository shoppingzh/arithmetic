package com.littlezheng;

import java.util.Arrays;

public class BubbleSort {

	static int[] arr = { 12, 6, 4, 2, 7, 15, 3, 45, 5, 23 };

	public static void main(String[] args) {
		System.out.println(Arrays.toString(arr));
		sort(arr, false);
		System.out.println(Arrays.toString(arr));
	}

	private static void sort(int[] arr, boolean desc) {
		int len = arr.length;
		for (int i = 0; i < len - 1; i++) {
			for (int j = 0; j < len - i - 1; j++) {
				if ((desc && arr[j] < arr[j + 1]) || (!desc && arr[j] > arr[j + 1])) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

}
