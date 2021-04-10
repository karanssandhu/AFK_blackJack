/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

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
        GroupOfCards deck = new GroupOfCards(52);
        boolean expResult = false;
        boolean actResult = tempdeck.equals(deck);
        assertEquals(expResult, actResult);
    }

    @Test
    public void BadtestShuffle() {
        System.out.println("Bad case shuffle()");
        GroupOfCards tempdeck = new GroupOfCards(52);
        tempdeck.shuffle();
        GroupOfCards deck = new GroupOfCards(52);
        boolean expResult = true;
        boolean actResult = tempdeck.equals(tempdeck);
        assertEquals(expResult, actResult);
    }

    @Test
    public void BoundarytestShuffle() {
        System.out.println("Boundary case shuffle()");
        GroupOfCards tempdeck = new GroupOfCards(52);
        tempdeck.shuffle();
        GroupOfCards deck = new GroupOfCards(52);
        boolean expResult = false;
        boolean actResult = tempdeck.equals(deck);
        assertEquals(expResult, actResult);
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
     * Test of setSize method, of class GroupOfCards.
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
     * Test of drawCard method, of class GroupOfCards.
     */
    @Test
    public void GodtestDrawCard() {
        System.out.println("Good case drawCard()");
        GroupOfCards deck = new GroupOfCards(52);
        deck.shuffle();
        int expResult = 50;
        deck.drawCard();
        deck.drawCard();
        assertTrue(expResult == deck.getSize());

    }

    @Test
    public void BadtestDrawCard() {
        System.out.println("Bad Case drawCard()");
        GroupOfCards deck = new GroupOfCards(52);
        deck.shuffle();
        int expResult = 51;
        deck.drawCard();
        deck.drawCard();
        assertFalse(expResult == deck.getSize());

    }

    @Test
    public void BoundarytestDrawCard() {
        System.out.println("Boundary case drawCard()");
        GroupOfCards deck = new GroupOfCards(52);
        deck.shuffle();
        int expResult = 51;
        deck.drawCard();
        assertTrue(expResult == deck.getSize());

    }
}
