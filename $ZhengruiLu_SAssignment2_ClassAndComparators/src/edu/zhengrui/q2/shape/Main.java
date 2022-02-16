package edu.zhengrui.q2.shape;

public class Main {
    public static void main(String[] args){
        //Triangle
        //case1: Equilateral Triangle
        Triangle t1 = new Triangle(5);
        t1.setName("triangle 1");
        t1.setColor("red");

//        System.out.println(t1.getPerimeter());
//        System.out.println(t1.getArea());

        t1.isEquilateralTriangle();
        t1.printShapeForTriangle();

        //case2: use parent class to create a Non-Equilateral Triangle
        Shape t2 = new Triangle(6, 8);
        t2.setName("triangle 2");
        t2.setColor("purple");

        t2.printShape();


        //case3: use child class to create a Non-Equilateral Triangle
        Triangle t3 = new Triangle(6, 8);
        t3.setName("triangle 3");
        t3.setColor("yellow");
        t3.isEquilateralTriangle();
        t3.printShapeForTriangle();

        //Rhombus
        //case1: Equilateral Rhombus
        Rhombus r1 = new Rhombus(6);
        r1.setName("Rhombus 1");
        r1.setColor("green");
        r1.isEquilateralRhombus();
        r1.printShapeForRhombus();

        //case2: Non-Equilateral Rhombus
        Rhombus r2 = new Rhombus(6, 8);
        r2.setName("Rhombus 2");
        r2.isEquilateralRhombus();
        r2.printShapeForRhombus();



    }
}
