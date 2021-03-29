package com.ocp.day14;

interface Salary {

    int amout();//interface 預設為public

}

public class Anonymous {

    public static void main(String[] args) {
        Salary salary = new Salary() {
            @Override
            public int amout() {
                return 50000;
            }
        };
        Salary salary1=new Salary() {
            @Override
            public int amout() {
                return 80000;
            }
        };
        System.out.println(salary.amout());
        System.out.println(salary1.amout());
    }
}
