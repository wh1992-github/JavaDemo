package com.wh.test;

public class FormatTime {

	public static void main(String[] args) {
		int l = 6601;
		int second = l % 60;
		int minute = l / 60 % 60;
		int hour = l / 3600;
		System.out.println("h = " + hour + ", m = " + minute + ", s = "
				+ second);
		String result = String.format("%02d:%02d:%02d", hour, minute, second);
		System.out.println(result);
	}
}
