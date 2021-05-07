package com.ocp.day22;

import java.util.Arrays;
import java.util.List;

public class MyException {

    public static void main(String[] args) {
        
        try {
            checkFood("珍珠奶茶");
        } catch (BadFoodException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkFood(String food) throws BadFoodException {
        List<String> badfoods = Arrays.asList("炸雞", "薯條", "珍珠奶茶");
        for (String bad : badfoods) {
            if (food.equals(bad)) {
                System.out.printf("%s是垃圾食物\n", food);
                BadFoodException e = new BadFoodException("error");
                throw e;
            }
        }
        System.out.printf("%s不是垃圾食物\n", food);
    }
}
