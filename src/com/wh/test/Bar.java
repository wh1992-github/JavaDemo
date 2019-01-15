package com.wh.test;

class A {
	public void func() {
		System.out.println("func in A");
	}
}

class B extends A {
	public void func() {
		System.out.println("func in B");
	}
}

class C extends B {
	public void func() {
		System.out.println("func in C");
	}
}

public class Bar {
	public void test(A a) {
		a.func();
		System.out.println("test A in Bar");
	}

	public void test(C c) {
		c.func();
		System.out.println("test C in Bar");
	}

	public static void main(String[] args) {
		Bar bar = new Bar();
		A a = new A();
		B b = new B();
		C c = new C();
		bar.test(a);
		bar.test(b);
		bar.test(c);
	}
}
