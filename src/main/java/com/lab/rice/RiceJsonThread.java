package com.lab.rice;

import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class RiceJsonThread implements Callable<String> {

    private String path;

    public RiceJsonThread(String path) {
        this.path = path;
    }

    @Override
    public String call() throws Exception {
        URL url = new URL(path);//網路物件給他網址可以到網路上抓資料
        // \A這個 pattern 代表的是全部選擇
        // 透過 Scanner 可以將網路串流(openStream())變成字串
        //利用inputStreamReader中文編碼
        InputStreamReader isr = new InputStreamReader(url.openStream(), "utf-8");
        String path = new Scanner(isr)
                .useDelimiter("\\A").next();
        return path;

    }

}
