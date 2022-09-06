package com.aknb.javacore.oop.inheritance;

public class Student extends Human{

    Integer course;
    Double mark;

    public Student(Integer course,
                   Double mark){
        super(150D, 45D, "AnyBody0", 12);
        this.course = course;
        this.mark = mark;
    }

    public void info(){
        System.out.printf("I'm a student." +
                "\nMy level is %d" +
                "\nMy mark is %.1f" +
                "\nMy weight is %.1f" +
                "\nMy height is %.1f", course, mark, weight, height);
    }
}
