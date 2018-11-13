
package com.wh.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AlarmDemo {

    static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    public static void main(String[] args) {
        long time = System.currentTimeMillis() + 24 * 60 * 60 * 1000;
        String tomorrow = sdf.format(time);
        System.out.println(tomorrow);
        try {
            Date date = sdf.parse(tomorrow);
            System.out.println(date);
            // 现在到零点的时间差
            System.out.println((date.getTime() - System.currentTimeMillis()) / 1000 + "秒");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
