package com.wh.test;

public class OutClass {
	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		Inner inner = outClass.new Inner();
		System.out.println(inner.i);
		Inner2 inner2 = new Inner2();
		System.out.println(inner2.i);
		Inner3 inner3 = new Inner3() {
			@Override
			void getNa() {
				// TODO Auto-generated method stub
			}
		};
	}

	public class Inner {
		private int i = 9;
		int j = 8;
	}

	public static class Inner2 {
		private int i = 9;
		int j = 8;
	}

	static abstract class Inner3 {
		abstract void getNa();
	}
}
