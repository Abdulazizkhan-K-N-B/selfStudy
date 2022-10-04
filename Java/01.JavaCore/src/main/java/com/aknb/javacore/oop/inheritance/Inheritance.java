package com.aknb.javacore.oop.inheritance;

public class Inheritance {

    public static void main(String[] args) {

        Student student = new Student(3, 7D);
        student.name = "Abdulkadir";
        student.age = 19;
        student.height = 180D;
        student.weight = 60D;
        student.myName();
        student.myAge();
        student.info();

    }
}
