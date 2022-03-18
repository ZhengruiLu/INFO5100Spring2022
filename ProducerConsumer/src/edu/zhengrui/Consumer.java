package edu.zhengrui;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Random;

public class Consumer implements Runnable{
    private String name;

    @Override
    public void run() {
        Random rand = new Random();
        while (true){
            synchronized (Main.lockMarket){
                if (Main.fishMarket.size() > 0){
                    String fish = Main.fishMarket.remove(0);
                    System.out.println(Thread.currentThread().getName() + " Consumed" + fish);

                }
            }
            Thread.sleep();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
