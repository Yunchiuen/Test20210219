package com.ocp.day24;

public class Race extends Thread {//創建子執行序 1.extends Thread
    //2.工作
    @Override
    public void run() {
        job();
    }

    private void job() {
        //執行序名稱    main主執行序
        String rname = Thread.currentThread().getName();
        for (int i = 0; i <= 1000; i++) {
            if (rname.equals("程咬金") && (i < 200 || i > 600)) {
                continue;
            }
            System.out.printf("%s 跑了 %d 步\n", rname, i);
        }
    }
}
