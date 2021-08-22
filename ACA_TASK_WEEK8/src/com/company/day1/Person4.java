package com.company.day1;

import java.io.Serializable;

public class Person4 implements Serializable {
    String name;
    int age;

    public Person4(String name, int age) {
        this.name = name;
        this.age = age;

    }

    @Override
    public String toString() {
        return "Person4{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
