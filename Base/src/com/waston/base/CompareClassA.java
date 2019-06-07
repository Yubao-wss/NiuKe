package com.waston.base;

/**
 * @Description: false
 * @Author: Waston
 * @Date: 2019/6/7 15:40
 */
class A{
    public A(String str){}

}
public class CompareClassA {
    public static void main(String[] args) {
        A classa = new A("he");
        A classb = new A("he");
        System.out.println(classa == classb);
    }
}
