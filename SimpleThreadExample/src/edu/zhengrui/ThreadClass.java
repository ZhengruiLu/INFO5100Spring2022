package edu.zhengrui;

public class ThreadClass implements Runnable{
    @Override
    public void run() {


        for (int i = 0; i < 100; i++) {
            Thread.currentThread().getName();
            System.out.println("Printing in the" + Thread.currentThread().getName() +" " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
