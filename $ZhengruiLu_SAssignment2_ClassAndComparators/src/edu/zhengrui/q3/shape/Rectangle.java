package edu.zhengrui.q3.shape;

public class Rectangle extends Shape{
    private double length, width;

    Rectangle(){}

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void computeArea(){
        double area = length * width;
        area = keepTwoDecimalPlace(area);
        System.out.println("area: " + area);
    }

    public void computePerimeter(){
        double perimeter = 2 * (length + width);
        perimeter = keepTwoDecimalPlace(perimeter);
        System.out.println("perimeter: " + perimeter);
    }

    public void display(){
        super.display();
        System.out.println("type: rectangle");
        computeArea();
        computePerimeter();
    }

}
