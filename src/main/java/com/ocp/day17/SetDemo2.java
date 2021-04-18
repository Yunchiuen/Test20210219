package com.ocp.day17;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo2 {

    public static void main(String[] args) {
        //加入泛型<Integer>
        Set<Integer> set = new LinkedHashSet<>();
        set.add(100);
        set.add(80);
        set.add(90);
        set.add(null);
        //計算總分(java 7)
        Iterator<Integer> it = set.iterator();
        int sum = 0;
        while (it.hasNext()) {
            Integer next = it.next();
            if (next != null) {
                sum += next;
            }
        }
        System.out.println(sum);
        //計算總分(java 8)
        int sum2 = set.stream()
                .filter(s -> s != null)
                .mapToInt(s -> s.intValue())//java 5會自動拆包
                .sum();
        System.out.println(sum2);
    }
}
