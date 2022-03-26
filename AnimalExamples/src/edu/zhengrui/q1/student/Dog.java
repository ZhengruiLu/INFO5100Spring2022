package edu.zhengrui.q1.student;

import java.util.Date;

public class Dog extends Animal{
    private String breed;

    Dog(String name, Date birthDate, String breed) {
        super(name, birthDate);
        this.breed = breed;
    }

    public void speaking(){
        System.out.println(this.getClass() + ": " + this.getName() + " is sparking");
    }

}
