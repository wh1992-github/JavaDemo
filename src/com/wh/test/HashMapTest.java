
package com.wh.test;

import java.util.HashMap;

public class HashMapTest {
    private static HashMap<String, String> mMap = new HashMap<String, String>();
    private static String aaaString = new String("hashcode");
    private static String bbbString = new String("hashcode");

    public static void main(String[] args) {
        System.out.println(aaaString.hashCode() + "," + bbbString.hashCode());
        System.out.println(aaaString.equals(bbbString));
        System.out.println(aaaString == bbbString);

        mMap.put("c", "ccc");
        mMap.put("a", "aaa");
        mMap.put("b", "bbb");
        mMap.put("d", "ddd");
        // // 第一种
        // System.out.println("第一种");
        // Set<String> set = mMap.keySet();
        // for (String key : set) {
        // System.out.println(key + "," + mMap.get(key));
        // }
        // // 第二种
        // System.out.println("第二种");
        // Iterator<String> iterator = set.iterator();
        // while (iterator.hasNext()) {
        // String keyString = iterator.next();
        // System.out.println(keyString + "," + mMap.get(keyString));
        // }
        // // 第三种
        // System.out.println("第三种");
        // for (Map.Entry<String, String> entry : mMap.entrySet()) {
        // System.out.println(entry.getKey() + "," + entry.getValue());
        // }
        // // 第四种
        // System.out.println("第四种");
        // Iterator<Map.Entry<String, String>> iterator2 = mMap.entrySet().iterator();
        // while (iterator2.hasNext()) {
        // Map.Entry<String, String> entry = iterator2.next();
        // System.out.println(entry.getKey() + "," + entry.getValue());
        // }
    }
}
