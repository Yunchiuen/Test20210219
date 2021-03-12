package com.ocp.day06;

public class StringUpdate {

    public static String updateString(String x) {
        x = x.concat("8");
        return x;
    }

    public static void updateStringBuilder(StringBuilder y) {
        y = y.append("8");
    }

    public static void main(String[] args) {
        String s1 = "java";
        StringBuilder s2 = new StringBuilder("java");
        updateString(s1);
        updateStringBuilder(s2);
        System.out.println(s1);
        System.out.println(s2);
        String s3 = updateString(s1);
        System.out.println(s3);
    }

}
