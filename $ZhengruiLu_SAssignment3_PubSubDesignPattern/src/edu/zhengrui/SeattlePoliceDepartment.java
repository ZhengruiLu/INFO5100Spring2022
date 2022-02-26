package edu.zhengrui;

import java.util.ArrayList;

public class SeattlePoliceDepartment {
    private String name;
    private ArrayList<Person> followers;
    private NotifyCitizens notice;

    SeattlePoliceDepartment(){};
    SeattlePoliceDepartment(String name){
        this.name = name;
        this.followers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Person> getFollowers() {
        return followers;
    }

    public void printFollowersList(){
        System.out.println("Publisher: " + this.getName());
        System.out.println(followers.size() + " Followers" );
        for (Person p: followers){
            System.out.println("Follower: " + p.getName());
        }
        System.out.println();
    }

    public NotifyCitizens getNotice() {
        return notice;
    }

    public void setNotice(NotifyCitizens notice) {
        this.notice = notice;
        for (Person p: followers){
            p.getNotification(this);
        }
    }
}
