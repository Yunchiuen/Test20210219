
package com.lab.test_rice;

import com.lab.rice.RiceJsonThread;
import java.util.concurrent.FutureTask;
import org.junit.Test;

public class Test_RiceJsonThread {
    
    @Test
    public void Test(){
        // Json 資料網址
        String path="https://data.coa.gov.tw/Service/RedirectService.aspx?UnitId=268&url=https%3a%2f%2fdata.coa.gov.tw%2fService%2fOpenData%2fFromM%2fAgricultureiRiceFailure.aspx";
        // 建立 task 工作, 工作內容是 new JsonThread(path)
        FutureTask<String> task=new FutureTask<>(new RiceJsonThread(path));
        // 建立執行緒來執行 task 的工作
        new Thread(task).start();
        
        try {
            // 利用 get() 來得到工作回報
            String json = task.get(); // 取得 json 資料
            System.out.println(json);
        } catch (Exception e) {
        }
    }
}
