package com.lab1;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EmployeeUtil {

    // 取得所有員工的薪資
    public int getAllSalary(Employee... employees) {
        return Stream.of(employees).mapToInt(e -> e.getSalary()).sum();
    }

    // 取得所有經理(Manager)的預算(Budget)
    public int getAllBudget(Manange... managers) {
        return Stream.of(managers).mapToInt(m -> m.getBudget()).sum();
    }

    // 取得所有董事(Director)的股票選擇權(StockOptions)
    public int getAllStockOptions(Director... directors) {
        return Stream.of(directors).mapToInt(d -> d.getStockOptions()).sum();
    }

    // 公差一員
    public Employee getRandomEmployee() {
        int n = new Random().nextInt(3);
        switch (n) {
            case 0:
                return new Employee(30000);
            case 1:
                Manange m=new Manange(60000);
                m.setBudget(10000);
                return m;
            default:
                Director d=new Director(80000);
                d.setBudget(10000);
                d.setStockOptions(20000);
                return d;
        }
    }
}
