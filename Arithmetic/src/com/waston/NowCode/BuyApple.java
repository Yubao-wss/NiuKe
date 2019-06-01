package com.waston.NowCode;

import java.util.Scanner;

/**
 * @Description: 买苹果
 * 小易去附近的商店买苹果，奸诈的商贩使用了捆绑交易，只提供6个每袋和8个每袋的包装(包装不可拆分)。
 * 可是小易现在只想购买恰好n个苹果，小易想购买尽量少的袋数方便携带。如果不能购买恰好n个苹果，小易
 * 将不会购买。
 * 输入描述：
 * 输入一个整数n，表示小易想购买n(1 ≤ n ≤ 100)个苹果
 * 输出描述：
 * 输出一个整数表示最少需要购买的袋数，如果不能买恰好n个苹果则输出-1
 * 示例1:
 * 输入
 * 20
 * 输出
 * 3
 * @Author: Waston
 * @Date: 2019/5/31 23:08
 */
public class BuyApple {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()){
            int n = in.nextInt();
            System.out.println(count(n));
        }
    }

    public static int count(int n){
        //一定是偶数，最小是6，10以上偶数都可以
        if(n%2 != 0 || n==10 || n<6){
            return -1;
        }

        //8个8个拿完最好
        if(n%8 == 0){
            return n/8;
        }

        //对于10以上的偶数，只要对8取余数为0，就要从前面的1个或2个8中拿出2个，把余数补为6(本来余数就是6，就不用拿）。所以+1。
        return 1+n/8;
    }
}
