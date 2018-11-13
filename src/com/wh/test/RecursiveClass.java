
package com.wh.test;

public class RecursiveClass {
    public static void main(String[] args) {
        int i = getResult(10);
        System.out.println("i = " + i);
        
    }

    // get(10)=10+get(9)
    // get(9)=9+get(8)
    // ...
    // get(3)=3+get(2)
    // get(2)=2+1
    public static int getResult(int i) {
        int sum;
        if (i == 1) {
            return 1;
        } else {
            sum = i + getResult(i - 1);
        }
        return sum;
    }

}
