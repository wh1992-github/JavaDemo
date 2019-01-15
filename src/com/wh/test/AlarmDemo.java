package com.wh.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AlarmDemo {

	static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

	public static void main(String[] args) {
		long time = System.currentTimeMillis() + 24 * 60 * 60 * 1000;
		String tomorrow = sdf.format(time);
		System.out.println(tomorrow);
		try {
			Date date = sdf.parse(tomorrow);
			System.out.println(date);
			// 现在到零点的时间差
			System.out.println((date.getTime() - System.currentTimeMillis()) / 1000 + "秒");
			formatTime((date.getTime() - System.currentTimeMillis()) / 1000);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private static void formatTime(long time) {
		long second = time % 60;
		long minute = time / 60 % 60;
		long hour = time / 3600;
		System.out.println("h = " + hour + ", m = " + minute + ", s = " + second);
		String result = String.format("%02d:%02d:%02d", hour, minute, second);
		System.out.println(result);
	}
}
