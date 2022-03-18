package edu.zhengrui;

public class Main {

    public static void main(String[] args) {
        Department software = new Department("Software", 1);
        Employee sample = new Employee();
        sample.printEmployeeInfo();
        //shallow copy
//        Employee shallowCopy = sample;
//        shallowCopy.setName("Yuhan");
//        sample.printEmployeeInfo();
//        shallowCopy.printEmployeeInfo();

        //deep copy
        Employee ashish = new Employee(sample);
//        ashish.printEmployeeInfo();

        ashish.setName("Ashish");
        ashish.setId(001);
        ashish.printEmployeeInfo();
        sample.printEmployeeInfo();

        Employee mark = new Employee(sample);
        mark.setName("Mark");
        mark.setId(002);

//        sample.printEmployeeInfo();
//        ashish.printEmployeeInfo();
//        mark.printEmployeeInfo();
    }

}
