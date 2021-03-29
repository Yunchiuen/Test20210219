
package com.ocp.day13;

public class Main1 {
    public static void main(String[] args) {
        Animal b1=new Bird();
        b1.eat();//eat沒覆寫呼叫預設
        Animal e1=new EDog();
        e1.eat();
    }
}
