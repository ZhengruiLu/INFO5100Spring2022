package edu.zhengrui;

public class Main {
    public static void main(String[] args) {
        Employee sample = new Employee("Sample", 20);
        sample.printInfo();
        Employee shallowCopy = sample;

        shallowCopy.setName("yuhan");
        shallowCopy.printInfo();
        sample.printInfo();

        Employee deepCopy = new Employee(sample);
        deepCopy.printInfo();

        deepCopy.setName("Ashish");
        deepCopy.printInfo();
        sample.printInfo();
    }

}
