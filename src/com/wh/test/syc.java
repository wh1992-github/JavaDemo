
package com.wh.test;


public class syc {
    public static void main(String[] args) {
        final Object object = new Object();
        Thread t1 = new Thread() {
            public void run(){
                synchronized (object) {
                    System.out.println("T1 start!");
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("T1 end!");
                }
            }
        };
        Thread t2 = new Thread() {
            public void run(){
                synchronized (object) {
                    System.out.println("T2 start!");
                    System.out.println("T2 end!");
                    object.notify();
                }
            }
        };
        t1.start();
        t2.start();
    }
}
