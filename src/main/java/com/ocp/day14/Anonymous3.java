package com.ocp.day14;

interface Add {

    void calc(int x, int y);
}

public class Anonymous3 {
    public static void main(String[] args) {
        Add add=new Add() {
            @Override
            public void calc(int x, int y) {
                System.out.println(x+y);
            }
        };
        add.calc(10, 30);
        //lambda 方法名稱不重要 
        Add java8=(int x, int y)-> System.out.println(x-y);
        java8.calc(10, 30);
    }
}
