
package com.ocp.day19;

import java.util.Stack;

public class StatckDemo {
    public static void main(String[] args) {
        //堆疊先進後出
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 10; i++) {
            stack.push(i); 
        }
        System.out.println(stack);
        if(!stack.isEmpty()){
            int value=stack.pop();//先刪除堆疊中最頂部的對象，並將該對像作為此函數的值返回。
            System.out.println(value+" "+stack);
        }
        System.out.println(stack.peek());//查看堆疊最頂部的對象
    }
}
