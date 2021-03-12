package com.ocp.day05;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class ArrayDemo4 {

    public static void main(String[] args) {
        int source1[] = {60, 80, 90, 40, 100};
        System.out.printf("國文: %s\n", Arrays.toString(source1));
        System.out.println("-------JAVA 7--------");
        int max = 0;
        for (int s : source1) {
            if (s > max) {
                max = s;
            }
        }
        System.out.println(max);
        int min = 100;
        for (int n : source1) {
            if (n < min) {
                min = n;
            }
        }
        System.out.println(min);
        System.out.println("-------JAVA 8--------");
        min = IntStream.of(source1).min().getAsInt();
        System.out.println(min);
        max = IntStream.of(source1).max().getAsInt();
        System.out.println(max);
        System.out.println("---Java 8 統計物件---");
        IntSummaryStatistics is = IntStream.of(source1).summaryStatistics();
        System.out.println(is);
        System.out.println(is.getAverage());
        System.out.println("------");
        for (int i=0; i < source1.length; i++) {
            for (int j = i; j < source1.length; j++) {
                if (source1[i] < source1[j]) {
                    int temp = 0;
                    temp = source1[j];
                    source1[j] = source1[i];
                    source1[i] = temp;
                }
            }
        }
        for(int i:source1){
            System.out.printf("%s ",i);
        }
    }
}
