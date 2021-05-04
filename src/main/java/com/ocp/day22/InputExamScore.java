package com.ocp.day22;

import java.util.logging.Level;
import java.util.logging.Logger;

public class InputExamScore {

    public static void main(String[] args) {
        int score = -99;
        try {
            check(score);
        } catch (Exception e) {
            System.out.printf("score:%d 錯誤原因 %s", score, e.getMessage());
        }

    }

    public static void check(int score)  throws Exception{
        //檢驗參數
        if(score >0 || score<100){
            Exception e=new Exception("請輸入0~100整數");
            throw e;
        }
        if(score >60){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }

    }
}
