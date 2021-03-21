
package com.lab1;

public class Main4 {
    public static void main(String[] args) {
        Employee e1=new Employee(30000);
        Manange m1=new Manange(60000);
        m1.setBudget(10000);
        Director d1=new Director(90000);
        d1.setBudget(12000);
        d1.setStockOptions(80007);
        
        EmployeeUtil util=new EmployeeUtil();
        System.out.println(util.getAllSalary(e1,m1,d1));
        System.out.println(util.getAllBudget(m1,d1));
        System.out.println(util.getAllStockOptions(d1));
    }
   
}
