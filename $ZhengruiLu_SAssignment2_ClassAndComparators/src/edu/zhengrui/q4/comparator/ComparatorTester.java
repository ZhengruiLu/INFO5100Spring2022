package edu.zhengrui.q4.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorTester {
    public static void main(String[] args){
        Player p1 = new Player("Lisa", 98);
        Player p2 = new Player("Linda", 100);
        Player p3 = new Player("Zoey", 90);
        Player p4 = new Player("Jack", 83);
        Player p5 = new Player("Ben", 95);
        Player p6 = new Player("Sue", 98);

        ArrayList<Player> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        list.add(p6);

        System.out.println("Unsorted");
        printList(list);

        System.out.println();
        System.out.println("Sorted by score and name");
        Collections.sort(list, new SortPlayers());
        printList(list);
    }


    public static void printList(ArrayList<Player> list){
        for (Player player: list ) {
            player.printAll();
        }
    }
}
