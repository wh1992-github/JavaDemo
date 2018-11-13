package com.wh.test;

public class WaitNotifyTest {

	// 在多线程间共享的对象上使用wait
	private String lockObj = "locked";

	public static void main(String[] args) {
		WaitNotifyTest test = new WaitNotifyTest();
		ThreadWait threadWait1 = test.new ThreadWait("wait thread111");
		ThreadWait threadWait2 = test.new ThreadWait("wait thread222");
		ThreadWait threadWait3 = test.new ThreadWait("wait thread333");
		threadWait1.start();
		threadWait2.start();
		threadWait3.start();

		ThreadNotify threadNotify = test.new ThreadNotify("notify thread");
		threadNotify.start();
	}

	class ThreadWait extends Thread {
		public ThreadWait(String name) {
			super(name);
		}

		public void run() {
			synchronized (lockObj) {
				System.out.println("线程" + this.getName() + "开始等待");
				long startTime = System.currentTimeMillis();
				try {
					lockObj.wait();
					sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				long endTime = System.currentTimeMillis();
				System.out.println("线程" + this.getName() + "等待时间为："
						+ (endTime - startTime));
			}
		}
	}

	class ThreadNotify extends Thread {
		public ThreadNotify(String name) {
			super(name);
		}

		public void run() {
			try {
				// 给等待线程等待时间
				sleep(800);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (lockObj) {
				System.out.println("线程" + this.getName() + "开始准备通知");
				lockObj.notifyAll();
				System.out.println("线程" + this.getName() + "通知结束");
			}
		}
	}
}