
package com.ocp.day25;

public class WorkThread extends Thread{

    @Override
    public void run() {
        String tname=Thread.currentThread().getName();
         for (int i = 1000; i > 0; i--) {
            System.out.printf("%d : %s\n", i, tname);
        }
    }
    
    public static void main(String[] args) {
         //建立執行序userThread  子執行序
        WorkThread wt1 = new WorkThread();
        WorkThread wt2 = new WorkThread();
        wt1.setName("t1");
        wt2.setName("t2");
        wt1.setPriority(Thread.MAX_PRIORITY);
        wt2.setPriority(Thread.MIN_PRIORITY);
        wt2.setDaemon(true);//背景執行序
        wt1.start();
        wt2.start();
        System.out.println(Thread.activeCount());//活著的執行序有幾個 t1 t2 main
    }
}
