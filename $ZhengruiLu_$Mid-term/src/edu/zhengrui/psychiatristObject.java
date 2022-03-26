package edu.zhengrui;

public class psychiatristObject {
    //asks moody object about its mood
    public void examine(moodyObject moodyObject){
        System.out.println("---------------------------------------");
        System.out.println("How are you feeling today?");
        System.out.println(moodyObject.getMood());
        moodyObject.expressFeelings();
    }

    //a moodyObject is observed to either laugh or cry
    public void observe(moodyObject moodyObject){
        System.out.println("Observation: " + moodyObject.toString());
        System.out.println();
    }

    //returns message about self: “Subject laughs a lot”
    public String toString(){
        return "Subject laughs a lot";
    }
}
