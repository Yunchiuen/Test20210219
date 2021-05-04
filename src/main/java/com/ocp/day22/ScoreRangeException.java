package com.ocp.day22;

public class ScoreRangeException extends Exception {

    public ScoreRangeException(int score) {
        super(score + "沒有在0~100之間");

    }

    public void reEnter() {
        System.out.println("請重新輸入");
    }
}
