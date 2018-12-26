package com.wh.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MyList {
	static ArrayList<Integer> mArrayList = new ArrayList<Integer>();
	static LinkedList<Integer> mLinkedList = new LinkedList<Integer>();

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		array();
		System.out.println(System.currentTimeMillis() - start);

		start = System.currentTimeMillis();
		linked();
		System.out.println(System.currentTimeMillis() - start);

		start = System.currentTimeMillis();
		getArray();
		System.out.println(System.currentTimeMillis() - start);

		start = System.currentTimeMillis();
		getLinked();
		System.out.println(System.currentTimeMillis() - start);
	}

	public static void array() {
		for (int i = 0; i < 50000; i++) {
			mArrayList.add(0, i);
		}
	}

	public static void linked() {
		for (int i = 0; i < 50000; i++) {
			mLinkedList.add(0, i);
		}
	}

	public static void getArray() {
		for (int i = 0; i < mArrayList.size(); i++) {
			mArrayList.get(i);
		}
	}

	public static void getLinked() {
		for (int i = 0; i < mLinkedList.size(); i++) {
			mLinkedList.get(i);
		}
	}
}
