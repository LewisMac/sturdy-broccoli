package com.example.user.quidditchrankings;

import java.util.*;

/**
 * Created by user on 12/12/2016.
 */
public class Ranking {

    ArrayList<Player> rankings;

    public Ranking(){
        rankings = new ArrayList<Player>();
    }

    public void addToArray(Player player, int index){
        player.setPlayerRanking(index - 1);
        rankings.add(index - 1, player);
        deleteLastPlayerInArrayList();
        setPlayerRankAsPosition();
    }

    public ArrayList<Player> getPlayers(){
        return new ArrayList<Player>(rankings);
    }

    public Player getPlayerByIndex(int index){
        return rankings.get(index);
    }

    public void givePlayerNewRank(int rank, Player player){
        rankings.remove(player);
        player.setPlayerRanking(rank - 1);
        rankings.add(rank - 1, player);
        setPlayerRankAsPosition();
    }

    public void setPlayerRankAsPosition(){
        for (Player player : rankings){
            player.setPlayerRanking(rankings.indexOf(player));
        }
    }

    public String makePlayerRankNamePretty(int rank){
        Player player = getPlayerByIndex(rank - 1);
        String playerName = player.getPlayerName();
        String playerHouse = player.getPlayerHouse();

        return "Name: " + playerName + ", House: " + playerHouse + ", Rank: " + rank;
    }

    public Player findPlayerByName(String name){
        Player playerByName = null;
        for (Player player : rankings){
            if (player.getPlayerName() == name)
            playerByName = player;
        }
        return playerByName;

    }

    public String makePlayerNameNamePretty(String name){
        Player player = findPlayerByName(name);
        String playerHouse = player.getPlayerHouse();
        int position = player.getPlayerRanking();
        return "Name: " + name + " House: " + playerHouse + " Position: " + position;
    }

    public void deleteLastPlayerInArrayList(){
        if (rankings.size() > 10)
            for (Player player : rankings){
                rankings.remove(10);
            }
    }

}
