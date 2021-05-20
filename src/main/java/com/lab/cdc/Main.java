
package com.lab.cdc;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        CDC[] cdcs=Util.getCdcs();
        System.out.println(cdcs.length);
        Stream.of(cdcs)
                .filter(c -> c.getSent().contains("2021-05-14"))
                //.filter(c -> c.getSent().contains("美國"))
                .forEach(c -> System.err.println(c.getHeadline()+ ":" +c.getDescription().trim()));
    }
}
