package com.waston.base;

/**
 * @Description: 24
 * 5 + 7 + 7 + 5 = 24
 * @Author: Waston
 * @Date: 2019/6/7 21:13
 */
public class plusplusMinusMinus {
    public static void main(String[] args) {
        int i = 5;
        int s = (i++)+(++i)+(i--)+(--i);
        System.out.println(s);
    }
}
