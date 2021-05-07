
package com.ocp.day24;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Lambda6 {
    public static void main(String[] args) {
        List<String> nL = Arrays.asList("jim", "john", "jeff");
        Function<String,String> funVal=s -> "Hello".concat(s);
        nL.stream().map(funVal).peek(System.out::print);
        
    }
}
