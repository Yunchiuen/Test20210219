package com.ocp.day14;
//內部類別 inner class

public class Dept {//部門

    String name = "軟體部門";

    class Job {//工作

        String name = "Yun";

        void work() {
            String name = "寫程式";
            System.out.println(name);
            System.out.println(this.name);
            System.out.println(Dept.this.name);
        }
    }
}
