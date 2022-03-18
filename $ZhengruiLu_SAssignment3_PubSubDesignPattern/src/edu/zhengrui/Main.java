package edu.zhengrui;

public class Main {
    public static void main(String[] args) {
        SeattlePoliceDepartment publisher = new SeattlePoliceDepartment("Seattle Police Dept. @SeattlePD");
        Person p1 = new Person("Brandi Kruse", 30);
        Person p2 = new Person("Libby", 36);
        Person p3 = new Person("Sigma", 20);
        Person p4 = new Person("Tim Durkan", 40);

        //Subscribe some persons to SeattlePoliceDepartment
        p1.subscribe(publisher);
        p2.subscribe(publisher);
        p3.subscribe(publisher);

        publisher.printFollowersList();

        //Publish a message from SeattlePoliceDepartment
        publisher.setNotice(new NotifyCitizens("Detectives have arrested the suspect in this August 2021 double homicide."));

        try {
            Thread.sleep(10000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        //Unsubscribe 1 or 2 users from SeattlePoliceDepartment
        p2.unsubscribe(publisher);
        publisher.printFollowersList();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
