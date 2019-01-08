package com.wh.test;

public class TicketThread {
	public static void main(String[] arg) {
		Tickets ticket = new Tickets();
		Thread t1 = new Thread(ticket, "窗口一：");
		Thread t2 = new Thread(ticket, "窗口二：");
		Thread t3 = new Thread(ticket, "窗口三：");
		t1.start();
		t2.start();
		t3.start();
	}
}

class Tickets implements Runnable {
	// 为了让线程共享一个资源所以我们定义一个静态成员变量
	private static int tickets = 100;

	public void run() {
		while (true) {
			synchronized (Tickets.this) {
				try {
					if (tickets > 0) {
						Thread.sleep(10);
						System.out.println(Thread.currentThread().getName() + "正在售出第" + (tickets--) + "张票");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
