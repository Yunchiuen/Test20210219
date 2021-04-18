package com.ocp.day16;

import java.util.Objects;

public class Person {

    private String name;
    private Double h;
    private Double w;

    public Person() {
    }

    public Person(String name, Double h, Double w) {
        this.name = name;
        this.h = h;
        this.w = w;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getH() {
        return h;
    }

    public void setH(Double h) {
        this.h = h;
    }

    public Double getW() {
        return w;
    }

    public void setW(Double w) {
        this.w = w;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", h=" + h + ", w=" + w + '}';
    }

    @Override
    public boolean equals(Object obj) {
        //obj是否繼成Person
        if (obj instanceof Person) {
            Person p = (Person) obj;
            if (name.equals(p.name) 
                    && h.doubleValue()==p.h.doubleValue() 
                    && w.doubleValue()==p.w.doubleValue()) {
                return true;
            }
        }
        return false;
    }

    @Override //離散數學 2質數相乘*物件int型別
    public int hashCode() {
        return 7 * 11 * name.hashCode() * h.intValue() * w.intValue();
    }
    
}
