
package com.wh.test;

public class Runnable_DEMO implements Runnable {

    private static int count = 12;// 去掉static会不一样的。

    public Runnable_DEMO() {

    }

    public static void main(String args[]) {
        Runnable_DEMO demo = new Runnable_DEMO();
        Runnable_DEMO demo1 = new Runnable_DEMO();
        Runnable_DEMO demo2 = new Runnable_DEMO();
        new Thread(demo, "a").start();
        new Thread(demo1, "b").start();
        new Thread(demo2, "c").start();
    }

    public void method() {
        if (count > 0) {
            synchronized (Runnable_DEMO.class) {// Runnable_DEMO.this和Runnable_DEMO.class两种写法是不同的.也可以用别的类，如AAA.class.

                if (count > 0) {
                    try {
                        System.out.println(Thread.currentThread().getName() + ":" + (count--));
                        Thread.sleep(300);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public void run() {
        // TODO Auto-generated method stub
        for (int a = 0; a < 5; a++) {
            method();
        }
        // synchronized (Runnable_DEMO.class)
        // {//Runnable_DEMO.this和Runnable_DEMO.class两种写法是不同的
        // for (int i = 0; i < 3; i++) {
        // try {
        // System.out.println(Thread.currentThread().getName() + ":"
        // + (count++));
        // Thread.sleep(400);
        // } catch (InterruptedException e) {
        // e.printStackTrace();
        // }
        // }
        // }
    }

    public static boolean isIp(String IP) {// 判断是否是一个IP
        boolean b = false;
        if (IP.matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}")) {
            String s[] = IP.split("\\.");
            if (Integer.parseInt(s[0]) < 255)
                if (Integer.parseInt(s[1]) < 255)
                    if (Integer.parseInt(s[2]) < 255)
                        if (Integer.parseInt(s[3]) < 255)
                            b = true;
        }
        return b;
    }
}
