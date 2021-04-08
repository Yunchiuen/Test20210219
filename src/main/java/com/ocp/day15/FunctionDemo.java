package com.ocp.day15;

import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {
        Integer[] result = {10, 20, 30, 40, 50};
        Consumer<Double> consumer = (r) -> System.out.printf("%.2f\n", r);
        Function<Integer, Double> function = (t) -> Math.pow(t, 2) * Math.PI;
        print(result, consumer, function);
    }
    
    //計算圓面積
    public static void print(Integer[] result, Consumer<Double> consumer, Function<Integer, Double> function) {
        for (Integer r : result) {
            Double area = function.apply(r);
            consumer.accept(area);
        }
    }
}
