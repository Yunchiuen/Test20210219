
package com.lab1;

public class Main3 {
    public static void main(String[] args) {
        Director d1=new Director(80000);
        d1.setBudget(40000);
        d1.setStockOptions(80000);
        Director d2=new Director(88000);
        d2.setBudget(50000);
        d2.setStockOptions(80000);
        Director[] directors={d1,d2};
        EmployeeUtil util=new EmployeeUtil();
        System.out.println(util.getAllSalary(directors));
        System.out.println(util.getAllBudget(directors));
        System.out.println(util.getAllStockOptions(directors));
    }
}
