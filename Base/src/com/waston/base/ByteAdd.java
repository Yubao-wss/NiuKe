package com.waston.base;

/**
 * @Description: -128 127
 * @Author: Waston
 * @Date: 2019/6/2 23:48
 */
public class ByteAdd {
    public void add(Byte b){
        b = b++;
    }
    public void test(){
        Byte a = 127;
        Byte b = 127;
        add(++a);
        System.out.print(a + " ");
        add(b);
        System.out.print(b + " ");
    }

    public static void main(String[] args) {
        ByteAdd b = new ByteAdd();
        b.test();
    }
}
