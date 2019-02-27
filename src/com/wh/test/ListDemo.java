package com.wh.test;

import java.util.ArrayList;
import java.util.List;

//  可以说泛型的一个重要作用就是为了避免强制类型的转换，
//  定义的时候逻辑与之前的相同，涉及到具体的类型信息的时候，
//  用一个符号来代替（所谓类型的参数化），不变应万变。

public class ListDemo {

	public static void main(String[] args) {
		test1();
		test2();
	}

	private static void test2() {
		ArrayList<String> stringList = new ArrayList<String>();
		ArrayList<Integer> integerList = new ArrayList<Integer>();
		// 泛型只是在编译的时候有用，其实getClass还是同一个东西。
		System.out.println(stringList.getClass().equals(integerList.getClass()));

	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void test1() {
		List arrayList = new ArrayList();
		arrayList.add("abcd");
		arrayList.add(1000);

		for (int i = 0; i < arrayList.size(); i++) {
			Object object = arrayList.get(i);
			if (object instanceof Integer) {
				System.out.println(object.toString() + ": Integer");
			} else if (object instanceof String) {
				System.out.println(object.toString() + ": String");
			}
		}
	}
}
