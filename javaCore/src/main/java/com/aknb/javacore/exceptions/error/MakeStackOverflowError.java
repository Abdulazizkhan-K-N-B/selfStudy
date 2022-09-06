package com.aknb.javacore.exceptions.error;

public class MakeStackOverflowError {

    public static void error(){
        sError();
    }

    private static void sError() {
        error();
    }
}
