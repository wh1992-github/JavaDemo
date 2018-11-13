
package com.wh.test;


public class TwoMethod {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            public void run() {
                // TODO Auto-generated method stub
                getA();
            }
        }).start();
        new Thread(new Runnable() {
            public void run() {
                // TODO Auto-generated method stub
                getB();
            }
        }).start();
    }

    private synchronized static void getA() {
        try {
            System.out.println("AAA");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private synchronized static void getB() {
        try {
            System.out.println("BBB");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
