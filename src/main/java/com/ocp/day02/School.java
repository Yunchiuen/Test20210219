package com.ocp.day02;

public class School {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        s1.schoolName="台大";
        s2.schoolName="交大";
        s1.name="joe";
        s1.age=18;
        s2.name="hane";
        s2.age=17;
        s1.print();
        s2.print();
    }
}
