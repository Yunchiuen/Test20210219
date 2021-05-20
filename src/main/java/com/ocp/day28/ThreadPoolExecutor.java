package com.ocp.day28;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Lotto implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        Thread.sleep(new Random().nextInt(1000));
        int num= new Random().nextInt(100);
        //System.out.println(num);
        return num;
    }

}

public class ThreadPoolExecutor {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("請給我Lotto數字");
        ExecutorService service = Executors.newCachedThreadPool();

        for (int i = 1; i <= 3; i++) {
            
            System.out.printf("第 %d 組 計算中...\n",i);
            Future future = service.submit(new Lotto());
            System.out.println(future.get());
        }
        System.out.println(":"+Thread.activeCount());
        service.shutdown();
    }
}
