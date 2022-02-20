package edu.zhengrui;

public class Main {
    public static void main(String[] args){
        Student s1 = new Student("Linda", 0001, 18);
        Professor p1 = new Professor("Ashish", 3789548, 30);

        p1.giveQuiz("Create a class of Person.");
        s1.takeQuiz("www.github.zhengrui.classPerson");
    }
}
