package com.company;

import java.util.Arrays;

public class Department {
    String name;
    Department[] subDep;
    Person[] employer;
    private int employercounter = 0;

    public Department(String name, int subDep) {
        this.name = name;
        this.subDep = new Department[subDep];
        this.employer = new Person[3];
    }

    public void addEmployer(Person person) {
        employer[employercounter] = person;
        employercounter++;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", employer=" + Arrays.toString(employer) +
                '}';
    }
}
