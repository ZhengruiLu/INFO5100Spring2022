package edu.zhengrui.q1.student;

import java.util.Date;

public class Elephant extends Mammal{
    private boolean isFemale;

    public Elephant(String name, Date birthDate, boolean isFemale){
        //must call super first
        super(name, birthDate);
        System.out.println("I'm inside Elephant Constructor");
        this.isFemale = true;
    }

    @Override
    public void eat() {
        System.out.println("I'm eating yummy mammals");
    }
}
