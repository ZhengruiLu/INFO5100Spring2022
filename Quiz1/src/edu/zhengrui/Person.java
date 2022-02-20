package edu.zhengrui;

public class Person {
    private String name;
    private int ID;
    private int Age;

    public Person(){}
    public Person(String na, int id, int age){
        name = na;
        ID = id;
        Age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
}
