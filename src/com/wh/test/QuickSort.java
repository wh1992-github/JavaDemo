package com.wh.test;

// 快速排序
public class QuickSort {
	private static int[] array = {  66, 55, 88,11, 44, 99, 22, 33, 77, 100 };

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		quikSort(0, array.length - 1);
		System.out.println("time = " + (System.currentTimeMillis() - start));
		display();
	}

	private static void quikSort(int low, int high) {
		if (low < high) {
			int pivot = array[low]; // 以第一个元素为基准
			int partition = partition(low, high, pivot); // 对数组进行划分，比pivot小的元素在低位段，比pivot大的元素在高位段
			quikSort(low, partition - 1); // 对划分后的低位段进行快速排序
			quikSort(partition + 1, high); // 对划分后的高位段进行快速排序
		}
	}

	private static int partition(int low, int high, int pivot) {
		while (low < high) {
			while (low < high && array[high] >= pivot) { // 从右端开始扫描，定位到第一个比pivot小的元素
				high--;
			}
			swap(low, high);
			display();
			while (low < high && array[low] <= pivot) { // 从左端开始扫描，定位到第一个比pivot大的元素
				low++;
			}
			swap(low, high);
			display();
		}
		System.out.println("low = " + low);
		return low;
	}

	// 交换
	private static void swap(int low, int high) {
		if (low == high) {
			return;
		}
		int temp = array[high];
		array[high] = array[low];
		array[low] = temp;
	}

	// 按顺序打印数组中的元素
	public static void display() {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
		System.out.println();
	}
}
