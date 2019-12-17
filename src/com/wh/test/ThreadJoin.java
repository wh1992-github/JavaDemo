package com.wh.test;

public class ThreadJoin extends Thread {

	public ThreadJoin(String threadName) {
		this.setName(threadName);
	}

	@Override
	public void run() {
		for (int i = 1; i < 4; i++) {
			try {
				Thread.sleep(1 * 500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "---" + i);
		}
	}

	public static void main(String[] args) {
		ThreadJoin t1 = new ThreadJoin("t1");
		ThreadJoin t2 = new ThreadJoin("t2");
		ThreadJoin t3 = new ThreadJoin("t3");
		t1.start();
		// join的意思是使得放弃当前线程的执行，并返回对应的线程，例如下面代码的意思就是：
		// 程序在main线程中调用t1线程的join方法，则main线程放弃cpu控制权，并返回t1线程继续执行直到线程t1执行完毕
		// 所以结果是t1线程执行完后，才到主线程执行，相当于在main线程中同步t1线程，t1执行完了，main线程才有执行的机会
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("t1 is " + (t1.isAlive() ? "alive" : "not alive"));
		System.out.println("t2 is " + (t2.isAlive() ? "alive" : "not alive"));
		System.out.println("t3 is " + (t3.isAlive() ? "alive" : "not alive"));
		t2.start();
		t3.start();
	}
}