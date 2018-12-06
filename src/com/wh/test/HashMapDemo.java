package com.wh.test;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	private static HashMap<String, String> mMap = new HashMap<String, String>();
	private static String key = "aa";

	public static void main(String[] args) {

		KeyDemo keyDemo1 = new KeyDemo();
		KeyDemo keyDemo2 = new KeyDemo();
		System.out.println(keyDemo1.equals(keyDemo2));
		System.out.println("hashCode1 = " + keyDemo1.hashCode() + "， hashCode2 = " + keyDemo2.hashCode());

		mMap.put(key, "111");
		mMap.put(key, "222");
		for (Map.Entry<String, String> entry : mMap.entrySet()) {
			System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
		}
	}
}

class KeyDemo {
	@Override
	public boolean equals(Object o) {
		// return true;
		return super.equals(o);
	}

	@Override
	public int hashCode() {
		// return 101;
		return super.hashCode();
	}
}
