package com.aknb.javacore.oop.encapsulation;
import com.aknb.javacore.oop.inheritance.Human;

public class Teacher extends Human {

    public Teacher(Double height,
                   Double weight,
                   String name,
                   Integer age) {
        super(height, weight, name, age);
    }
}
