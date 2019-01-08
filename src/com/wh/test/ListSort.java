package com.wh.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// list集合排序
public class ListSort {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(29, "ddd"));
		students.add(new Student(27, "bbb"));
		students.add(new Student(23, "aaa"));
		students.add(new Student(29, "ccc"));
		students.add(new Student(22, "eee"));

		Collections.sort(students, new Comparator<Student>() {
			public int compare(Student o1, Student o2) {
				// 按照姓名排序
				// return o1.getName().compareToIgnoreCase(o2.getName());
				// 按照年龄排序
				return o1.getAge() - o2.getAge();
			}
		});
		for (Student stu : students) {
			System.out.println("name = " + stu.getName() + ", age = " + stu.getAge());
		}
	}
}

class Student {
	private int age;
	private String name;

	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
