package com.waston.base;

/**
 * @Description: ABDCBDCB
 * for循环的流程，不解释
 * @Author: Waston
 * @Date: 2019/6/3 22:03
 */
public class OutInFor {
    static boolean out(char c){
        System.out.print(c);
        return true;
    }

    public static void main(String[] args){
        int i = 0;
        for(out('A');out('B') && (i<2);out('C')){
            i++;
            out('D');
        }
    }
}
