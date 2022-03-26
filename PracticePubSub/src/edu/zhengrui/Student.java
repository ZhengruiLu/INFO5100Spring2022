package edu.zhengrui;

public class Student extends Person{
    public Student(String name, int age) {
        super(name, age);
    }

    public void takeQuiz(){
        System.out.println("Student: " + this.getName());
    }

    public void subscribe(Professor professor){
        if (!professor.getStudents().contains(this)){
            professor.getStudents().add(this);
        }
    }

    public void unsubscribe(Professor professor){
        professor.getStudents().remove(this);
    }
}
