package com.lab.lab1;

public class Employee {

    private int salary;

    public Employee() {
    }

    public Employee(int salary) {
        setSalary(salary);
    }

    public void setSalary(int salary) {
        if (salary > 0) {
            this.salary = salary;
        }else{
            System.out.println("沒薪水?");
        }
    }

    public int getSalary() {
        return salary;
    }

}
