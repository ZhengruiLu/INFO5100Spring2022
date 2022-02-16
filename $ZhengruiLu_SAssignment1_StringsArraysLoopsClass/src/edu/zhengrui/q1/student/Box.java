package edu.zhengrui.q1.student;

public class Box {
    private double width;
    private double height;
    private double depth;

    public Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    double calculateVolume(){
        return width * height * depth;
    }
}
