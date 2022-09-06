package com.aknb.javacore.oop.inheritance;

public class Human {

    Double height;                          // default Field allowed ,this class, this pkg
    Double weight;                          // default Field allowed ,this class, this pkg
    protected String name;                  // Field allowed ,this class, this pkg, subclass same or not pkg
    protected Integer age;                  // Field allowed ,this class, this pkg, subclass same or not pkg
    private Double salary;                  // Field allowed only this class
    private String jobTitle;                // Field allowed only this class

    public Human(Double height,
                 Double weight,
                 String name,
                 Integer age){
        this.height = height;
        this.weight = weight;
        this.name = name;
        this.age = age;
    }

    public void myName() {
        System.out.printf("My name is %S.\n", name);
    }

    public void myAge() {
        if (age == null) {
            System.out.println("I don't know my age!");
        } else {
            System.out.printf("May Age is %d\n", age);
        }
    }

    // SECONDARY FUNCTIONS

    public Double getSalary() {
        if (this.salary == 0){
            System.out.println("The salary is 0");
            return 0D;
        } else {
            return salary;
        }
    }

    public void setSalary(Double salary) {
        if (salary < 2_000_000) {
            System.out.println("2 milliondan kam oylik to'g'ri kelmaydi!");
        } else {
            this.salary = salary;
        }
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
}