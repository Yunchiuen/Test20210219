package com.ocp.day06;

public class StringCompare {

    public static void main(String[] args) {
        String s1 = new String("java");
        String s2 = new String("java");
        String s3 = "java";
        String s4 = "java";
        String s5 = "JaVa";

        System.out.println(s1 == s2);//==是比較記憶體位置所以false
        System.out.println(s1.equals(s2));
        System.out.println("String POOL");
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));//equsls比較字串
        System.out.println("--------");
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
        System.out.println("--------");
        System.out.println(s1.intern() == s3);//把s1丟進字串詞裡面
        System.out.println(s1.equalsIgnoreCase(s5));// 忽略大小寫的比較
        System.out.println(s1.toUpperCase() == s5.toUpperCase());// 全部轉大寫再比較
        System.out.println(s1.toLowerCase().equals(s5.toLowerCase()));// 全部轉小寫再比較

    }
}
