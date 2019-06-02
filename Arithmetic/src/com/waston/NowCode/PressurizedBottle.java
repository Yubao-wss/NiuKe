package com.waston.NowCode;

import java.util.Scanner;

/**
 * @Description: 汽水瓶
 * 有这样一道智力题：“某商店规定：三个空汽水瓶可以换一瓶汽水。小张手上有十个空汽水瓶，她最多可以换多少瓶汽水喝？”
 * 答案是5瓶，方法如下：先用9个空瓶子换3瓶汽水，喝掉3瓶满的，喝完以后4个空瓶子，用3个再换一瓶，喝掉这瓶满的，这时候剩2个空瓶子。
 * 然后你让老板先借给你一瓶汽水，喝掉这瓶满的，喝完以后用3个空瓶子换一瓶满的还给老板。
 * 如果小张手上有n个空汽水瓶，最多可以换多少瓶汽水喝？
 * @Author: Waston
 * @Date: 2019/5/25 22:03
 */
public class PressurizedBottle {
    public static int drink(int n){
        int total = 0;// 饮料总数
        //拥有至少两个空瓶时才能换饮料
        while(n > 2){
            //n/3:能换来的饮料
            total = total+n/3;
            //目前手中瓶子的个数
            n = n/3 + n%3;
        }
        //剩两个空瓶时，还可以借以一个，完成最后一次兑换
        if(n == 2){
            total = total + 1;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while (sc.hasNext("#")){
            n = sc.nextInt();
            System.out.println(drink(n));
        }

    }
}
