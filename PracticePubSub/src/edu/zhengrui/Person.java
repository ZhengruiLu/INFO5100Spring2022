package edu.zhengrui;

public class Person {
    private String name;
    private int age;

    public Person(String na, int age){
        this.name = na;
        this.age = age;
    }

    public void subscribe(SeattlePoliceDepartment spd){
        if (!spd.getFollowers().contains(this)){
            spd.getFollowers().add(this);
        }
    }

    public void unsubscribe(SeattlePoliceDepartment spd){
        spd.getFollowers().remove(this);
    }

    public void getNotification(SeattlePoliceDepartment spd){
        System.out.println("Publisher: " + spd.getName());
        System.out.println("Follower: " + this.getName());
        System.out.println("Notification: " + spd.getNotifyCitizens().getNotification());
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
