package com.lab.lab1;

public class Director extends Manange {

    private int stockOptions;

    public Director() {
    }

    public Director(int salary) {
        setSalary(salary);
    }

    public void setStockOptions(int stockOptions) {
        if (stockOptions > 0) {
            this.stockOptions = stockOptions;
        }
    }

    public int getStockOptions() {
        return stockOptions;
    }

}
