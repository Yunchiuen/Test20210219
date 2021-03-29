package com.ocp.day12;

public class Tank extends Car implements Weapon {

    @Override
    public void move() {
        System.out.println("用履帶慢慢走");
    }

    @Override
    public void shoot() {
        System.out.println("發射炮彈");
    }
}
