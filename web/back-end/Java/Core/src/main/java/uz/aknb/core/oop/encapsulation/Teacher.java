package uz.aknb.core.oop.encapsulation;
import uz.aknb.core.oop.inheritance.Human;

public class Teacher extends Human {

    public Teacher(Double height,
                   Double weight,
                   String name,
                   Integer age) {
        super(height, weight, name, age);
    }
}
