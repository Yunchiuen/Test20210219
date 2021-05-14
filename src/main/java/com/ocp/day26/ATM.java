
package com.ocp.day26;

public class ATM {
    public static void main(String[] args) {
        Accout accout=new Accout(10000);
        //單工模式
        accout.withdraw(5000);
        accout.withdraw(4000);
        accout.withdraw(3000);
    }
}
