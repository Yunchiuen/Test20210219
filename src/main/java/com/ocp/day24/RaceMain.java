
package com.ocp.day24;

public class RaceMain {
    public static void main(String[] args) {
        Race r1=new Race();
        Race r2=new Race();
        Race r3=new Race();
        //r1.job();
        //r2.job();
        //設定執行緒名稱
        r1.setName("烏龜");
        r2.setName("兔子");
        r3.setName("程咬金");//200~600可看到
        //設定權限(預設=5,範圍1~10)
        r1.setPriority(1);//烏龜被叫1次
        r2.setPriority(10);//兔子被叫10次
        //執行序啟動    不能用run他還是用main
        r1.start();
        r2.start();
        r3.start();
    }
}
