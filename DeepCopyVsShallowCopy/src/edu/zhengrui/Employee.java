package edu.zhengrui;

public class Employee {
    private String name;
    private int id;
    private Department department;

    public Employee() {
        name = "Sample";
        id = 0;
        department = null;
    }

    public Employee(String name, int id, Department department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    //deep copy
    public Employee(Employee employee) {
        this.name = employee.name;
        this.id = employee.id;
        this.department = new Department("Sample Dept", 1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void printEmployeeInfo(){
        System.out.println("-------------");
        System.out.println("Name: " + this.getName());
        System.out.println("ID: " + this.getId());
    }
}
