
package com.ocp.day24;
//要給執行緒執行的工作任務
public class Report implements Runnable{

    @Override
    public void run() {//寫程式工作
        String tname = Thread.currentThread().getName();
        System.out.println(tname +"寫PPT報表");
    }
    
}
