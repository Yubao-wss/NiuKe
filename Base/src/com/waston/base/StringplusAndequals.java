package com.waston.base;

/**
 * @Description: .equals succeeded
 * @Author: Waston
 * @Date: 2019/6/5 11:46
 */
public class StringplusAndequals {
    public static void main(String[] args) {
        String s1 = "abc" + "def";
        String s2 = new String(s1);
        if (s1.equals(s2))
            System.out.println(".equals succeeded");
        if(s1 == s2)
            System.out.println("==succeeded");
    }
}
