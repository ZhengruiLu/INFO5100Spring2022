package edu.zhengrui;

public class Main {
    public static void main(String[] args){
        Camera c1 = Camera.getInstance();
        c1.setName("c1");

        Camera c2 = Camera.getInstance();
        System.out.println(c1.getName());
        System.out.println(c2.getName());

        c2.setName("c2");
        System.out.println(c1.getName());
        System.out.println(c2.getName());

    }
}
