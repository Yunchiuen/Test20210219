package com.ocp.day22;

public class Propagate {

    public static void main(String[] args) {
        String s = "1234";
        try {
            System.out.println(reverse(s));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("已完成");
        }
    }

    public static String reverse(String s) throws Exception {
        if (s.length() == 0) {
            Exception e = new Exception("請輸入大於0的字串");
            throw e;
        }
        String reverseStr = "";
        for (int i = s.length() - 1; i >= 0; --i) {
            reverseStr += s.charAt(i);
        }
        return reverseStr;

    }
}
