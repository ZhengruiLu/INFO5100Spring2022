package edu.zhengrui.q1.student;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args){
        Zoo zoo = new Zoo();
        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Elephant("Lisa", new Date(), true));
        zoo.setAnimals(animals);
    }
}
