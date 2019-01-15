package com.wh.test;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	private static HashMap<String, String> mMap = new HashMap<String, String>();
	private static HashMap<KeyDemo, String> mCustomMap = new HashMap<KeyDemo, String>();

	public static void main(String[] args) {
		mMap.put("key_s", "111");
		mMap.put("key_s", "222");
		for (Map.Entry<String, String> entry : mMap.entrySet()) {
			System.out.println("key = " + entry.getKey() + " , value = " + entry.getValue());
		}

		KeyDemo keyDemo1 = new KeyDemo();
		KeyDemo keyDemo2 = new KeyDemo();
		System.out.println(keyDemo1.equals(keyDemo2));
		System.out.println(keyDemo1.hashCode() == keyDemo2.hashCode());

		mCustomMap.put(keyDemo1, "aaa");
		mCustomMap.put(keyDemo2, "bbb");
		for (Map.Entry<KeyDemo, String> entry : mCustomMap.entrySet()) {
			System.out.println("key = " + entry.getKey().toString() + " , value = " + entry.getValue());
		}
		System.out.println(mCustomMap.size());

		// // 第一种
		// System.out.println("第一种");
		// Set<String> set = mMap.keySet();
		// for (String key : set) {
		// System.out.println(key + "," + mMap.get(key));
		// }
		// // 第二种
		// System.out.println("第二种");
		// Iterator<String> iterator = set.iterator();
		// while (iterator.hasNext()) {
		// String keyString = iterator.next();
		// System.out.println(keyString + "," + mMap.get(keyString));
		// }
		// // 第三种
		// System.out.println("第三种");
		// for (Map.Entry<String, String> entry : mMap.entrySet()) {
		// System.out.println(entry.getKey() + "," + entry.getValue());
		// }
		// // 第四种
		// System.out.println("第四种");
		// Iterator<Map.Entry<String, String>> iterator2 =
		// mMap.entrySet().iterator();
		// while (iterator2.hasNext()) {
		// Map.Entry<String, String> entry = iterator2.next();
		// System.out.println(entry.getKey() + "," + entry.getValue());
		// }
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
		return 101;
		// return super.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "keydemo";
	}
}
