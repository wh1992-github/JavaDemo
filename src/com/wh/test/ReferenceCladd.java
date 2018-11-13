
package com.wh.test;

import java.lang.ref.WeakReference;

public class ReferenceCladd {
    public static void main(String[] args) {
        String string = new String("silver");
        WeakReference<String> weakCar = new WeakReference<String>(string);
        string = null;
        int i = 0;
        while (true) {
//            System.gc();
            if (weakCar.get() != null) {
                i++;
                System.out.println("Object is alive for " + i + " loops - " + weakCar.get());
            } else {
                System.out.println("Object has been collected." + weakCar.get());
                break;
            }
        }
    }
}
