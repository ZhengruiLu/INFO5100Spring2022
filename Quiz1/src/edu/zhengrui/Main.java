package edu.zhengrui;

public class Main {
    public static void main(String[] args){
        Student s1 = new Student("s1", 0001, 18);
        Student s2 = new Student("s2", 0002, 18);
        Student s3 = new Student("s3", 0003, 18);
        Student s4 = new Student("s4", 0004, 18);
        Student s5 = new Student("s5", 0005, 18);
        Professor p1 = new Professor("Ashish", 3789548, 30, "INFO5100");
        Professor p2 = new Professor("Brad", 3709290, 35, "INFO6150");

        p1.giveQuiz("Quiz 1");
        s1.subscribe(p1);
        s2.subscribe(p1);
        s3.subscribe(p1);


        s4.subscribe(p2);
        s5.subscribe(p2);
        s1.takeQuiz(p1);
    }
}
