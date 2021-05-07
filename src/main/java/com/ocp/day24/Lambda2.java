package com.ocp.day24;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Lambda2 {
    
    public static void main(String[] args) {
        List<String> color = Arrays.asList("red", "green", "yellow");
        Predicate<String> test = n -> {
            System.out.println("sss");
            return n.contains("red");
        };
        color.stream().filter(c -> c.length()>3).allMatch(test);
    }
}
