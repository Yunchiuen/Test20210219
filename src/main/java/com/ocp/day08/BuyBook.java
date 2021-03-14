package com.ocp.day08;

public class BuyBook {

    public static void main(String[] args) {
        System.out.println(Book.publich());

        Book b = new Book(100);
        System.out.println(b.getPages());
        System.out.println(new Book(200).getPages());

    }
}
