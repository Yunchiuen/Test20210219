package com.ocp.day16;

import java.util.function.DoubleUnaryOperator;
import java.util.function.ToDoubleFunction;
import java.util.stream.Stream;

public class PersonMain2 {

    public static void main(String[] args) {
        Person[][] people = {{new Person("Yun", 180.0, 65.0), new Person("Hane", 170.0, 60.0)},
            {new Person("Clide", 182.0, 65.0)
            ,new Person("Alex", 175.0, 50.0)
            ,new Person("John", 176.0, 70.0)}};
        
        //計算5人的bmi
        ToDoubleFunction<Person> getbmi=(t)->t.getW()/Math.pow(t.getH()/100, 2);
        
        DoubleUnaryOperator fbmi= bmi -> Math.round(bmi*100)/100.0;
        Stream.of(people)
                .flatMap(p -> Stream.of(p))//平面轉換
                .mapToDouble(getbmi)
                .map(fbmi)//4捨5入
                .forEach(System.out::println);
                
                
    }
}
