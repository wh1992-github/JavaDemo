package com.wh.test;

public class TestWithVolatile {
	// volatile保证了bChanged的可见性
	private static volatile boolean bChanged = false;

	public static void main(String[] args) throws InterruptedException {
		new Thread() {
			@Override
			public void run() {
				while (true) {
					System.out.println("111111 = " + bChanged);
					
					// 先读取第一个值，再读取第二个值之前被改变了，所以出现了 (bChanged == !bChanged) =true
					// 这个操作是非原子性的
					// 原子性：不可被打断的操作
					if (bChanged == !bChanged) {
						System.out.println("222222 = " + bChanged);
						System.out.println("!=============================================");
						System.exit(0);
					}
				}
			}
		}.start();

		Thread.sleep(10);

		new Thread() {
			@Override
			public void run() {
				while (true) {
					bChanged = !bChanged;
				}
			}
		}.start();
	}
}
