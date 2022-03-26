package edu.zhengrui;

public class Student {
    private String name;
    private String id;
    private double gpa;

    Student(String name, String id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    Student(Student sample){
        this.name = sample.name;
        this.id = sample.id;
        this.gpa = sample.gpa;
    }

    public void printInfo(){
        System.out.println("Student Information: ");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("GPA: " + gpa);
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
