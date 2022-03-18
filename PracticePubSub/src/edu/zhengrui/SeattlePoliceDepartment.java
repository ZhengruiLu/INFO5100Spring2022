package edu.zhengrui;

import java.util.ArrayList;

public class SeattlePoliceDepartment {
    private String name;
    private NotifyCitizens notifyCitizens;
    private ArrayList<Person> followers;

    public SeattlePoliceDepartment(String name){
        this.name = name;
        followers = new ArrayList<>();
    }

    public void publishNotification(NotifyCitizens notifyCitizens){
        this.notifyCitizens = notifyCitizens;
        for (int i = 0; i < this.getFollowers().size(); i++) {
            this.getFollowers().get(i).getNotification(this);
        }
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

    public void setFollowers(ArrayList<Person> followers) {
        this.followers = followers;
    }

    public NotifyCitizens getNotifyCitizens() {
        return notifyCitizens;
    }

    public void setNotifyCitizens(NotifyCitizens notifyCitizens) {
        this.notifyCitizens = notifyCitizens;
    }
}
