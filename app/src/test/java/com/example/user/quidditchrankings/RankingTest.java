package com.example.user.quidditchrankings;
import org.junit.*;
import java.util.*;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by user on 12/12/2016.
 */
public class RankingTest {

    Ranking ranking;
    Player player;
    Player player2;
    Player player3;

    @Before
    public void Before(){
        ranking = new Ranking();
        player = new Player("Harry", "Gryffindor");
        player2 = new Player("Cameron", "Hufflepuff");
        player3 = new Player("Tegan", "Hufflepuff");
    }

    @Test
    public void testCanAddToRankingsArrayList(){
        ranking.addToArray(player, 1);
        assertNotNull(ranking.getPlayers());
    }

    @Test
    public void testCanSelectFromIndex(){
        ranking.addToArray(player, 1);
        assertEquals(player, ranking.getPlayerByIndex(0));
    }

//    @Test
//    public void testCanGetPlayerRanking(){
//
//        ranking.addToArray(player);
//        ranking.addToArray(player2);
//        ranking.addToArray(player3);
//        assertEquals(3, ranking.getPlayerRanking(player3));
//    }

    @Test
    public void testPlayerChangeRank(){
        ranking.addToArray(player, 1);
        ranking.addToArray(player2, 2);
        ranking.addToArray(player3, 3);
        assertEquals(3, player3.getPlayerRanking());
        assertEquals(1, player.getPlayerRanking());

        ranking.givePlayerNewRank(1, player3);
        assertEquals(1, player3.getPlayerRanking());
        assertEquals(2, player.getPlayerRanking());
    }

    @Test
    public void testPlayersHavePrettyNames(){
        ranking.addToArray(player, 1);
        ranking.addToArray(player2, 2);
        ranking.addToArray(player3, 3);

        assertEquals("Name: Cameron, House: Hufflepuff, Rank: 2", ranking.makePlayerRankNamePretty(2));
    }

    @Test
    public void testPlayersHavePrettyNamesByName(){
        ranking.addToArray(player, 1);
        ranking.addToArray(player2, 2);
        ranking.addToArray(player3, 3);
        assertEquals("Name: Cameron House: Hufflepuff Position: 2", ranking.makePlayerNameNamePretty("Cameron"));
    }

    @Test
    public void testCantHaveMoreThan10Players(){
        Player player = new Player("Harry", "Gryffindor");
        Player player1 = new Player("Fred", "Gryffindor");
        Player player2 = new Player("George", "Gryffindor");
        Player player3 = new Player("Ringo", "Gryffindor");
        Player player4 = new Player("Bill", "Gryffindor");
        Player player5 = new Player("Will", "Gryffindor");
        Player player6 = new Player("Logan", "Gryffindor");
        Player player7 = new Player("Tegan", "Gryffindor");
        Player player8 = new Player("Cameron", "Gryffindor");
        Player player9 = new Player("John", "Gryffindor");
        Player player10 = new Player("Winnie", "Gryffindor");
        ranking.addToArray(player, 1);
        ranking.addToArray(player1, 1);
        ranking.addToArray(player2, 1);
        ranking.addToArray(player3, 1);
        ranking.addToArray(player4, 1);
        ranking.addToArray(player5, 1);
        ranking.addToArray(player6, 1);
        ranking.addToArray(player7, 1);
        ranking.addToArray(player8, 1);
        ranking.addToArray(player9, 1);
        ranking.addToArray(player10, 1);

        assertEquals(10, ranking.size());

    }

//    @Test
//    public void testNoPlayerReturnsNull(){
//        assertNull(ranking.makePlayerNameNamePretty("Fred"));
//    }
}
