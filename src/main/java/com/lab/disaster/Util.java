package com.lab.disaster;

import com.google.gson.Gson;
import java.util.concurrent.FutureTask;

public class Util {

    public static Disaster[] geDisasters() {
        String path = "https://data.coa.gov.tw/Service/OpenData/TransService.aspx?UnitId=bXH3LneTczzU";
        DisasterJsonThread r1 = new DisasterJsonThread(path);

        FutureTask<String> task = new FutureTask<>(r1);
        //FutureTask<String> task=new FutureTask<>(new DisasterJsonThread(path));
        new Thread(task).start();
        try {
            String json = task.get();
            Disaster[] gson = new Gson().fromJson(json, Disaster[].class);
            return gson;

        } catch (Exception e) {
            System.out.println("資料無法取得" + e);
        }

        return null;
    }
}
