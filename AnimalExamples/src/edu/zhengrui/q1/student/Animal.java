package edu.zhengrui.q1.student;

import java.util.Date;

public class Animal {
    private String name;
    private Date birthDate;

    Animal(String name, Date birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }

    public void speaking(){
        System.out.println(this.getClass() + ": " + this.getName() + " is speaking");
    }

    public String getName(){
        return this.name;
    }
}
