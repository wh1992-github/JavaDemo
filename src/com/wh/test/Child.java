package com.wh.test;

public class Child extends Parent {
	public Child() {
		System.out.println("p2");
	}

	{
		System.out.println("ccc");
	}

	public static void main(String[] args) {
		new Child();
	}

	static {
		System.out.println("ddd");
	}
}
