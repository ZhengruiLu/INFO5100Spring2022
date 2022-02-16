package edu.zhengrui.q1.student;

public class Student {
    private int rollNumber;
    private String name;

    Student(int number, String name){
        this.rollNumber = number;
        this.name = name;
    }

    Student(Student previousStudent) {
        this.rollNumber = previousStudent.getRollNumber() + 1;
        this.name = "please set name";
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int printRoll(){
        return this.rollNumber;
    }

    public String printName(){
        return this.name;
    }
}
