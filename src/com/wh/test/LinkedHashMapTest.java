package com.wh.test;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {
	public static void main(String[] args) {
		// 而LinkedHashMap是由数组+双向链表的数据结构来实现的。
		// 其中双向链表的结构可以实现访问顺序和插入顺序，使得LinkedHashMap中的<key,value>对按照一定顺序排列起来。
		// 通过下面构造函数来指定LinkedHashMap中双向链表的结构是访问顺序还是插入顺序。
		// 其中accessOrder设置为true则为访问顺序，为false则为插入顺序。
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>(0, 0.75f, true);
		map.put(0, 0);
		map.put(1, 1);
		map.put(2, 2);
		map.put(3, 3);
		map.put(4, 4);
		map.put(5, 5);
		map.put(6, 6);
		map.get(1);
		map.get(2);

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
		}
	}
}
