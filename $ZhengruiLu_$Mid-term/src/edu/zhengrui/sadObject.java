package edu.zhengrui;

public class sadObject extends moodyObject {
    //returns string indicating sad
    public String getMood(){
        return "I feel sad today!!";
    }

    //print crying string “‘waah’ ‘boo hoo’ ‘weep’ ‘sob’”
    @Override
    public void expressFeelings() {
        System.out.println("‘waah’ ‘boo hoo’ ‘weep’ ‘sob’");
    }

    //returns message about self : “Subject cries a lot”
    public String toString(){
        return "Subject cries a lot";
    }

//    @Override
//    public void queryMood() {
//        System.out.println("I feel sad today!!");
//    }
}
