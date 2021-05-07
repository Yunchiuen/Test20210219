package com.ocp.day24;
//要給執行緒執行的工作任務

public class Programming implements Runnable {

    @Override
    public void run() {//寫程式工作
        String tname = Thread.currentThread().getName();
        System.out.println(tname +"寫java程式");
        
//        Runnable report=new Report();
//        report.run();
//        Runnable report=new Report();
//        Thread mary2=new Thread(report, "mary2");
//        mary2.start();
    }

}
