/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

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
        playingCard.Suit card = playingCard.Suit.HEARTS;

        assertEquals(playingCard.Suit.valueOf("HEARTS"), card);
    }

    @Test
    public void BadtestGetSuit() {
        System.out.println("Bad case testGetSuit()");
        playingCard.Suit card = playingCard.Suit.HEARTS;
        boolean expResult = false;
        boolean actualResult = playingCard.Suit.valueOf("SPADES").equals(card);
        assertEquals(expResult, actualResult);

    }

    @Test
    public void BoundarytestGetSuit() {
        System.out.println("Boundary case testGetSuit()");
        playingCard.Suit card = playingCard.Suit.HEARTS;
        boolean expResult = true;
        boolean actualResult = playingCard.Suit.valueOf("HEARTS").equals(card);
        assertEquals(expResult, actualResult);

    }

    /**
     * Test of getRank method, of class playingCard.
     */
    @Test
    public void GoodtestGetRank() {
        System.out.println("Good case testGetRank()");
        playingCard.Value card = playingCard.Value.ACE;
        boolean expResult = true;
        boolean actualResult = playingCard.Value.ACE.equals(card);
        assertEquals(expResult, actualResult);

    }

    @Test
    public void BadtestGetRank() {
        System.out.println("Bad case testGetRank()");
        playingCard.Value card = playingCard.Value.ACE;
        boolean expResult = false;
        boolean actualResult = playingCard.Value.TEN.equals(card);
        assertEquals(expResult, actualResult);

    }

    @Test
    public void BoundarytestGetRank() {
        System.out.println("Boundary case testGetRank()");
        playingCard.Value card = playingCard.Value.ACE;
        boolean expResult = true;
        boolean actualResult = playingCard.Value.ACE.equals(card);
        assertEquals(expResult, actualResult);

    }

    /**
     * Test of getValue method, of class playingCard.
     */
    @Test
    public void GoodtestGetValue() {
        System.out.println("Good case testgetValue()");
        playingCard.Value card = playingCard.Value.TWO;
        assertEquals(playingCard.Value.valueOf("TWO"), card);

    }

    @Test
    public void BadtestGetValue() {
        System.out.println("Good case testgetValue()");
        playingCard.Value card = playingCard.Value.TWO;

        assertFalse(playingCard.Value.valueOf("ACE") == card);

    }

    @Test
    public void BoundarytestGetValue() {
        System.out.println("Boundary case testgetValue()");
        playingCard.Value card = playingCard.Value.TWO;

        assertTrue(playingCard.Value.valueOf("TWO") == card);

    }

}
