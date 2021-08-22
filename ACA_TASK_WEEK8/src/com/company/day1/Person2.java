package com.company.day1;

import java.io.Serializable;

public class Person2 implements  Serializable{
    String name;
    int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
