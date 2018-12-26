package com.wh.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IsIP {
	public static void main(String[] args) {
		getStringNum();
		isIp();
	}

	// 从String提取数字，还可以用charAt方法挨着提取
	public static void getStringNum() {
		String a = "love23next234csdn3423java";
		String regEx = "[^0-9]";
		Pattern p = Pattern.compile(regEx);
		Matcher m = p.matcher(a);
		System.out.println(m.replaceAll("").trim());
	}

	// 判断是否是一个IP
	public static void isIp() {
		String ip = "11.110.133.244";
		if (ip.trim().matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}")) {
			String[] s = ip.split("\\.");
			if (Integer.parseInt(s[0]) < 255) {
				if (Integer.parseInt(s[1]) < 255) {
					if (Integer.parseInt(s[2]) < 255) {
						if (Integer.parseInt(s[3]) < 255) {
							System.out.println("是一个IP");
							return;
						}
					}
				}
			}
			System.out.println("不是一个IP");
		}
	}
}
