package edu.zhengrui;

public class Main {
    public static void main(String[] args) {
        SeattlePoliceDepartment publisher1 = new SeattlePoliceDepartment("SeattlePoliceDept");

        Person p1 = new Person("Linda", 8);
        Person p2 = new Person("Alice", 16);
        Person p3 = new Person("Bride", 80);
        Person p4 = new Person("Zoey", 25);

        p1.subscribe(publisher1);
        p2.subscribe(publisher1);
        p3.subscribe(publisher1);
        p4.subscribe(publisher1);

        publisher1.publishNotification(new NotifyCitizens("Be careful!"));

        try{
            Thread.sleep(10000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        p2.unsubscribe(publisher1);

        try{
            Thread.sleep(10000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        publisher1.publishNotification(new NotifyCitizens("Take care!"));

    }





}
