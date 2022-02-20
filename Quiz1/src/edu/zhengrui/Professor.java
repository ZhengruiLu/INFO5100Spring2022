package edu.zhengrui;

public class Professor extends Person{
    public Professor() {
    }

    public Professor(String na, int id, int age) {
        super(na, id, age);
    }

    public void giveQuiz(String quiz){
        System.out.println("Prof." + this.getName());
        System.out.println("Question：" + quiz);
        System.out.println();
    }
}
