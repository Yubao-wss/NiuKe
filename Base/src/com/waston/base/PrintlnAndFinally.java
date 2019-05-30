package com.waston.base;

/**
 * @Description: finally语句块
 *              和是：43
 * @Author: Waston
 * @Date: 2019/5/30 21:25
 */
public class PrintlnAndFinally {
    public int add(int a,int b){
        try {
            return a+b;
        }catch (Exception e){
            System.out.println("catch语句块");
        }finally {
            System.out.println("finally语句块");
        }
        return 0;
    }

    public static void main(String[] args) {
        PrintlnAndFinally printlnAndFinally = new PrintlnAndFinally();
        System.out.println("和是："+printlnAndFinally.add(9,34));
    }


}
