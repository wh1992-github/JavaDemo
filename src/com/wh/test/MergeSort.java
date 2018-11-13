package com.wh.test;

//归并排序
public class MergeSort {

	private static int[] array = { 88, 66, 55, 11, 44, 99, 22, 33, 77, 100 };
	private static int[] workSpace = new int[array.length]; // 用于辅助排序的数组

	public static void main(String[] args) {
		mergeSort(workSpace, 0, workSpace.length - 1);
		display();
	}

	// 归并排序
	private static void mergeSort(int[] workSpace, int lowerBound, int upperBound) {
		if (lowerBound < upperBound) {
			int mid = (lowerBound + upperBound) / 2;
			mergeSort(workSpace, lowerBound, mid); // 对低位段归并排序
			mergeSort(workSpace, mid + 1, upperBound); // 对高位段归并排序
			merge(workSpace, lowerBound, mid, upperBound);
		}
	}

	private static void merge(int[] workSpace, int lowerBound, int mid, int upperBound) {
		int lowBegin = lowerBound; // 低位段的起始下标
		int lowEnd = mid; // 低位段的结束下标
		int highBegin = mid + 1; // 高位段的起始下标
		int highEnd = upperBound; // 高位段的结束下标
		int j = 0; // workSpace的下标指针
		int n = upperBound - lowerBound + 1; // 归并的元素总数

		while (lowBegin <= lowEnd && highBegin <= highEnd) {
			if (array[lowBegin] < array[highBegin]) {// 将两者较小的那个放到workSpace中
				workSpace[j++] = array[lowBegin++];
			} else {
				workSpace[j++] = array[highBegin++];
			}
		}
		while (lowBegin <= lowEnd) {
			workSpace[j++] = array[lowBegin++];
		}
		while (highBegin <= highEnd) {
			workSpace[j++] = array[highBegin++];
		}
		for (int k = 0; k < n; k++) { // 将归并好的元素复制到array中
			array[lowerBound++] = workSpace[k];
		}
	}

	// 按顺序打印数组中的元素
	public static void display() {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
	}
}