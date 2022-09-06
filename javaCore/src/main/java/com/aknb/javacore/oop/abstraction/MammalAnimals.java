package com.aknb.javacore.oop.abstraction;

public abstract class MammalAnimals implements Animal{

    protected int a;
    protected int b;

    MammalAnimals(int a, int b){
        this.a = a;
        this.b = b;
    }

    abstract void add(int x, int y);
}
