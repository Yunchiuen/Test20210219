package com.ocp.day09;

public class Main {

    public static void main(String[] args) {
        Employee john = new Employee("john", new Salary(30000, 1000));

        System.out.printf("%s 的薪資是 $%,d\n", john.getName(), john.getSalary().getMoney());
    }
}
