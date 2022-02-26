package edu.zhengrui;

import java.util.ArrayList;

public class Professor extends Person{
    private String classNo;
    private ArrayList<Student> students;
    String quiz;

    public Professor() {
    }

    public Professor(String na, int id, int age, String classNo) {
        super(na, id, age);
        this.classNo = classNo;
        this.students = new ArrayList<>();
    }

    public void giveQuiz(String quiz){
        this.quiz = quiz;
        System.out.println("Prof." + this.getName());
        System.out.println("Class: " + this.getClassNo());
        System.out.println("Question：" + quiz);
        System.out.println("Due: ");

        for (Student student: students) {
            student.takeQuiz(this);
        }
    }

    public String getClassNo() {
        return classNo;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
}
