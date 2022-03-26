package edu.zhengrui;

import java.util.ArrayList;

public class Professor extends Person{
    ArrayList<Student> students;

    public Professor(String name, int age) {
        super(name, age);
        students = new ArrayList<>();
    }

    public void giveQuiz(String quizName){
        System.out.println("Professor: " + this.getName());
        System.out.println("quiz: " + quizName);
        for (Student student: students){
            student.takeQuiz();
        }
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}
