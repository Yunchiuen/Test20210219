
package com.ocp.day24;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Lambda7 {
    public static void main(String[] args) {
        List<TechName> tech=Arrays.asList(
                new TechName("java-"),
                new TechName("Oracle DB-"),
                new TechName("J2EE-")
        );
        Stream<TechName> stre=tech.stream();
        stre.map(a -> a.techName).forEach(System.out::print);
    }
}
