package com.lab.lab1;

public class Main1 {

    public static void main(String[] args) {
        Employee e1 = new Employee(32000);
        Employee e2 = new Employee(35000);
        Employee e3 = new Employee(38000);
        Employee e4 = new Manange(60000);
        Employee e5 = new Manange(62000);
        Employee e6 = new Director(82000);
        Employee[] e={e1,e2,e3,e4,e5,e6};
        EmployeeUtil util = new EmployeeUtil();
        int sum=util.getAllSalary(e);
        System.out.println(sum);
        int sum2=util.getAllSalary(e4,e5);
        System.out.println(sum2);
        
        
    }
}
