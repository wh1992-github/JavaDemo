package com.wh.test;

public class AAA {

	static double yuexin = 16000;// 月薪
	static double mianchu =1500;// 免除的数目

	static double jizhun = 5000;// 起征点
	static double wuxian = (yuexin * 0.222 >= 5639.02) ? 5639.02 : yuexin * 0.222;// 五险一金扣除的数目
	static double percent = 0;
	static double susuan = 0;
	static double sumBefore = 0;

	public static void main(String[] args) {
		for (int i = 1; i < 13; i++) {
			double total = (yuexin - jizhun - wuxian - mianchu) * i;
			if (total <= 36000) {
				percent = 0.03;
				susuan = 0;
			} else if (total > 36000 && total <= 144000) {
				percent = 0.1;
				susuan = 2520;
			} else if (total > 144000 && total <= 300000) {
				percent = 0.2;
				susuan = 16920;
			} else if (total > 300000 && total <= 420000) {
				percent = 0.25;
				susuan = 31920;
			} else if (total > 420000 && total <= 660000) {
				percent = 0.3;
				susuan = 52920;
			} else if (total > 660000 && total <= 960000) {
				percent = 0.35;
				susuan = 85920;
			} else if (total > 960000) {
				percent = 0.45;
				susuan = 181920;
			}
			double shui = (double) (total * percent) - sumBefore - susuan;
			sumBefore += shui;
			System.out.println("第" + i + "月交税 = " + String.format("%.2f", shui));
		}
		System.out.println("共交税 = " + String.format("%.2f", sumBefore));
	}
}
