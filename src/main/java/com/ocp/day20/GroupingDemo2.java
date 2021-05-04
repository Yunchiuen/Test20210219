package com.ocp.day20;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingDemo2 {

    public static void main(String[] args) {
        List<String> sex = Arrays.asList("男", "男", "女", "男", "女", "男", "女", "男");
        //請問男女有多少
        Map<String, Long> result = sex.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println(result);
        //請問及格與不及格各有多少
        List<Integer> score = Arrays.asList(100, 30, 100, 40, 80, 90);
        Map<String, Long> groupintByScore = score.stream()
                .collect(Collectors.groupingBy(e -> e >= 60?"及格":"不及格" , Collectors.counting()));
        System.out.println(groupintByScore);

    }
}
