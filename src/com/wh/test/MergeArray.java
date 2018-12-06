package com.wh.test;

public class MergeArray {
	// 合并两个有序数组,两种实现方式
	static int m, n, index = 0;
	static int[] b = { 1, 32, 37, 45 };
	static int[] a = { 8, 18, 34, 56 };
	static int k = a.length + b.length;
	static int[] c = new int[k];

	public static void main(String[] args) {
		hebing1();
		// hebing2();
	}

	public static void hebing2() {
		while (m < a.length && n < b.length) {
			if (a[m] <= b[n]) {
				c[index++] = a[m++];
			} else {
				c[index++] = b[n++];
			}
		}
		while (m < a.length) {
			c[index++] = a[m++];
		}
		while (n < b.length) {
			c[index++] = b[n++];
		}
		for (int i = 0; i < k; i++) {
			System.out.println("c = " + c[i]);
		}
	}

	public static void hebing1() {
		for (int i = 0; i < k; i++) {
			if (m < a.length && n < b.length) {
				if (a[m] > b[n]) {
					c[i] = b[n];
					n++;
				} else {
					c[i] = a[m];
					m++;
				}
			} else {
				if (n < b.length) {
					c[i] = b[n];
					n++;
				} else if (m < a.length) {
					c[i] = a[m];
					m++;
				}
			}
			System.out.println("c = " + c[i]);
		}
	}
}
