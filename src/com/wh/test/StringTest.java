package com.wh.test;

public class StringTest {

	public static void main(String[] args) {
		String str = "abc";
		System.out.println(str);
		// 如果运行这段代码会发现先输出“abc”，然后又输出“abcde”，
		// 好像是str这个对象被更改了，其实，这只是一种假象罢了，
		// JVM对于这几行代码是这样处理的，首先创建一个String对象str，
		// 并把“abc”赋值给str，然后在第三行中，其实JVM又创建了一个新的对象也名为str，
		// 然后再把原来的str的值和“de”加起来再赋值给新的str，
		// 而原来的str就会被JVM的垃圾回收机制（GC）给回收掉了，
		// 所以，str实际上并没有被更改，也就是前面说的String对象一旦创建之后就不可更改了。
		// 所以，Java中对String对象进行的操作实际上是一个不断创建新的对象并且将旧的对象回收的一个过程，所以执行速度很慢。
		str = str + "de";
		System.out.println(str);
		System.out.println("111");
		str = "abc" + "de";
		System.out.println(str);
		System.out.println("111");
		StringBuilder stringBuilder = new StringBuilder().append("abc").append(
				"de");
		System.out.println(stringBuilder.toString());
		System.out.println("111");
	}
}
