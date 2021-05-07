
package com.ocp.day24;

public class MaryMain {
    public static void main(String[] args) {
        Runnable job1=new Programming();
        Runnable job2=new Report();
        
        Thread mary=new Thread(job1, "mary");
        mary.start();
        
        Runnable[] jobs={job1,job2};
        Runnable job3 =new Jobs(jobs);
        Thread helen=new Thread(job3, "helen");
        helen.start();
    }
}
