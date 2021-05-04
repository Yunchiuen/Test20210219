
package com.ocp.day20;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BookDemo {
    public static void main(String[] args) {
        List<Book> books=Arrays.asList(
                new Book("Beginning with java", 2)
                ,new Book("a guide to java tour", 3));
        Collections.sort(books,new Book());
        System.out.print(books);
    }
}
