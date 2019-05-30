package com.waston.base;

/**
 * @Description: AB,B
 * @Author: Waston
 * @Date: 2019/5/30 21:52
 */
public class StringBufferOperator {
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");
        opearator(a,b);
        System.out.println(a+","+b);
    }
    public static void opearator(StringBuffer x,StringBuffer y){
        x.append(y);
        y = x;
    }
}
