package com.ocp.day07;

public class EmployeeDemo {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setName("yun");
        e1.setLanguage("java");
        e1.setAge(19);
        e1.setSalary(35000);
        System.out.println(e1.toString());

        Employee e2 = new Employee("Tom", "python", 20, 30000);
        System.err.println(e2);

    }
}
