package com.ocp.day24;

import java.util.Arrays;
import java.util.List;

public class Lambda5 {

    public static void main(String[] args) {
        List<String> listVal = Arrays.asList("joe", "paul", "alice", "tom");
        System.out.println(
                listVal.stream().filter(s -> s.length() > 3).count()
        );
    }
}
