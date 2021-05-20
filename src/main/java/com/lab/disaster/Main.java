
package com.lab.disaster;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Disaster[] disasters=Util.geDisasters();
        Stream.of(disasters).filter(s -> s.getEventName().contains("颱風")).forEach(System.out::println);
    }
}
