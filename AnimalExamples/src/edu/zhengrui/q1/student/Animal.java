package edu.zhengrui.q1.student;

import java.util.Date;

public class Animal {
    private String name;
    private Date birthDate;

    public Animal(String name, Date birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }

    public void eat(){
        System.out.println("I'm eating");
    }

    public void move(){
        System.out.println("I'm moving");
    }
    public void breathe(){
        System.out.println("I'm breathing");
    }
}
