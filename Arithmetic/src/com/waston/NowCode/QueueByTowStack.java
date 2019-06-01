package com.waston.NowCode;

import java.util.Stack;

/**
 * @Description: 用两个栈实现队列
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 *
 * 【解题思路】：
 * 栈1用来作入队列
 * 栈2用来出队列，当栈2为空时，栈1全部出栈到栈2,栈2再出栈（即出队列）
 * @Author: Waston
 * @Date: 2019/6/1 18:56
 */
public class QueueByTowStack {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void push(int node){
        stack1.push(node);
    }

    public int pop(){
        if(stack1.empty() && stack2.empty()){
            throw new RuntimeException("Queue is empty!");
        }
        if(stack2.empty()){
            while(!stack1.empty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
