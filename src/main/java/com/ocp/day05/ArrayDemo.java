
package com.ocp.day05;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int source1[]={60,80,90,40,100};
        int source2[]=new int[5];
        source2[0]=30;
        source2[1]=80;
        source2[2]=60;
        source2[3]=50;
        source2[4]=70;
        System.out.println(source1);
        System.out.println(source2);
        System.out.printf("國文: %s\n",Arrays.toString(source1));
        System.out.printf("數學: %s\n",Arrays.toString(source2));
    }
}
