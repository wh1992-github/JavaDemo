
package com.wh.test;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class FourReference {
    public static void main(String[] args) {
        try {
             test1();
             test2();
             test3();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    // 弱引用
    public static void test3() throws InterruptedException {
        Object obj = new Object();
        WeakReference<Object> wr = new WeakReference<Object>(obj);
        obj = null;
        System.gc();
        Thread.sleep(200);
        System.out.println("wr.get()=" + wr.get());
        System.out.println("wr=" + wr);
        // wr.clear();
        System.out.println("w1111r=" + wr.get());
    }

    // 强引用
    public static void test1() throws InterruptedException {
        Object obj = new Object();
        Object strong = obj;
        obj = null;
        System.gc();
        Thread.sleep(200);
        System.out.println("strong=" + strong);
    }

    // 软引用
    public static void test2() throws InterruptedException {
        Object obj = new Object();
        SoftReference<Object> sr = new SoftReference<Object>(obj);
        obj = null;
        System.gc();
        Thread.sleep(200);
        System.out.println("sr.get()=" + sr.get());
    }
}
