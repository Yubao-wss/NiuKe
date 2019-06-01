package com.waston.base;

/**
 * @Description: pongping
 * @Author: Waston
 * @Date: 2019/6/1 22:40
 */
public class ThreadAndMain {
    public static void main(String[] args) {
        Thread t = new Thread(){
            public void run(){
                pong();
            }
        };
        t.run();
        System.out.print("ping");
    }
    static void pong(){
        System.out.print("pong");
    }
}
