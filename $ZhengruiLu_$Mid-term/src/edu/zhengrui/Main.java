package edu.zhengrui;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        //Q1 - Deep copy and shallow copy
        Student sample = new Student("Zhengrui", "001", 4.0);
        deepCopyShallowCopy(sample);

        //Q2 - difference between abstract class and interface
        System.out.println("Q2 - difference between abstract class and interface");
        System.out.println("Please find in the Q2 comments");
        /*
        1. inheritance: a class can inherit from 1 abstract class, but multiple interface;
        2. structure 1: abstract classes can have both concrete and abstract content, but interface just have abstract content;
        3. structure 2: abstract classes can have data in constructor, but interface no data included
        4. implement: abstract classes method can be both override or implemented, but interfaces only can be override
        5. usage: abstract classes are for the identity of a class, but interfaces are for peripheral abilities of a class
        6. how to use: extends abstract class, implement interface
        7. key word when declaring: "abstract" is the key word for abstract class, interface no need key word
        8. Access modifier: abstract class can have public/protected method, but implement default as public
        9. speed: abstract class is fast
        10. when to use 1: abstract classes are for avoiding independence, but interfaces are for future enhancement.
        11. when to use 2: abstract classes are for sharing common specialities, but interfaces are for polymorphic.

        self class inheritance: a abstract class can inherit from 1 abstract class and multiple interface,
        but a interface only can inherit multiple interfaces
         */

        //Q3 - uses abstract classes and methods, the program should implement the design indicated in the UML diagram
        abstractClassTest();

        //Q4 - interface
        System.out.println("Q4 - interface: ");
        System.out.println("please find in Client.class in this package");

        //Q5 - singleTon
        singleTonTest();

        //Q6 - length of the longest substring
        System.out.println("Q6 - length of the longest substring");
        String s = "abcabcbb";
        System.out.println("String " + s + "'s longest substring length is " +  longestSubstring(s));
    }

    //Q1
    private static void deepCopyShallowCopy(Student sample){
        //shallow copy
        Student shallowCopySample = sample;
        System.out.println("Q1 - Deep copy and shallow copy: ");
        System.out.println("------------------------------------------");
        System.out.println("Shallow copy before changing information: ");
        sample.printInfo();
        shallowCopySample.printInfo();

        shallowCopySample.setName("Yuhan");
        shallowCopySample.setId("002");
        System.out.println("------------------------------------------");
        System.out.println("Shallow copy after changing information: ");
        sample.printInfo();
        shallowCopySample.printInfo();

        //deep copy
        Student deepCopySample = new Student(sample);
        System.out.println("------------------------------------------");
        System.out.println("Deep copy before changing information: ");
        sample.printInfo();
        deepCopySample.printInfo();

        deepCopySample.setName("Changpan");
        deepCopySample.setId("003");
        System.out.println("------------------------------------------");
        System.out.println("Deep copy after changing information: ");
        sample.printInfo();
        deepCopySample.printInfo();
    }

    //Q3 - abstract class
    public static void abstractClassTest(){
        System.out.println();
        System.out.println("Q3 - abstract class");
        moodyObject sample1 = new happyObject();
        psychiatristObject psychiatrist = new psychiatristObject();
        psychiatrist.examine(sample1);
        psychiatrist.observe(sample1);

        moodyObject sample2 = new sadObject();
        psychiatrist.examine(sample2);
        psychiatrist.observe(sample2);
        System.out.println();
    }

    //Q5 - singleton
    public static void singleTonTest(){
        System.out.println();
        System.out.println("Q5 - Singleton: ");

        Camera c1 = Camera.getInstance();
        c1.setName("c1");

        Camera c2 = Camera.getInstance();
        System.out.println(c1.getName());
        System.out.println(c2.getName());

        c2.setName("c2");
        System.out.println(c1.getName());
        System.out.println(c2.getName());

        System.out.println();
    }

    //Q6 - longest Substring
    private static int longestSubstring(String s){
        int r = 0, l = 0, res = 0;

        HashSet<Character> set = new HashSet<>();

        while(r < s.length()){
            char c = s.charAt(r++);
            while(set.contains(c)){
                set.remove(s.charAt(l++));
            }
            set.add(c);
            res = Math.max(res,set.size());
        }

        return res;
    }

}


