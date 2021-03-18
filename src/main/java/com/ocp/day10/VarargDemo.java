package com.ocp.day10;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class VarargDemo {

    public static void main(String[] args) {
        if (true) {
            System.out.println("helloworld");
        }
        System.out.println(add(10,20));
        System.out.println(add(10,20,30));
        int[] valus={10,20,30,40,50};
        System.out.println(add(valus));
    }

    public static int add(int... a) {
        return IntStream.of(a).sum();
    }
}
