package edu.zhengrui;

public class Main {
    public static void main(String[] args){
        Camera cam1 = Camera.getInstance();
        Camera cam2 = Camera.getInstance();

        cam1.setCameraName("Camera 1");
        System.out.println(cam1.getCameraName());
        System.out.println(cam2.getCameraName());

        cam2.setCameraName("Camera 2");
        System.out.println(cam1.getCameraName());
        System.out.println(cam2.getCameraName());


    }
}
