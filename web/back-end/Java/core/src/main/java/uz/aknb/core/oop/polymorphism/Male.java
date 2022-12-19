package uz.aknb.core.oop.polymorphism;

public class Male implements Human {
    Double height;                          // Field
    Double weight;                          // Field
    String name;                         // Field
    Integer age;                           // Field

    public Male(Double height,
                Double weight,
                String name,
                Integer age){
        this.height = height;
        this.weight = weight;
        this.name = name;
        this.age = age;
    }

    @Override
    public void myName() {                          // OVERRIDING(run-time polymorphism)
        System.out.printf("My name is %S.\n", name);
    }

    @Override
    public void myAge() {                           // OVERRIDING(compile-time polymorphism)
        if (age == null){
            System.out.printf("I don't know my age!");
        } else {
            System.out.printf("May Age is %d", age);
        }
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("You must enter greater than 0");
        }
    }
}