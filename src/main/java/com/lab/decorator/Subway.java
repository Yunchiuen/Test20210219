package com.lab.decorator;

public class Subway {
    public static void main(String[] args) {
        Food food=new Bread();
        food=new Ham(food);
        food=new Lettuce(food);
        System.out.printf("商品:%s\n價錢:%d",food.getName(),food.getPrice());
    }
            
}
