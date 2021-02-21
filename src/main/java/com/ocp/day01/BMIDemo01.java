package com.ocp.day01;

public class BMIDemo01 {

    public static void main(String[] args) {
        String name = "John";
        double height = 170; // 170.0
        double weight = 60;
        double result = weight / Math.pow(height / 100, 2);
        System.out.printf("%s 的身高: %.1f 體重: %.1f bmi: %.2f\n",
                name, height, weight, result);

        String name1 = "ko";
        double height1 = 180; // 170.0
        double weight1 = 50;
        double result1 = weight1 / Math.pow(height1 / 100, 2);
        System.out.printf("%s的身高: %.1f體重: %.1f bmi: %.2f", name1, height1, weight1, result1);
    }
}
