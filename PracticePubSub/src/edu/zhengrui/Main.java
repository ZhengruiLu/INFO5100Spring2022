package edu.zhengrui;

public class Main {
    public static void main(String[] args) {
        Professor p1 = new Professor("Ashish", 30);
        Student s1 = new Student("Yuhan", 18);
        Student s2 = new Student("Zhengrui", 19);

        s1.subscribe(p1);
        s2.subscribe(p1);

        p1.giveQuiz("Coding test");

        s1.unsubscribe(p1);
        p1.giveQuiz("Coding test 2");
    }





}
