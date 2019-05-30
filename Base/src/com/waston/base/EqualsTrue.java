package com.waston.base;

/**
 * @Description: true
 * @Author: Waston
 * @Date: 2019/5/30 21:46
 */
public class EqualsTrue {
    public static void main(String[] args) {
        Object o = new Object(){
            public boolean equals(Object obj){
                return true;
            }
        };
        System.out.println(o.equals("Fred"));
    }
}
