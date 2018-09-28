package com.littlezheng;

import java.util.Arrays;

public class SelectionSort {

	static int[] arr = { 12, 6, 4, 2, 7, 15, 3, 45, 5, 1, 23 };

	public static void main(String[] args) {
		System.out.println(Arrays.toString(arr));
		sort(arr, true);
		sort2(arr, true);
		System.out.println(Arrays.toString(arr));
	}

	private static void sort2(int[] arr, boolean desc) {
		int len = arr.length;
		for (int i = 0; i < len - 1; i++) {
			int k = i;
			int idx = k;
			for (int j = i + 1; j < len; j++) {
				if ((desc && arr[j] > arr[k]) || (!desc && arr[j] < arr[k])) {
					idx = j;
				}
			}
			//优化方法：先找出最大/最小值，然后再交换，不要每次都交换
			int temp = arr[idx];
			arr[idx] = arr[k];
			arr[k] = temp;
		}
	}

	private static void sort(int[] arr, boolean desc) {
		int len = arr.length;
		for (int i = 0; i < len - 1; i++) {
			int k = i;
			for (int j = i + 1; j < len; j++) {
				if ((desc && arr[j] > arr[k]) || (!desc && arr[j] < arr[k])) {
					int temp = arr[j];
					arr[j] = arr[k];
					arr[k] = temp;
				}
			}
		}
	}

}
