package com.ocp.day21;

import java.util.logging.Level;
import java.util.logging.Logger;

public class AppleShare2 {

    public static void main(String[] args) {
        int n = 0;
        try {
            sunmit(n);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e);
            e.printStackTrace(System.out); // 印出程式碼詳細錯誤資訊

        }

    }

    public static void sunmit(int n) throws Exception {//throws Exception強制try catch
        if (n <= 0) {
            Exception e = new Exception("n<=0");
            throw e;
        }
        int apple = 10;
        int result = 0;
        result = apple / n;
        System.out.println(result);
    }
}
