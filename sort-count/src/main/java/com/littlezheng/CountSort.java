package com.littlezheng;

import java.util.Random;

/**
 * 计数排序<br>
 * 原理：使用bitmap的方式，将每个需要排序的数值作为下标记录在数组中， 下标对应的值记录该数值出现的次数，然后根据次数得到排序后得到的数组<br>
 * 该算法的时间复杂度为O(n)，但是采用的是空间换时间的方法，由于要用下标 记录数值，所以当数值越大时下标越大，需要的数组空间也就越大；由于要使用
 * 数组元素记录下标对应数值出现的次数，如果需要排序的集合非常庞大即同一个 数值可能出现很多次，那么同理需要的数组空间也会越大（声明的数组类型应根据最大
 * 可能出现的次数确定）<br>
 * 因此，该算法适用于确定范围、确定次数的集合，如果一个集合中的数值只在一个 较小的范围内波动，那么使用该算法可以使用较小的空间迅速对其进行排序<br>
 * 
 * @author littlezheng
 *
 */
public class CountSort {

	static final int MAX_VALUE = 100000;
	static final int MAX_SIZE = 100000000;
	static final Random ran = new Random();

	public static void main(String[] args) {
		int[] arr = createUnsortArray();
		System.out.println("数组生成完成..");

		long start = System.currentTimeMillis();
		arr = sort(arr);
		System.out
				.println("用时: " + (System.currentTimeMillis() - start) + "ms");
	}

	/**
	 * 计数排序
	 * 
	 * @param arr
	 * @return
	 */
	private static int[] sort(int[] arr) {
		int[] countArr = new int[MAX_VALUE];
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			countArr[arr[i]]++;
		}

		int n = 0;
		for (int i = 0; i < countArr.length; i++) {
			int count = countArr[i];
			for (int j = 0; j < count; j++) {
				arr[n++] = i;
			}
		}
		return arr;
	}

	/**
	 * 生成一个数值一定范围内波动的无序集合
	 * 
	 * @return
	 */
	private static int[] createUnsortArray() {
		int len = MAX_SIZE;
		int[] arr = new int[len];
		for (int i = 0; i < len; i++) {
			arr[i] = ran.nextInt(MAX_VALUE);
		}
		return arr;
	}

}
