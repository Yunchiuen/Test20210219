package com.ocp.day05;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayDemo3 {

    public static void main(String[] args) {
        int source1[] = {60, 80, 90, 40, 100};
        System.out.printf("國文: %s\n", Arrays.toString(source1));

        int sum = IntStream.of(source1).sum();
        System.out.println(sum);

        double avg = IntStream.of(source1).average().getAsDouble();
        System.out.println(avg);
        System.out.println("------java 7-----");
        //java 7
        sum = 0;
        for (int s : source1) {
            if (s >= 60) {
                sum += s;
            }
        }
        System.out.println(sum);

        sum = 0;
        double len = 0;
        for (int s : source1) {
            if (s >= 60) {
                sum += s;
                len++;
            }
        }
        System.out.println(sum / len);

        System.out.println("------java 8-----");
        //java 8
        int summ = IntStream.of(source1).filter(x -> x >= 60).sum();
        System.out.println(summ);

        avg = IntStream.of(source1)
                .filter(x -> x >= 60) // 過濾及格分數
                .average() // 得到平均
                .getAsDouble(); // 取得平均的 double 資料
        System.out.println(avg);
    }
}
