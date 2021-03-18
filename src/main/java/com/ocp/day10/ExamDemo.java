package com.ocp.day10;

class Bar {

    Bar() {
        System.out.println("a");
    }

    Bar(int x) {
        this();
        System.out.println("b");
    }
}

class Foo extends Bar {

    Foo() {
        this(10);//自己的建構子 一定要放在第一行
        System.out.println("c");
    }

    Foo(int x) {
        super(20);//父親的建構子 一定要放在第一行
        System.out.println("d");
    }
}

public class ExamDemo {

    public static void main(String[] args) {
        new Foo();
    }
}
