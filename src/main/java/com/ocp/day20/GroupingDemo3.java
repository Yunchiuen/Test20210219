
package com.ocp.day20;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class GroupingDemo3 {
    public static void main(String[] args) {
        List<Fruit> fruits=Arrays.asList(
                new Fruit("apple", 10, 9.9),
                new Fruit("banana", 20, 19.9),
                new Fruit("orange", 10, 29.9),
                new Fruit("watermelon", 10, 29.9),
                new Fruit("papaya", 20, 9.9),
                new Fruit("apple", 10, 9.9),
                new Fruit("banana", 20, 19.9)
        );
        //1根據price來分組 
        Map<Double,List<Fruit>> qroupingPrice=fruits.stream()
                .collect(Collectors.groupingBy(Fruit::getPrice));
        System.out.println(qroupingPrice);
        //2相同的price是哪些水果
        Map<Double,List<String>> qroupingPrice2=fruits.stream()
                .collect(Collectors.groupingBy(Fruit::getPrice,Collectors.mapping(Fruit::getName, toList())));
        System.out.println(qroupingPrice2);
        
        Map<Double,Set<String>> qroupingPrice3=fruits.stream()
                .collect(Collectors.groupingBy(Fruit::getPrice,Collectors.mapping(Fruit::getName, toSet())));
        System.out.println(qroupingPrice3);
    }
}
