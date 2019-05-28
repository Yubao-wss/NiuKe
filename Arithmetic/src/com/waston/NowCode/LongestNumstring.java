package com.waston.niuke;

import java.util.Scanner;

/**
 * @Description: 字符串中找出连续最长的数字串
 * 读入一个字符串str，输出字符串str中的连续最长的数字串
 * 输入描述：
 * 个测试输入包含1个测试用例，一个字符串str，长度不超过255。
 * 输出描述：
 * 在一行内输出str中里连续最长的数字串。
 * 示例1:
 * 输入
 * abcd12345ed125ss123456789
 * 输出
 * 123456789
 * @Author: Waston
 * @Date: 2019/5/26 21:17
 */
public class LongestNumstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String str = scanner.nextLine();
            int max = 0;
            int count = 0;
            int end = 0;
            for(int i = 0;i < str.length();i++){
                if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                    count++;
                    if(max < count){
                        max = count;
                        end = i;
                    }
                }else {
                    count = 0;
                }
            }
            System.out.println(str.substring(end - max +1,end + 1));
        }
    }
}
