package com.aknb.javacore.oop.abstraction;

public interface Animal {
    int count = 0;                                  // public static final int count = 0;  --> constant 0

    default void info(){                            // default methods with body
        System.out.println("Hello" + getName());
    }
    private String getName(){                       // private methods with body
        return "Animal";
    }

    static long anything(int x, int y){             // static methods with body
        return x + y;
    }

    void voice();                                   // abstract methods
    void eat();                                     // abstract methods
    void motion();                                  // abstract methods
}

// public static final fields
// private and default methods with body
// static methods with body
// abstract methods