package com.lab.lab1;

public class Main5 {

    public static void main(String[] args) {
        EmployeeUtil util = new EmployeeUtil();
        Employee emp = util.getRandomEmployee();
        System.out.println(emp.getClass().getSimpleName());
        System.out.println(emp.getSalary());
        if (emp instanceof Manange) {//instanceof判斷是否繼承
            Manange m = (Manange) emp;
            System.out.println("Budget:"+m.getBudget());
        }
        if(emp instanceof Director){
            Director d=(Director)emp;
            System.out.println("Director:"+d.getStockOptions());
        }
    }
}
