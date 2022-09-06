package com.aknb.javacore.oop.encapsulation;

import org.aknb.oop.inheritance.Human;

public class Teacher extends Human {

    public Teacher(Double height,
                   Double weight,
                   String name,
                   Integer age) {
        super(height, weight, name, age);
    }
}
