package com.waston.base;

/**
 * @Description: YXYZ
 * 在编译时的编译器看来会默认将构造代码块中的代码移动到构造方法中，并且移动到构造方法内容的前面。
 * https://blog.csdn.net/qq_38490140/article/details/80230114
 *
 * 变种，经调试发现：
 * new Z()时先会调用X类的无参构造，会先执行1、2跳过3，最后执行print。
 * @Author: Waston
 * @Date: 2019/6/8 11:09
 */
class X{
    Y y = new Y();// 1
    int x = 1;// 2
    public int x2;// 3
    public X(){
        System.out.print("X");
    }
    public X(int x){
        x2 = 1;
    }
}
class Y{
    public Y(){
        System.out.print("Y");
    }
}
public class Z extends X{
    Y y = new Y();
    public Z(){
        System.out.print("Z");
    }

    public static void main(String[] args) {
        new Z();
    }
}
