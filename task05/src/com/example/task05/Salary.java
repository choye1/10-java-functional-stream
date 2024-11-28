package com.example.task05;

public class Salary implements IMail<Integer> {
    String companyName;
    String to;
    int salary;

    Salary(String companyName, String name, int salary) {
        this.companyName = companyName;
        this.to = name;
        this.salary = salary;
    }

    public String getFrom() {
        return companyName;
    }

    public String getTo() {
        return to;
    }

    public Integer getContent() {
        return salary;
    }
}