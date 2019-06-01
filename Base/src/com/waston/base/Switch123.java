package com.waston.base;

/**
 * @Description: 10
 * @Author: Waston
 * @Date: 2019/6/1 22:53
 */
public class Switch123 {
    public static void main(String[] args) {
       int result = getValue(2);
        System.out.println(result);
    }

    public static int getValue(int i){
        int result = 0;
        switch (i){
            case 1:
                result = result + i;
            case 2:
                result = result + i * 2;
            case 3:
                result = result + i * 3;
        }
        return result;
    }
}
