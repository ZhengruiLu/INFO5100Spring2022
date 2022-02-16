package edu.zhengrui.q2.shape;

public class Triangle extends Shape{
    private double base, height;
    private boolean isEquilateralTriangle = false;

    Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    Triangle(double side){//If the single side is given then all sides to the same value.
        this.isEquilateralTriangle = true;
        this.base = side;
        this.height = Math.sqrt(Math.pow(side, 2) - Math.pow(side / 2, 2));
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getPerimeter() {
        double perimeter = 0;
        if (isEquilateralTriangle){
            perimeter = this.base * 3;
        }else{
            perimeter = -1;
            System.out.println("(Calculating perimeter need the data of other two sides)");
        }
        return keepTwoDecimalPlace(perimeter);

    }

    public double getArea() {
        double area = 0;
        //if it is Equilateral Triangle, we already get height when use the constructor with the side parameter.
        area = (this.base * this.height) / 2;

        return this.keepTwoDecimalPlace(area);
    }



    public void isEquilateralTriangle() {
        System.out.println();
        if (isEquilateralTriangle){
            System.out.println(this.getName() + " is a Equilateral Triangle");
        }else{
            System.out.println(this.getName() + " isn't a Equilateral Triangle");
        }
    }

    public void printShapeForTriangle(){
        this.printShape();
        System.out.println("type: Triangle");
        System.out.println("perimeter: " + this.getPerimeter());
        System.out.println("area: " + this.getArea());
    }
}
