
package com.ocp.day20;

public class Fruit {
    private String name;
    private Integer amout;//數量
    private Double price;//價格

    public Fruit() {
    }

    public Fruit(String name, Integer amout, Double price) {
        this.name = name;
        this.amout = amout;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAmout() {
        return amout;
    }

    public void setAmout(Integer amout) {
        this.amout = amout;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fruit{" + "name=" + name + ", amout=" + amout + ", price=" + price + '}';
    }
    
}
