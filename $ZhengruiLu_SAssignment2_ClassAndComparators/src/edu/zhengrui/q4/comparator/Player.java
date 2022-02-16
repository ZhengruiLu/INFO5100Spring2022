package edu.zhengrui.q4.comparator;

public class Player {
    private String name;
    private int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void printAll() {
        System.out.println("Name: " + name + "\t\t" + "Score: " + score);
    }
}
