package com.wh.test;

public class ArraySort {

	private static int[] array = { 88, 66, 55, 11, 44, 99, 22, 33, 77, 100 };

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		// sortA();
		selectionSort();
		// insertSort();
		System.out.println("time = " + (System.currentTimeMillis() - start));
		display();
	}

	// 按顺序打印数组中的元素
	public static void display() {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
		System.out.println();
	}

	private static void sortA() {
		for (int i = 1; i < array.length; i++) {
			int temp = array[i];
			int j = i;
			for (; j > 0 && array[j - 1] > temp; j--) {
				array[j] = array[j - 1];
			}
			array[j] = temp;
		}
		System.out.println();

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	// 插入排序
	public static void insertSort() {
		int len = array.length;
		int temp;

		for (int i = 1; i < len; i++) {
			int j = i;
			temp = array[j];
			for (; j > 0 && array[j - 1] > temp; j--) {
				array[j] = array[j - 1];
			}
			array[j] = temp;
		}
	}

	// 选择排序
	public static void selectionSort() {
		int len = array.length;
		int pos; // 存储最小元素的小标
		int temp;

		for (int i = 0; i < len - 1; i++) {
			pos = i;
			for (int j = i + 1; j < len; j++) { // 每完成一轮排序，就确定了一个相对最小元素，下一轮排序只对后面的元素排序
				if (array[j] < array[pos]) { // 如果待排数组中的某个元素比当前元素小，pos指向该元素的下标
					pos = j;
				}
			}
			if (pos != i) { // 如果发现了更小的元素，交换位置
				temp = array[i];
				array[i] = array[pos];
				array[pos] = temp;
			}
		}
	}
}
