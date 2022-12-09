package uz.aknb.core.oop.abstraction;

public class Tiger implements Animal{

    Tiger(){
        System.out.println("**********> TIGER <**********");
    }
    @Override
    public void voice() {
        System.out.println("I'm tiger!");
    }

    @Override
    public void eat() {
        System.out.println("I eat meat!");
    }

    @Override
    public void motion() {
        System.out.println("I run very fast!");
    }
}
