package edu.zhengrui;

public class Student extends Person{
    public Student() {
    }

    public Student(String na, int id, int age) {
        super(na, id, age);
    }

    public void takeQuiz(Professor professor){
        System.out.println("----------------");
        System.out.println("Professor: " + professor.getName());
        System.out.println("Student Name: " + this.getName());
        System.out.println("Student ID: " + this.getID());
        System.out.println("----------------");
    }

    public void subscribe(Professor prof){
        if (!prof.getStudents().contains(this)){
            prof.getStudents().add(this);
        }
    }
    public void unsubscribe(Professor prof){

    }
}
