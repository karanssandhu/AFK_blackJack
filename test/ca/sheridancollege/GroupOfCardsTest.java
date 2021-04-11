/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege;

import java.util.ArrayList;
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
public class GroupOfCardsTest {

    public GroupOfCardsTest() {
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
     * Test of showCards method, of class GroupOfCards.
     */
    /**
     * Test of shuffle method, of class GroupOfCards.
     */
    @Test
    public void GoodtestShuffle() {
        System.out.println("Good case shuffle()");
        GroupOfCards tempdeck = new GroupOfCards(52);
        tempdeck.shuffle();
        ArrayList<playingCard> shuffledCards = tempdeck.getCards();
        GroupOfCards deck = new GroupOfCards(52);
        ArrayList<playingCard> unshuffledCards = deck.getCards();
        boolean expResult = false;
        assertNotEquals(shuffledCards.get(1).toString(),unshuffledCards.get(1).toString());
    }

    @Test
    public void BadtestShuffle() {
        System.out.println("Bad case shuffle()");
        GroupOfCards tempdeck = new GroupOfCards(52);
         ArrayList<playingCard> shuffledCards = tempdeck.getCards();
        GroupOfCards deck = new GroupOfCards(52);
        ArrayList<playingCard> unshuffledCards = deck.getCards();
        boolean expResult = true;
        boolean actResult = tempdeck.equals(deck);
        assertEquals(shuffledCards.get(0).toString(), unshuffledCards.get(0).toString());
    }

    @Test
    public void BoundarytestShuffle() {
        System.out.println("Good case shuffle()");
        GroupOfCards tempdeck = new GroupOfCards(52);
        tempdeck.shuffle();
        ArrayList<playingCard> shuffledCards = tempdeck.getCards();
        GroupOfCards deck = new GroupOfCards(52);
        ArrayList<playingCard> unshuffledCards = deck.getCards();
        boolean expResult = false;
        assertNotEquals(shuffledCards.get(1).toString(),unshuffledCards.get(1).toString());
    }

    /**
     * Test of getSize method, of class GroupOfCards.
     */
    @Test
    public void GoodtestGetSize() {
        System.out.println("Good case getSize()");
        GroupOfCards deck = new GroupOfCards(52);
        int size = 52;
        deck.setSize(52);
        assertTrue(deck.getSize() == size);
    }

    @Test
    public void BadtestGetSize() {
        System.out.println("Boundary case getSize()");
        GroupOfCards deck = new GroupOfCards(52);
        int size = 51;
        deck.setSize(52);
        assertFalse(deck.getSize() == size);
    }

    @Test
    public void BoundarytestGetSize() {
        System.out.println("Boundary case getSize()");
        GroupOfCards deck = new GroupOfCards(52);
        int size = 52;
        deck.setSize(52);
        assertTrue(deck.getSize() == size);
    }

    /**
     * Test of setSize method, of class GroupOfCards. //TODO ignore
     */
    @Test
    public void GoodtestSetSize() {
        System.out.println("Good case setSize");

        int size = 52;
        GroupOfCards deck = new GroupOfCards(52);
        deck.setSize(size);
        assertTrue(deck.getSize() == size);

    }

    @Test
    public void BadtestSetSize() {
        System.out.println("Bad case setSize()");

        int size = 51;
        GroupOfCards deck = new GroupOfCards(52);
        deck.setSize(size);
        assertTrue(deck.getSize() == size);

    }

    @Test
    public void BoundarytestSetSize() {
        System.out.println("Boundary case setSize()");

        int size = 52;
        GroupOfCards deck = new GroupOfCards(52);
        deck.setSize(size);
        assertTrue(deck.getSize() == size);

    }

    /**
     * Test of Good drawCard method, of class GroupOfCards.
     */
    @Test
    public void GodtestDrawCard() {
         System.out.println("Good case drawCard()");
        GroupOfCards deck = new GroupOfCards(52);
        playingCard p = new playingCard(playingCard.Suit.HEARTS, playingCard.Value.ACE);
        assertEquals(p.toString(), deck.drawCard().toString());

    }

    /**
     * Test of Bad drawCard method, of class GroupOfCards.
     */
    
    @Test
    public void BadtestDrawCard() {
         System.out.println("Bad case drawCard()");
        GroupOfCards deck = new GroupOfCards(52);
        deck.shuffle();
        playingCard p = new playingCard(playingCard.Suit.HEARTS, playingCard.Value.TWO);
        assertNotEquals(p.toString(), deck.drawCard().toString());

    }
    /**
     * Test of boundary drawCard method, of class GroupOfCards.
     */
    
    @Test
    public void BoundarytestDrawCard() {
        System.out.println("Boundary case drawCard()");
        GroupOfCards deck = new GroupOfCards(52);
        playingCard p = new playingCard(playingCard.Suit.HEARTS, playingCard.Value.ACE);
        assertEquals(p.toString(), deck.drawCard().toString());

    }
}
