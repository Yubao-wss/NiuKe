package com.waston.base;

/**
 * @Description: 命令java f a b c 运行会报错，数组越界
 * @Author: Waston
 * @Date: 2019/6/7 15:19
 */
public class PutfabcInArgs {
    public static void main(String[] args){
        String foo1 = args[1];
        String foo2 = args[2];
        String foo3 = args[3];
    }
}
