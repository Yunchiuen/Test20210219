package com.ocp.day15;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {
        Integer[] radius={10,-5,15};
        Consumer<Double> consumer=(t)->System.out.printf("%.2f\n",t);
        Function<Integer,Double> function=t->Math.pow(t, 2)*Math.PI;
        Predicate<Integer> predicate=(t)->t>0;
        print(radius, consumer, function, predicate);
    }

    public static void print(Integer[] radius
            ,Consumer<Double> consumer
            ,Function<Integer,Double> function
            ,Predicate<Integer> predicate) {
        for(Integer r:radius){
            if(predicate.test(r)){
                Double area=function.apply(r);
                consumer.accept(area);
            }
        }
    }
}
