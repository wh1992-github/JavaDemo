package com.wh.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//正则匹配
public class StringMatcher {

	public static void main(String[] args) {
		// System.out.println(isNumeric("12456789"));
		// System.out.println(isContains("第一个", "一个"));
		System.out.println(HasDigit("4djdd444"));
	}

	public static boolean HasDigit(String content) {
		boolean flag = false;
		Pattern p = Pattern.compile("\\d+.*");
		Matcher m = p.matcher(content);
		if (m.matches()) {
			flag = true;
		}
		return flag;
	}

	// 是纯数字
	private static boolean isNumeric(String str) {
		Pattern pattern = Pattern.compile("^[0-9]*$");
		Matcher isNum = pattern.matcher(str);
		if (!isNum.matches()) {
			return false;
		}
		return true;
	}

	// str是否包含content
	private static boolean isContains(String str, String content) {
		Pattern pattern = Pattern.compile(".*" + content + ".*");
		Matcher isNum = pattern.matcher(str);
		if (isNum.matches()) {
			return true;
		}
		return false;
	}
}
