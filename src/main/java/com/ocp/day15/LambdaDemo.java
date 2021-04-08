package com.ocp.day15;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class LambdaDemo {

    public static void main(String[] args) {
        Integer[] radius = {10, -5, 15};
        Supplier<Double> supplier=()->Math.PI;
        Stream.of(radius)
                .filter((t)->t>0)
                .mapToDouble(t->Math.pow(t, 2)*supplier.get())
                .forEach(System.out::println);

        
    }
}
