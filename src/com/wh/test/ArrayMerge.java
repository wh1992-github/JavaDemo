package com.wh.test;

//两个有序数组合并
public class ArrayMerge {

	private static int[] a = { 1, 3, 5, 6, 8 };
	private static int[] b = { 2, 4, 7, 9 };
	private static int m = a.length;
	private static int n = b.length;
	private static int l = m + n;

	private static int[] array = new int[l];

	public static void main(String[] args) {
		sortArray();
	}

	private static void sortArray() {
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < m && j < n) {
			if (a[i] < b[j]) {
				array[k] = a[i];
				i++;
				k++;
			} else {
				array[k] = b[j];
				j++;
				k++;
			}
		}

		while (i < m) {
			array[k] = a[i];
			i++;
			k++;
		}
		while (j < n) {
			array[k] = b[j];
			j++;
			k++;
		}
		for (int x = 0; x < array.length; x++) {
			System.out.print(array[x] + " ");
		}
	}
}
