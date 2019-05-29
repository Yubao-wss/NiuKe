package com.waston.base;

/**
 * @Description: 结果是Fmnwxy
 * @Author: Waston
 * @Date: 2019/5/29 18:36
 */
public class UpcaseString {
    public static void main(String[] args) {
        String x = "fmn";
        x.toUpperCase();
        String y = x.replace('f','F');
        y = y+"wxy";
        System.out.println(y);
    }
}

