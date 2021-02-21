package com.ocp.day01;

public class BMIDemo02 {
    public static void main(String[] args) {
        BMIDemo("aa",150,65);
        
    }
    
    public static void BMIDemo(String name,double height,double weight){
        double result = weight / Math.pow(height / 100, 2);
        System.out.printf("%s 的身高: %.1f 體重: %.1f bmi: %.2f\n",
                name, height, weight, result);
    }
}
