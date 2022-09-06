package com.aknb.javacore.oop.polymorphism;

public class Sportsmen extends Male {

    public Sportsmen(Double height, Double weight, String name, Integer age) {
        super(height, weight, name, age);
    }

    public void sayPhysic() {
        System.out.printf("Ismim: %s,\nYoshim: %d,\nBo'yim: %.1f,\nVaznim: %.1f", name, getAge(), height, weight);
    }

    public void run() {                                  // OVERLOADING(compile-time polymorphism)
        System.out.println("Men yuguryapman . . .");
    }

    public void run(int minute) {                        // OVERLOADING(compile-time polymorphism)
        for (int i = 0; i < minute; i++) {
            System.out.println("Men %d-daqiqada yuguryapman . . .");
        }
    }

    public void run(int minute, Double extraWeight) {    // OVERLOADING(compile-time polymorphism)
        for (int i = 0; i < minute; i++) {
            System.out.printf("Men %d-daqiqada %.1f kg vaznim va %.1f kg ortiqcha yuk bilan yuguryapman . . .\n", i + 1, weight, extraWeight);
        }
    }

    public void run(Double extraWeight, int minute) {    // OVERLOADING(compile-time polymorphism)
        for (int i = 0; i < minute; i++) {
            System.out.printf("Men %d-daqiqada %.1f kg vaznim va %.1f kg ortiqcha yuk bilan yuguryapman . . .\n", i + 1, weight, extraWeight);
        }
    }
}