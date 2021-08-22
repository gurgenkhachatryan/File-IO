package com.company.day1;

import java.io.Serializable;

public class Person3 implements Serializable {
    String name;
   transient int age;

    public Person3(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
