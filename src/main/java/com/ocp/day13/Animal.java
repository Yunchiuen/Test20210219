package com.ocp.day13;

public interface Animal {

    void move();//interface 預設為public
    
    //interface 內使用default繼承不需要覆寫
    default void eat() {
        System.out.println("吃罐頭食品");
    }
}
