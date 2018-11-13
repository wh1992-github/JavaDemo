package com.wh.test;

public class Tests {

	public static void main(String[] args) {
		fantan();
	}

	public static int jiecheng(int i) {
		if (i == 1) {
			return 1;
		} else {
			return i * jiecheng(i - 1);
		}
	}

	// 一球从100米高度自由落下，每次落地后反跳回原高度的一半；
	// 再落下，求它在第10次落地时，共经过多少米？第10次反弹多高？
	public static void fantan() {
		double s = 0;
		double h = 100;
		for (int i = 1; i <= 3; i++) {
			s += h;
			h = h / 2;
			s += h;
		}
		System.out.println("经过路程 = " + s);
		System.out.println("反弹高度 = " + h);
	}

	// 一个数如果恰好等于它的因子之和，这个数就称为"完数"。例如6=1＋2＋3。编程找出1000以内的所有完数。
	public static void wanshu() {
		int s;
		for (int i = 1; i <= 1000; i++) {
			s = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					s = s + j;
				}
			}
			if (s == i) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	// 求s = a + aa + aaa + aaaa + aa...a的值，其中a是一个数字。例如2 + 22 + 222 + 2222 +
	// 22222
	public static void jiafa(int i, int a) {
		int sum = 0;
		int t = 0;
		for (int j = 0; j < i; j++) {
			t += a;
			a = a * 10;
			sum += t;
		}
		System.out.println(sum);
	}

	// 最大公约数 最小公倍数
	public static void gongyueshu(int n, int m) {
		int o = (m > n) ? n : m;
		for (int i = o; i > 0; i--) {
			if (m % i == 0 && n % i == 0) {
				System.out.println("最大公约数 = " + i);
				System.out.println("最小公倍数 = " + (m * n / i));
				System.exit(0);
			}
		}
	}

	// 分解质数
	public static void fenjie(int n) {
		for (int i = 2; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i);
				if (n > i) {
					System.out.print("*");
				} else {
					System.exit(0); // 退出程序
				}
				fenjie(n / i);
			}
		}
	}
}
