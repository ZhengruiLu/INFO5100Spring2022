package edu.zhengrui.q1.student;

import java.util.Date;

public class Bird extends Animal{
    public Bird(String name, Date birthDate) {
        super(name, birthDate);
    }

    public void giveBirth(){
        System.out.println("birds");
    }
}
