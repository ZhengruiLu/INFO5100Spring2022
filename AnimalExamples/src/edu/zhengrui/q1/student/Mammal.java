package edu.zhengrui.q1.student;

import java.util.Date;

public class Mammal extends Animal{
    public Mammal(String name, Date birthDate) {
        super(name, birthDate);
    }


    public void giveBirth() {
        System.out.println("don't lay eggs");
    }
}
