package com.waston.base;

/**
 * @Description: false,true
 * @Author: Waston
 * @Date: 2019/6/8 11:40
 */
public class EqualsTestEqualsString {
    public String name = "abc";

    public static void main(String[] args) {
        EqualsTestEqualsString t = new EqualsTestEqualsString();
        EqualsTestEqualsString t2 = new EqualsTestEqualsString();
        System.out.println(t.equals(t2)+","+t.name.equals(t2.name));
    }
}
