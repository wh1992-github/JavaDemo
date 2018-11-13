package com.wh.test;

public class Parent {
	public Parent() {
		System.out.println("p1");
	}

	{
		System.out.println("aaa");
	}
	static {
		System.out.println("bbb");
	}
}
