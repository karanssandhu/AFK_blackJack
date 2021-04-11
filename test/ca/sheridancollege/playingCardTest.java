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
     * Good test case 
     * to test the valid output for getSuit methods
     */
    @Test
    public void GoodtestGetSuit() {
        System.out.println("Good case testGetSuit()");
        playingCard p = new playingCard(playingCard.Suit.HEARTS, playingCard.Value.TWO);
        assertEquals(0, p.getSuit());
    }

     /**
     * Test of getSuit method, of class playingCard.
     * Bad test case 
     * to test the invalid output for getSuit methods
     */
    @Test
    public void BadtestGetSuit() {
        System.out.println("Bad case testGetSuit()");
        playingCard p = new playingCard(null, playingCard.Value.TWO);
        assertEquals(0, p.getSuit());

    }

     /**
     * Test of getSuit method, of class playingCard.
     * Boundary test case 
     * to test the Boundary output for getSuit methods
     */
    @Test
    public void BoundarytestGetSuit() {
        System.out.println("Boundary case testGetSuit()");
       playingCard p = new playingCard(playingCard.Suit.DIAMONDS, playingCard.Value.TWO);
        assertEquals(1, p.getSuit());

    }

    /**
     * Test of getRank method, of class playingCard.
     * Good test case 
     * to test the valid output for getRank methods
     */
    @Test
    public void GoodtestGetRank() {
        System.out.println("Good case testGetRank()");
        playingCard p = new playingCard(playingCard.Suit.HEARTS, playingCard.Value.ACE);
        assertEquals(0, p.getRank());

    }
    
    /**
     * Test of getRank method, of class playingCard.
     * Bad test case 
     * to test the invalid output for getRank methods
     */
    @Test
    public void BadtestGetRank() {
        System.out.println("Bad case testGetRank()");
        playingCard p = new playingCard(playingCard.Suit.HEARTS, playingCard.Value.ACE);
        assertNotEquals(10, p.getRank());

    }
    
    /**
     * Test of getRank method, of class playingCard.
     * Boundary test case 
     * to test the boundary output for getRank methods
     */
    @Test
    public void BoundarytestGetRank() {
        System.out.println("Boundary case testGetRank()");
        playingCard p = new playingCard(playingCard.Suit.HEARTS,null);
        assertEquals(0, p.getRank());

    }

    /**
     * Test of getValue method, of class playingCard.
     * Good test case 
     * to test the valid output for getValue methods
     */
    @Test
    public void GoodtestGetValue() {
        System.out.println("Good case testGetValue()");
        playingCard p = new playingCard(playingCard.Suit.HEARTS, playingCard.Value.ACE);
        assertEquals(11, p.getValue());

    }
    
    /**
     * Test of getValue method, of class playingCard.
     * Good test case 
     * to test the valid output for getValue methods
     */
    @Test
    public void BadtestGetValue() {
        System.out.println("Bad case testGetValue()");
        playingCard p = new playingCard(playingCard.Suit.HEARTS, playingCard.Value.ACE);
        assertNotEquals(1, p.getValue());

    }
    
    /**
     * Test of getValue method, of class playingCard.
     * Boundary test case 
     * to test the boundary valid output for getValue methods
     */
    @Test
    public void BoundarytestGetValue() {
        System.out.println("Boundary case testGetValue()");
        playingCard p = new playingCard(playingCard.Suit.HEARTS, null);
        assertEquals(0, p.getValue());

    }

}
