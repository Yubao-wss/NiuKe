package com.waston.base;

/**
 * @Description: 结果：testMethod
 * @Author: Waston
 * @Date: 2019/5/29 20:26
 */
public class TestClassNull {
    private static void testMethod(){
        System.out.println("testMethod");
    }

    public static void main(String[] args) {
        ((TestClassNull)null).testMethod();
    }
}
