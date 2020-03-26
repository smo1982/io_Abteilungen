package com.company;

public class Company {
    String name;
    Department[] company;
    private int companyCounter = 0;

    public Company(String name, int dep) {
        this.name = name;
        this.company = new Department[dep];

    }

    public void addDepartment(Department department) {
        this.company[companyCounter] = department;
        companyCounter++;

    }
}
