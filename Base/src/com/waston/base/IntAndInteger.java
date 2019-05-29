package com.waston.base;

/**
 * @Description: true true
 * @Author: Waston
 * @Date: 2019/5/29 20:49
 */
public class IntAndInteger {
    public static void main(String[] args) {
        int i = 0;
        Integer j = new Integer(0);
        Integer k = new Integer(100);
        Integer l = new Integer(100);
        System.out.println(i == j);
        System.out.println(j.equals(i));
        System.out.println(k==l);
    }

}
