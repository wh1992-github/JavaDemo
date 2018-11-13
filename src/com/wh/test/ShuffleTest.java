
package com.wh.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ShuffleTest {
    public static int runCount;// 用于记录方法运算次数

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 12; i++) {
            list.add(new Integer(i));
        }
        String[] strArr = new String[] {
                "a", "b", "c", "d", "e", "f"
        };

        int arrays[] = new int[] {
                0, 1, 2, 3, 4, 5, 6, 7, 8, 9
        };
        // 打乱int型数组
        m1(arrays);
        // 打乱int型数组
        m2(arrays);
        // 打乱string型数组
        mString(strArr);
        // 打乱list
        System.out.println("打乱前：" + list);
        Collections.shuffle(list);
        System.out.println("打乱后：" + list);
    }

    // 和m2方法一样，只不过用了do...while... m3用的for。
    public static int[] m3(int[] arr) {
        int[] arr2 = new int[arr.length];
        int count = arr.length;
        int cbRandCount = 0;// 索引
        int cbPosition = 0;// 位置
        int k = 0;
        do {
            runCount++;
            Random rand = new Random();
            int r = count - cbRandCount;
            cbPosition = rand.nextInt(r);
            arr2[k++] = arr[cbPosition];
            cbRandCount++;
            arr[cbPosition] = arr[r - 1];// 将最后一位数值赋值给已经被使用的cbPosition
        } while (cbRandCount < count);
        System.out.println("m3运算次数  = " + runCount);
        return arr2;
    }

    public static void m2(int[] arr) {
        int[] arr2 = new int[arr.length];
        int length = arr.length;
        int cbPosition = 0;// 位置
        System.out.println("打乱顺序后：");
        for (int i = 0; i < length; i++) {
            Random rand = new Random();
            int r = length - i;
            cbPosition = rand.nextInt(r);
            arr2[i] = arr[cbPosition];
            arr[cbPosition] = arr[r - 1];// 将最后一位数值赋值给已经被使用的cbPosition
            System.out.print(arr2[i] + ",");
        }
    }

    public static void mString(String[] arr) {
        Random ran = new Random();
        int length = arr.length;
        int[] newIndex = new int[length];
        String[] newArray = new String[length];
        int count = 0;
        runCount = 0;
        while (true) {
            runCount++;
            // 此处要加1，因为默认int[]的值都为0，如果不加1，则exist(r, newIndex)行不通
            int r = ran.nextInt(length) + 1;
            if (!exist(r, newIndex)) {
                newIndex[count] = r;
                newArray[count] = arr[newIndex[count] - 1];
                count++;
            }
            if (count == length) {
                break;
            }
        }
        System.out.println();
        System.out.println("mString 运算次数 = " + runCount);
        for (String i : newArray) {
            System.out.print(i + ",");
        }
    }

    public static void m1(int[] arr) {
        Random ran = new Random();
        int length = arr.length;
        int[] newIndex = new int[length];
        int[] newArray = new int[length];
        int count = 0;
        runCount = 0;
        while (true) {
            runCount++;
            // 此处要加1，因为默认int[]的值都为0，如果不加1，则exist(r, newIndex)行不通
            int r = ran.nextInt(length) + 1;
            if (!exist(r, newIndex)) {
                newIndex[count] = r;
                newArray[count] = arr[newIndex[count] - 1];
                count++;
            }
            if (count == length) {
                break;
            }
        }
        System.out.println("m1 运算次数 = " + runCount);
        for (int i : newArray) {
            System.out.print(i + ",");
        }
    }

    public static boolean exist(int a, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                return true;
            }
        }
        return false;
    }
}
