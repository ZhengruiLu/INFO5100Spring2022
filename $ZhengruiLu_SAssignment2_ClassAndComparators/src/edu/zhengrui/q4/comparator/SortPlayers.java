package edu.zhengrui.q4.comparator;

import java.util.Comparator;

public class SortPlayers implements Comparator<Player> {
    @Override
    public int compare(Player o1, Player o2) {
        if (o1.getScore() != o2.getScore()){
            return o2.getScore() - o1.getScore();
        }

        return o1.getName().compareTo(o2.getName());
    }
}
