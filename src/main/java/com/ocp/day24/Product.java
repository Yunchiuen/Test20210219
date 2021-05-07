package com.ocp.day24;

public class Product {
    int id;
    int price;

    public Product(int id, int price) {
        this.id = id;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", price=" + price + '}';
    }
    
}
