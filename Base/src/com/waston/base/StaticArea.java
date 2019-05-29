package com.waston.base;

/**
 * @Description: 执行后cnt的值为5
 * @Author: Waston
 * @Date: 2019/5/28 23:52
 */
public class StaticArea {
    static int cnt = 6;
    static {
        cnt += 9;
    }

    public static void main(String[] args) {
        System.out.println("cnt =" + cnt);
    }

    static{
        cnt /= 3;
    }
}
