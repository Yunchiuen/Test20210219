package com.lab1;

public class Main2 {

    public static void main(String[] args) {
        Manange m1 = new Manange(60000);
        m1.setBudget(10000);
        Manange m2 = new Manange(62000);
        m2.setBudget(17000);
        Manange m3 = new Director(82000);
        m3.setBudget(15000);
        Manange[] m={m1,m2,m3};
        EmployeeUtil util = new EmployeeUtil();
        int sum=util.getAllBudget(m);
        int sum2=util.getAllSalary(m);
        System.out.println(sum);
        System.out.println(sum2);
    }
}
