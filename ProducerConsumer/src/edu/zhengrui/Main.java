package edu.zhengrui;
import java.util.ArrayList;

public class Main {
    public static ArrayList<String> fishMarket = new ArrayList<>();

    public static void main(String[] args) {
        FisherMan[] fisherMens = new FisherMan[5];
        Consumer[] consumers = new Consumer[10];

        for (int i = 0; i < fisherMens.length; i++) {
            fisherMens[i] = new Thread(new FisherMan());
            fisherMens[i].setName("Fisher");
        }
        for (int i = 0; i < consumers.length; i++) {
            consumers[i] = new Thread(new Consumer());
            consumers[i].setName("Consumer");
        }


    }
}
