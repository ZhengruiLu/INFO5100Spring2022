package edu.zhengrui;

import java.util.Random;

public class FisherMan implements Runnable{
    private String name;
    @Override
    public void run() {
        Random rand = new Random();
        int counter = 1;
        while (true){
            synchronized (Main.lockMarket){
                Main.fishMarket.add(Thread.currentThread().getName() +" " + counter + " fish");

            }
            counter++;
            try {
                Thread.sleep(rand.nextInt(2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
