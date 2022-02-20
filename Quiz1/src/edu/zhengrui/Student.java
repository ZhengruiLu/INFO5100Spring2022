package edu.zhengrui;

public class Student extends Person{
    public Student() {
    }

    public Student(String na, int id, int age) {
        super(na, id, age);
    }

    public void takeQuiz(String ans){
        System.out.println("Student Name: " + this.getName());
        System.out.println("Student ID: " + this.getID());
        System.out.println("Answer: " + ans);
    }

}
