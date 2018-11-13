
package com.wh.test;

public class TestWithVolatile {
    private static volatile boolean bChanged;

    public static void main(String[] args) throws InterruptedException {
        new Thread() {
            @Override
            public void run() {
                for (;;) {
                    System.out.println("111111=" + bChanged);
                    if (bChanged == !bChanged) {
                        System.out.println("222222=" + bChanged);
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
                for (;;) {
                    bChanged = !bChanged;
                }
            }
        }.start();
    }

}
