package com.wh.test;

import java.lang.ref.WeakReference;

public class TestWeakReference {

	// 值得注意的一点 , 即使有 car 引用指向对象, 且 car 是一个strong reference, weak reference
	// weakCar指向的对象仍然被回收了.
	// 这是因为java的编译器在发现 进入while循环之后, car 已经没有被使用了, 所以进行了优化(将其置空?).
	// weak reference指向的object就不会被回收了. 因为还有一个strong reference car 指向它.
	// WeakReference的一个特点是它何时被回收是不可确定的, 因为这是由GC运行的不确定性所确定的.
	// 所以, 一般用weak reference引用的对象 是有价值被cache, 而且很容易被重新被构建, 且很消耗内存的对象.
	// ReferenceQueue 在weak reference指向的对象被回收后, weak reference本身其实也就没有用了.
	// java提供了一个ReferenceQueue来保存这些所指向的对象已经被回收的reference.
	// 用法是在定义WeakReference的时候将一个ReferenceQueue的对象作为参数传入构造函数.
	// 其他类型的references -SoftReference soft reference和weak reference一样,
	// 但被GC回收的时候需要多一个条件: 当系统内存不足时(GC是如何判定系统内存不足? 是否有参数可以配置这个threshold?),
	// soft reference指向的object才会被回收. 正因为有这个特性, soft reference比weak
	// reference更加适合做cache objects的reference.
	// 因为它可以尽可能的retain cached objects, 减少重建他们所需的时间和消耗.

	public static void main(String[] args) {
		Car car = new Car(22000, "silver");
		WeakReference<Car> weakCar = new WeakReference<Car>(car);
		// car = null;
		int i = 0;
		while (true) {
			if (weakCar.get() != null) {
				// 如果有下面这行代码：weak reference指向的object就不会被回收了. 因为还有一个strong
				// reference car 指向它.
				// System.out.println(car);
				if (i > 2000) {
					System.gc();
				}
				System.out.println("Object is alive " + i + " loops -- "
						+ weakCar.get());
				i++;
			} else {
				System.out.println("被回收了");
				break;
			}
		}
	}

	static class Car {
		private double price;
		private String color;

		public Car(double price, String color) {
			this.price = price;
			this.color = color;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public String getcolor() {
			return color;
		}

		public void setcolor(String color) {
			this.color = color;
		}

		public String toString() {
			return color + "car costs $" + price;
		}
	}
}
