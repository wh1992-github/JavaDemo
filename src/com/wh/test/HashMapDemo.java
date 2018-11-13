
package com.wh.test;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    private static HashMap<String, String> mMap = new HashMap<String, String>();
    private static String key = "aa";

    public static void main(String[] args) {
        mMap.put(key, "111");
        mMap.put(key, "222");
        System.out.println(mMap.get(key));

        for (Map.Entry<String, String> entry : mMap.entrySet()) {
            System.out.println(entry.getKey() + "," + entry.getValue());
        }
    }
}
