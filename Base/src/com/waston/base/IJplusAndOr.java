package com.waston.base;

/**
 * @Description: i=1 j=0
 * @Author: Waston
 * @Date: 2019/6/7 21:26
 */
public class IJplusAndOr {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        if((++i > 0)||(++j > 0)){
            System.out.println("i="+i+" "+"j="+j);
        }

        char c = 1;
        short s = 2;
        float f = (float) 3.0;
        double d = 4.0;
        System.out.println(c*s+f+d);
    }
}
