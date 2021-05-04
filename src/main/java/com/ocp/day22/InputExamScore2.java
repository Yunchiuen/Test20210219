package com.ocp.day22;

public class InputExamScore2 {

    public static void main(String[] args) {
        int score=-100;
        try {
            check(score);
        } catch (ScoreRangeException e) {
            System.out.println(e.getMessage());
            e.reEnter();
        }
    }

    public static void check(int score) throws ScoreRangeException {
        //檢驗參數
        if (score < 0 || score > 100) {
            ScoreRangeException e = new ScoreRangeException(score);
            throw e;
        }
        if(score>=60){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }
    }
}
