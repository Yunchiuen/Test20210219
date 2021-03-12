package com.ocp.day07;

public class Employee {

    private String name;
    private String language;
    private int age;
    private int salary;

    public Employee() {
    }

    public Employee(String name, String language, int age, int salary) {
        this.name = name;
        this.language = language;
        this.age = age;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public void setSalary(int salary) {
        if (salary >= 5000) {
            this.salary = salary;
        }
    }

    public String getName() {
        return name;
    }

    public String getLanguage() {
        return language;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", language=" + language + ", age=" + age + ", salary=" + salary + '}';
    }

}
