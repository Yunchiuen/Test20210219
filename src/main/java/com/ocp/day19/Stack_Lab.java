package com.ocp.day19;

import java.util.Scanner;
import java.util.Stack;

public class Stack_Lab {

    public static void main(String[] args) {
        System.out.print("請輸入:");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char cArray[] = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : cArray) {
            stack.push(c);
        }
        while (!stack.isEmpty()) {
            char aa = stack.pop();
            System.out.print(aa);
        }
    }
}
