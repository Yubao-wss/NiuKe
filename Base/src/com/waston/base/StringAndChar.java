package com.waston.base;

/**
 * @Description: 结果：hello and cb
 * @Author: Waston
 * @Date: 2019/5/29 20:35
 */
public class StringAndChar {
    String str = new String("hello");
    char[]ch = {'a','b'};

    public static void main(String[] args) {
        StringAndChar sac = new StringAndChar();
        sac.change(sac.str,sac.ch);
        System.out.print(sac.str+" and ");
        System.out.print(sac.ch);
    }
    public void change(String str,char ch[]){
        str = "test ok";
        ch[0]='c';
    }
}
