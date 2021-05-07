package com.ocp.day24;

public abstract class Lambda4 implements Moveable{

    public static void main(String[] args) {
        Moveable<Integer> animal=n -> System.out.println("Running" + n);
        
        animal.run(100);
        animal.walk(20);
    }
}
