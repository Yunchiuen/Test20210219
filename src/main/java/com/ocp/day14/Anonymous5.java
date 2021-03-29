package com.ocp.day14;

interface BMI {

    double calc(double h, double w);
}

public class Anonymous5 {
    public static void main(String[] args) {
        //使用lambda實現bmi
        //身高170 體重60
        BMI bmi=(double h, double w)-> Math.pow(h/100, 2);//身高/100的平方
        System.out.printf("bmi為%.2f",bmi.calc(170, 60));
        
    }
}
