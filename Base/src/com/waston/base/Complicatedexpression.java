package com.waston.base;

/**
 * @Description: false
 * 根据java运算符优先级可以知道 原式=(x>50&&y>60)||(x>50&&y<-60)||(x<-50&&y>60)||(x<-50&&y<-60);
 * &&运算符 当前面的条件为假时，表达式为假，后面就不再进行判断，所以只看x就好
 * ||运算符 前面条件为真，表达式为真，后面的就不再判断
 *  每一项计算结果都为false，最终b=false
 * @Author: Waston
 * @Date: 2019/6/3 21:43
 */
public class Complicatedexpression {
    public static void main(String[] args) {
        Complicatedexpression c = new Complicatedexpression();
        c.complicatedexpression_r();
    }

    public void complicatedexpression_r(){
        int x = 20,y = 30;
        boolean b;
        b = x > 50 && y > 60 || x > 50 && y < -60 || x < -50 && y > 60 || x < -50 && y < -60;
        System.out.println(b);
    }
}
