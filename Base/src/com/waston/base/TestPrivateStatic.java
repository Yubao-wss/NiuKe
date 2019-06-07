package com.waston.base;

/**
 * @Description: D正确，其他错误
 * @Author: Waston
 * @Date: 2019/6/7 15:36
 */
public class TestPrivateStatic {
    private float f = 1.0f;
    int m = 12;
    static int n = 1;

    public static void main(String[] args) {
        TestPrivateStatic t = new TestPrivateStatic();
        /*
        A.t.f = 1.0;
        B.this.n;
        C.TestPrivateStatic.m;
        D.TestPrivateStatic.n;
        */
    }
}
