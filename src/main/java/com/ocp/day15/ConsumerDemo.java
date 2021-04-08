
package com.ocp.day15;
//Consumer    消費者是interface用accept實作
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Integer radius[]={10,-5,20};
        
        Consumer<Integer> c1=(t)->System.out.println(t);
        
        print(radius, c1);
    }
    public static void print(Integer[] radius, Consumer<Integer> consumer){
        for(Integer r:radius){
            consumer.accept(r);
        }
    }
}
