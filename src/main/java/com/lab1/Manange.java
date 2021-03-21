package com.lab1;

public class Manange extends Employee {

    private int budget;

    public Manange() {
    }

    public Manange(int salary) {
        super(salary);
    }

    public void setBudget(int budget) {
        if (budget > 0) {
            this.budget = budget;
        }
    }

    public int getBudget() {
        return budget;
    }

}
