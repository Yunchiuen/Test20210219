
package com.ocp.day03.bar;


public class B {
    public static void main(String[] args) {
        B b=new B();
        b.i_want_money();
    }
    void i_want_money() {
        A a = new A();
        System.out.println(a.money);
    }
}
