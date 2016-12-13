package com.example.user.quidditchrankings;

/**
 * Created by user on 12/12/2016.
 */
public class Player {

    String name;
    String house;
    int ranking;

    public Player(String name, String house){
        this.name = name;
        this.house = house;
        this.ranking = 0;
    }

    public String getPlayerName(){
        return this.name;
    }

    public String getPlayerHouse(){
        return this.house;
    }

    public int getPlayerRanking(){
        return this.ranking + 1;
    }

    public void setPlayerRanking(int rank){
        this.ranking = rank;
    }



}
