package com.wh.test;

public class MyArrays {
	public static void main(String[] args) {
		int[] a = { 44, 16, 8, 18, 34, 56, 26 };
		// bubbleSort(a);
		selectSort(a);
		// insertSort(a);
		for (String i : args) {
			System.out.println(i);
		}
	}

	// 插入排序
	public static void insertSort(int[] a) {
		int size = a.length;
		int temp = 0;
		int j = 0;
		for (int i = 1; i < size; i++) {
			temp = a[i];
			// 假如temp比前面的值小，则将前面的值后移
			for (j = i; j > 0 && a[j - 1] > temp; j--) {
				a[j] = a[j - 1];
			}
			a[j] = temp;
		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
	}

	// 冒泡排序
	public static void bubbleSort(int[] a) {
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
	}

	// 选择排序
	public static void selectSort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			int temp = a[i];// 储存最小的值
			int position = i;
			for (int j = i + 1; j < a.length; j++) {
				if (temp > a[j]) {
					temp = a[j];
					position = j;
				}
			}
			a[position] = a[i];
			a[i] = temp;
		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
	}
}
