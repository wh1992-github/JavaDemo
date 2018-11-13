package com.wh.test;

public class StringCompare {
	public static void main(String[] args) {
		Person person = new Child();
		person.eat();

		person = new Person() {
			@Override
			public void eat() {
				// TODO Auto-generated method stub
				System.out.println("Person: eat something");
			}
		};
		person.eat();
	}

	static class Child extends Person {
		@Override
		public void eat() {
			System.out.println("Child: eat something");
		}
	}
}

abstract class Person {
	public abstract void eat();
}
