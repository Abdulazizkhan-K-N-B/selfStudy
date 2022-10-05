package com.aknb.javacore.oop.abstraction;

public class Rabbit implements Animal{
    String name;
    static int number;
    Rabbit(String name){
        this.name = name;
        System.out.printf("**********> %S <**********\n", name);
    }
    @Override
    public void voice() {
        System.out.println("I'm a rabbit!");
    }

    @Override
    public void eat() {
        System.out.println("I eat carrot!");
    }

    @Override
    public void motion() {
        System.out.println("I can jump high!");
    }
}
