 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Karan
 */
public class playingCardTest {

    public playingCardTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getSuit method, of class playingCard.
     */
    @Test
    public void GoodtestGetSuit() {
        System.out.println("Good case testGetSuit()");
        playingCard p = new playingCard(playingCard.Suit.HEARTS, playingCard.Value.TWO);
        assertEquals(0, p.getSuit());
    }

    @Test
    public void BadtestGetSuit() {
        System.out.println("Bad case testGetSuit()");
        playingCard p = new playingCard(playingCard.Suit.CLUBS, playingCard.Value.TWO);
        assertNotEquals(0, p.getSuit());

    }

    @Test
    public void BoundarytestGetSuit() {
        System.out.println("Boundary case testGetSuit()");
        playingCard p = new playingCard(null,playingCard.Value.TWO);
        assertEquals(0, p.getSuit());

    }

    /**
     * Test of getRank method, of class playingCard.
     */
    @Test
    public void GoodtestGetRank() {
        System.out.println("Good case testGetRank()");
        playingCard p = new playingCard(playingCard.Suit.HEARTS, playingCard.Value.ACE);
        assertEquals(0, p.getRank());

    }

    @Test
    public void BadtestGetRank() {
        System.out.println("Bad case testGetRank()");
        playingCard p = new playingCard(playingCard.Suit.HEARTS, playingCard.Value.ACE);
        assertNotEquals(10, p.getRank());

    }

    @Test
    public void BoundarytestGetRank() {
        System.out.println("Boundary case testGetRank()");
        playingCard p = new playingCard(playingCard.Suit.HEARTS,null);
        assertEquals(0, p.getRank());

    }

    /**
     * Test of getValue method, of class playingCard.
     */
    @Test
    public void GoodtestGetValue() {
        System.out.println("Good case testGetValue()");
        playingCard p = new playingCard(playingCard.Suit.HEARTS, playingCard.Value.ACE);
        assertEquals(11, p.getValue());

    }

    @Test
    public void BadtestGetValue() {
        System.out.println("Bad case testGetValue()");
        playingCard p = new playingCard(playingCard.Suit.HEARTS, playingCard.Value.ACE);
        assertNotEquals(1, p.getValue());

    }

    @Test
    public void BoundarytestGetValue() {
        System.out.println("Boundary case testGetValue()");
        playingCard p = new playingCard(playingCard.Suit.HEARTS, null);
        assertEquals(0, p.getValue());

    }

}
