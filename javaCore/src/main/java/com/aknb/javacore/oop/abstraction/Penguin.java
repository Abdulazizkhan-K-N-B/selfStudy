package com.aknb.javacore.oop.abstraction;

public class Penguin implements Animal, Fish{

    Penguin(){
        System.out.println("**********> PENGUIN <**********");
    }
    @Override
    public void voice() {
        System.out.println("I'm a penguin!");
    }

    @Override
    public void eat() {
        System.out.println("I eat meat!");
    }

    @Override
    public void motion() {
        System.out.println("I can run slow!");
    }

    @Override
    public void swim() {
        System.out.println("I can swim!");
    }
}
