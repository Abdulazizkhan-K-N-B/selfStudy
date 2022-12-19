package uz.aknb.core.oop.polymorphism;

public class Polymorphism {

    public static void main(String[] args) {
        Sportsmen sportsmen = new Sportsmen(180D, 90D, "Shohasan", 25);
        sportsmen.sayPhysic();
        sportsmen.run();
        System.out.println("******************** 1-topshiriq tugadi! ********************");
        sportsmen.run(5);
        System.out.println("******************** 2-topshiriq tugadi! ********************");
        sportsmen.run(5, 15D);
        System.out.println("******************** 3-topshiriq tugadi! ********************");
    }
}
