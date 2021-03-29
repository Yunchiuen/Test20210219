package com.ocp.day14;

public class MethodInnerClass {

    void foo() {
        int y = 2;//因為內部類別有用 java8會自動轉成final
        //y = 4;
        class Hello {

            void print() {
                System.out.println(y);
            }
        }
    }

}
