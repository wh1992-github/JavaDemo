package com.wh.test;

// 死锁
public class DeadLock {
	public static final String obj1 = "obj1";
	public static final String obj2 = "obj2";

	public static void main(String[] args) {
		Thread1 thread1 = new Thread1("T1");
		Thread2 thread2 = new Thread2("T2");
		thread1.start();
		thread2.start();
	}

	static class Thread1 extends Thread {
		public Thread1(String name) {
			setName(name);
		}

		public void run() {
			System.out.println("T2 running");
			synchronized (DeadLock.obj1) {
				System.out.println("Lock1 lock obj1");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} // 获取obj1后先等一会儿，让Lock2有足够的时间锁住obj2
				synchronized (DeadLock.obj2) {
					System.out.println("Lock1 lock obj2");
				}
			}
		}
	}

	static class Thread2 extends Thread {
		public Thread2(String name) {
			setName(name);
		}

		public void run() {
			System.out.println("T1 running");
			synchronized (DeadLock.obj2) {
				System.out.println("Lock2 lock obj2");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (DeadLock.obj1) {
					System.out.println("Lock2 lock obj1");
				}
			}
		}
	}
}
