package edu.zhengrui;

public class Employee {
    String name;
    int id;

    public Employee(){};
    public Employee(String na, int id){
        name = na;
        this.id = id;
    }
    //deep copy
    public Employee(Employee sample){
        this.name = sample.name;
        this.id = sample.id;
    }

    public void printInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("id: " + this.id);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
