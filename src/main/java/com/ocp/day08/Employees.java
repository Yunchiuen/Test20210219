package com.ocp.day08;

import java.util.stream.Stream;

public class Employees {

    private String[] employee = {"john", "Helon", "Yun"};
    private String[][] employee2 = {{"john", "Helon", "Yun"}, {"Ai", "close"}};
    // 自行建立一個 static Employees 的物件
    private static Employees _instance = new Employees();

    // 設定 private 建構子
    private Employees() {
    }

    // 提供一個 public static 方法讓外界得到你建立的唯一物件
    public static Employees getEmployees() {
        return _instance;
    }

    public void print() {
        //Stream.of(employee).forEach(System.out::println);
        //Stream.of(employee).forEach(s -> System.out.println(s));
        for (String e : employee) {
            System.out.printf("%s",e);
        }
        System.out.println("\n2維陣列");
        for (String e[] : employee2) {
            Stream.of(e).forEach(s -> System.out.println(s));
        }
    }
}
