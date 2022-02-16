package edu.zhengrui.q3.shape;

public class Shape {
    private String name;
    private double perimeter, area;

    public Shape(){}

    public Shape (String name, double perimeter, double area){
        this.name = name;
        this.area = area;
        this.perimeter = perimeter;
    }

    public void display(){
        System.out.println("------------------------");
        System.out.println("Shape information: ");
        System.out.println("name: " + name);
//        System.out.println("area: " + area);
//        System.out.println("perimeter: " + perimeter);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double keepTwoDecimalPlace(double num){
        num = (double) Math.round(num * 100) / 100;
        return num;
    }
}
