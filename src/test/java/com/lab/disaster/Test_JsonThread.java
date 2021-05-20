
package com.lab.disaster;

import java.util.concurrent.FutureTask;
import org.junit.Test;

public class Test_JsonThread {
    @Test
    public void getTest(){
        String path="https://data.coa.gov.tw/Service/OpenData/TransService.aspx?UnitId=bXH3LneTczzU";
        DisasterJsonThread json=new DisasterJsonThread(path);
        
        FutureTask<String> task=new FutureTask<>(json);
        new Thread(task).start();
        try {
            System.out.println(task.get());
            
        } catch (Exception e) {
        }
        
    }
}
