package com.aknb.interview.sitelabs;

public class SiteLabs {
    public static void main(String[] args) {
        // int[] arr = new int[5];
//        Student student = new Student();
//        student.getSubjects().add("English");

        swapper(2, 7);
    }



    static void swapper(int a, int b){

        a += b;

        b = a - b;

        a -= b;
        System.out.printf("a:%d b:%d", a, b);
    }
}