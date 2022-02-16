package edu.zhengrui.q2.shape;

public class Rhombus extends Shape{
    private double diagonal1, diagonal2;
    private boolean isEquilateralRhombus = false;

    public Rhombus(double diagonal1, double diagonal2) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    public Rhombus(double diagonal1) {//both diagonals have the same length
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal1;
        this.isEquilateralRhombus = true;
    }

    public double getPerimeter() {
        double perimeter = 0;
        double side = Math.sqrt(Math.pow((this.diagonal1 / 2), 2) + Math.pow((this.diagonal2 / 2), 2));
        perimeter = side * 4;
        return this.keepTwoDecimalPlace(perimeter);
    }

    public double getArea() {//S=cd÷2
        double area = 0;
        area = (this.diagonal1 * this.diagonal2) / 2;
        return this.keepTwoDecimalPlace(area);
    }

    public void printShapeForRhombus(){
        this.printShape();
        System.out.println("type: Rhombus");
        System.out.println("perimeter: " + this.getPerimeter());
        System.out.println("area: " + this.getArea());
    }

    public void isEquilateralRhombus() {
        System.out.println();
        if (isEquilateralRhombus){
            System.out.println(this.getName() + " is a Equilateral Rhombus");
        }else{
            System.out.println(this.getName() + " isn't a Equilateral Rhombus");
        }
    }


}
