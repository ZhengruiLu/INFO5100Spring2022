package edu.zhengrui.q2.shape;

public class Shape {
    private String name, color;
    private double perimeter, area;

    public Shape(){
    }

    Shape (String name, String color){
        this.name = name;
        this.color = color;
    }

    Shape (String name, String color, double perimeter, double area){
        this.name = name;
        this.color = color;
        this.area = area;
        this.perimeter = perimeter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public double getArea() {
        return area;
    }

    public void printShape(){
        System.out.println("------------------------");
        System.out.println("Shape information: ");
        System.out.println("name: " + name);
        System.out.println("color: " + color);
//        System.out.println("perimeter: " + perimeter);
//        System.out.println("area: " + area);
    }

    public double keepTwoDecimalPlace(double num){
        num = (double) Math.round(num * 100) / 100;
        return num;
    }



}
