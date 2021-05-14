
package com.ocp.day26;

public class WithrawThread extends Thread{
    private Accout accout;
    private int amount;
    public WithrawThread(Accout accout,int amount) {
        this.accout = accout;
        this.amount=amount;
    }
    
    @Override
    public void run() {
        accout.withdraw(amount);
    }
    
}
