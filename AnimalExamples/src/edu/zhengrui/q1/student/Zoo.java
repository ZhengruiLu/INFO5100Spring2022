package edu.zhengrui.q1.student;

import java.util.ArrayList;

public class Zoo {
    ArrayList<Animal> animals;

    public Zoo() {
        animals = new ArrayList<>();
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }
}
