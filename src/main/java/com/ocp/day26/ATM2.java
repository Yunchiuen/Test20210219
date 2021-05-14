package com.ocp.day26;

public class ATM2 {

    public static void main(String[] args) {
        Accout accout = new Accout(10000);
        Thread t1 = new WithrawThread(accout, 5000);
        Thread t2 = new WithrawThread(accout, 4000);
        Thread t3 = new WithrawThread(accout, 3000);
        t1.setName("小滑");
        t2.setName("小英");
        t3.setName("小明");
        t1.start();
        t2.start();
        t3.start();
    }
}
