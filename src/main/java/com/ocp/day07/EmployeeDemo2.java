package com.ocp.day07;

import java.util.stream.Stream;

public class EmployeeDemo2 {
    
    public static void main(String[] args) {
        Employee e1 = new Employee("Tom1", "python", 20, 10000);
        Employee e2 = new Employee("Tom2", "php", 30, 20000);
        Employee e3 = new Employee("Tom3", "c", 40, 30000);
        Employee e4 = new Employee("Tom4", "java", 50, 40000);
        Employee e[] = {e1, e2, e3, e4};
        System.out.println(e);
        for (Employee s : e) {
            System.out.println(s);
        }
        //java 8
        Stream.of(e).forEach(s -> System.err.println(s));
        Stream.of(e).forEach(System.out::println);
    }
}
