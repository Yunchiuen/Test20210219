package com.ocp.day25;


class Father extends Thread {

    public void run() {
        System.out.println("爸爸下班回家");
        System.out.println("爸爸準備洗澡");
        System.out.println("爸爸發現沒熱水");
        System.out.println("爸爸請瓦斯工人送瓦斯");
        Worker worker = new Worker();
        worker.start();
        try {
            //Thread.sleep(6000);//將自身執行緒暫停一段時間讓其他執行緒可以執行。
            worker.join(6000);//最多等6秒 就去洗澡  
            //可指名要哪一個執行緒 join 進來執行並且可以設定join執行的時間。
            //使用 join() 方法會暫停目前正在執行的執行緒，直到被 join 的執行緒執行完畢(或執行一段時間)為止 。
        } catch (InterruptedException e) {
            
        }
        System.out.println("爸爸開始洗澡");
        System.out.println("爸爸洗完澡");
    }

}

class Worker extends Thread {

    public void run() {
        System.out.println("瓦斯工人送準備瓦斯");
        for (int i = 1; i <= 5; i++) {
            try {
                System.out.print(i + "秒鐘");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("工人發生意外" + e);
            }
        }
        System.out.println("\n瓦斯工人將瓦斯送達");
    }

}

public class Shower {

    public static void main(String[] args) {
        Father father = new Father();
        father.start();
    }
}
