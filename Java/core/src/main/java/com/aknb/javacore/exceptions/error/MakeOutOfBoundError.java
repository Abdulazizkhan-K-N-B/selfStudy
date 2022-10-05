package com.aknb.javacore.exceptions.error;

import java.util.LinkedList;
import java.util.List;

public class MakeOutOfBoundError {

    public static void error(){
        String s = "Hello";
        List<String> stringList = new LinkedList<>();
        for (int i = 0; i < 1_000_000; i++) {
            s += i;
            stringList.add(s);
        }
        System.out.println(s);
    }
}
