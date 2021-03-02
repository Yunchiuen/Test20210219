package com.ocp.day05;

import java.util.Arrays;

public class ArrayDemo2 {

    public static void main(String[] args) {
        int source1[] = {60, 80, 90, 40, 100};
        System.out.printf("國文: %s\n", Arrays.toString(source1));

        int sum=0;
        for (int i = 0, leng = source1.length; i < leng; i++) {
            sum+=source1[i];
        }
        System.out.println(sum);
        
        int sum1=0;
        
        for(int n:source1){
            sum1+=n;
        }
        System.out.println(sum1);
        
        double avg=(double)sum/source1.length;
        System.out.println(avg);
    }
}
