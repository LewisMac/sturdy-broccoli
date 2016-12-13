package com.example.user.quidditchrankings;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * Created by user on 12/12/2016.
 */
public class PlayerTest {

    Player player;
    @Before
    public void Before(){
        player = new Player("Harry", "Gryffindor");
    }

    @Test
    public void testGetName(){
        assertEquals("Harry", player.getPlayerName());
    }

    @Test
    public void testGetHouse(){
        assertEquals("Gryffindor", player.getPlayerHouse());
    }

    @Test
    public void testGetRanking(){
        assertEquals(1, player.getPlayerRanking());
    }

}
