package edu.zhengrui.q3.shape;

public class Circle extends Shape{
    private double radius;
    private final double PI = 3.14;

    Circle(){}

    Circle(double radius){
        this.radius = radius;
    }

    public void computeArea(){
        double area = PI * Math.pow(radius, 2);
        area = keepTwoDecimalPlace(area);
        System.out.println("area: " + area);
    }

    public void computePerimeter(){
        double perimeter = 2 * PI * radius;
        perimeter = keepTwoDecimalPlace(perimeter);
        System.out.println("perimeter: " + perimeter);
    }

    public void display(){
        super.display();
        System.out.println("type: circle");
        computeArea();
        computePerimeter();
    }
}
