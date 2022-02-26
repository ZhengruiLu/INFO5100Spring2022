package edu.zhengrui;

public class Person {
    private String name;
    private int age;

    Person(){}
    Person(String name, int age){
        this.name = name;
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

//        if (! spd.getFollowers().contains(this)){
//            System.out.println(this.getName() + " unfollow " + spd.getName());
//        }
        System.out.println("-----------------");
        System.out.println("Publisher: " + spd.getName());
        System.out.println("Follower: " + this.getName());
        System.out.println("Notification: " + spd.getNotice().getNotification());
        System.out.println("-----------------");

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
