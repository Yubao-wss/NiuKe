package com.waston.NowCode;

import java.util.Stack;

/**
 * @Description: 对于一个字符串，请设计一个算法，判断其是否为一个合法的括号串。
 * 给定一个字符串A和它的长度n，请返回一个bool值代表它是否为一个合法的括号串。
 * 测试样例：
 * "(()())",6
 * 返回：true
 * 测试样例：
 * "()a()()",7
 * 返回：false
 * 测试样例：
 * "()(()()",7
 * @Author: Waston
 * @Date: 2019/5/31 18:47
 */
public class Parenthesis {
    public boolean chkParethesis(String A,int n){
        Stack<Character> lefts = new Stack<Character>();
        if(A == null || A.length() != n){
            return false;
        }
        for(int i = 0;i < n;i++){
            if(A.charAt(i) == '('){
                lefts.push(A.charAt(i));
            }else if(A.charAt(i) == ')'){
                if(lefts.empty()){
                    return false;
                }else {
                    lefts.pop();
                }
            }else {
                return false;
            }
        }
        if(!lefts.empty()){
            return false;
        }else {
            return true;
        }
    }
}
