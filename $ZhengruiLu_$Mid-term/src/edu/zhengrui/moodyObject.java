package edu.zhengrui;

public abstract class moodyObject {
    // Return the mood : sad or happy – depending on which object sends the message
    abstract String getMood();

    // Each Object expresses a different motion
    abstract void expressFeelings();

    //an object responds according to how it feels, print ”I feel Happy(or Sad) today!!”
    public void queryMood(){
        System.out.println("I feel Happy(or Sad) today!!");
    }
}
