package com.ocp.day27;

public class Cookies {
    //數量
    private int amount;
    private boolean empty=true;//盤子的狀態

    public Cookies(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
    
    public synchronized void put(int n) {
        if(!empty){
            try {
                wait();//讓執行緒進入等待狀態並解除鎖(synchronized)
            } catch (Exception e) {
                
            }
        }
        System.out.printf("主人放第%d塊餅乾\n", n);
        
        empty=false;
        notify();//通知小狗來吃餅乾
    }

    public synchronized void eat(int n) {
        if(empty){
            try {
                wait();
            } catch (Exception e) {
                
            }
        }
        System.out.printf("小狗吃第%d塊餅乾\n", n);
        
        empty=true;
        notify();//通知主人來放餅乾
    }
    
    
}
