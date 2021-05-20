
package com.lab.rice;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Rice[] rices=Util.getRice();
        System.out.println(rices.length);
        Stream.of(rices).filter(c -> c.get品名().contains("壽司米"))
                .forEach(System.out::println);
    }
}
