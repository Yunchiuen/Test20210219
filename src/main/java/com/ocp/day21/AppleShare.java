package com.ocp.day21;

public class AppleShare {

    public static void main(String[] args) {
        int n = 0;//人數
        try {
            sunmit(n);
        } catch (Exception e) {
            System.out.println("錯誤原因: " + e.getMessage());
            System.out.println(e.getLocalizedMessage());
            System.out.println(e);
        }
        
    }

    public static void sunmit(int n) {
        if (n <= 0) {
            ArithmeticException e = new ArithmeticException("n<=0");
            throw e;
        }
        int apple = 10;
        int result = 0;
        result = apple / n;
        System.out.println(result);
    }
}
