
package com.wh.test;

public class IsIP {
    public boolean isIp(String ip) {// 判断是否是一个IP
        String IP = ip.trim();
        boolean b = false;
        String qq = "854489";
        System.out.println("qq:" + qq.matches("^[1-9]\\d{4,10}"));
        if (IP.matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}")) {
            String[] s = IP.split("\\.");
            if (Integer.parseInt(s[0]) < 255)
                if (Integer.parseInt(s[1]) < 255)
                    if (Integer.parseInt(s[2]) < 255)
                        if (Integer.parseInt(s[3]) < 255)
                            b = true;
        }
        return b;
    }

    public static void main(String[] args) {
        String s = "11.110.133.244";
        IsIP test = new IsIP();
        System.out.println(test.isIp(s) ? "是一个IP" : "不是一个IP");
    }
}
