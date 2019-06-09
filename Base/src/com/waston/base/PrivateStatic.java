package com.waston.base;

/**
 * @Description: 102
 * @Author: Waston
 * @Date: 2019/6/9 0:36
 */
public class PrivateStatic {
    private static int x = 100;

    public static void main(String[] args) {
        PrivateStatic hs1 = new PrivateStatic();
        hs1.x++;
        PrivateStatic hs2 = new PrivateStatic();
        hs2.x++;
        hs1 = new PrivateStatic();
        hs1.x++;
        PrivateStatic.x--;
        System.out.println("x="+x);
    }
}
