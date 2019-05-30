package com.waston.base;

/**
 * @Description: 12
 * @Author: Waston
 * @Date: 2019/5/30 21:39
 */
public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            int i = 100/0;
            System.out.print(i);
        }catch (Exception e){
            System.out.print(1);
            throw new RuntimeException();
        }finally {
            System.out.print(2);
        }
        System.out.print(3);
    }
}
