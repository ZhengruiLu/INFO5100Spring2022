package edu.zhengrui.q1.student;

public class StudentTester {
    public static void main(String[] args){
        Student student1 = new Student(101, "ABC");
        System.out.println(" Roll number of the first student: "+ student1.printRoll());
        System.out.println(" Name of the first student: "+ student1.printName());

        Student student2 = new Student(student1);
        System.out.println(" Roll number of the second student: "+ student2.printRoll());
//        student2.setName("Lisa");
        System.out.println(" Name of the second student: "+ student2.printName());


    }
}
