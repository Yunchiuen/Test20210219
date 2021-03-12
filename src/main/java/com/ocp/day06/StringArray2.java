package com.ocp.day06;

import java.util.Arrays;

public class StringArray2 {

    public static String[] updateStudent() {
        String[] student = {"Mary", "60"};
        return student;
    }

    public static void main(String[] args) {
        String[] student = {"John", "70"};
        System.out.println(Arrays.toString(student));
        //學生交換
        student=updateStudent();
        System.out.println(Arrays.toString(student));
    }
}
