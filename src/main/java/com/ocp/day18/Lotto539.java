package com.ocp.day18;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class Lotto539 {

    //樂透539電腦選號
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        Random r = new Random();

        while (set.size() < 5) {
            int n = r.nextInt(39) + 1;
            set.add(n);
        }
        System.out.println(set);
    }
}
