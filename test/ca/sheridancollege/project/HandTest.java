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
public class HandTest {

    public HandTest() {
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
     * Test of Hit method, of class Hand.
     */
    @Test
    public void BoundarytestHit() {
        System.out.println("Boundary case Hit");
        GroupOfCards deck = new GroupOfCards(52);
        Hand hand = new Hand(deck);
        hand.Hit(deck);
        assertEquals(hand.getHandSize(), 3);
    }

    @Test
    public void GoodtestHit() {
        System.out.println("Good case Hit()");
        GroupOfCards deck = new GroupOfCards(52);
        Hand hand = new Hand(deck);
        hand.Hit(deck);
        hand.Hit(deck);
        assertEquals(hand.getHandSize(), 4);
    }

    @Test
    public void BadtestHit() {
        System.out.println("Bad case Hit()");
        GroupOfCards deck = new GroupOfCards(52);
        Hand hand = new Hand(deck);

        assertEquals(hand.getHandSize(), 2);
    }

    /**
     * Test of getHandSize method, of class Hand.
     */
    @Test
    public void BadtestGetHandSize() {
        System.out.println("Bad case getHandSize()");
        GroupOfCards deck = new GroupOfCards(52);
        Hand hand = new Hand(deck);
        User user = new User();
        user.getNewHand(deck);
        int expResult = 3;
        int result = hand.getHandSize();
        assertTrue(expResult!=result);
    }
    @Test
    public void BoundarytestGetHandSize() {
        System.out.println("Boundary case getHandSize()");
        GroupOfCards deck = new GroupOfCards(52);
        Hand hand = new Hand(deck);
        User user = new User();
        user.getNewHand(deck);
        int expResult = 2;
        int result = hand.getHandSize();
        assertEquals(expResult,result);
    }


    /**
     * Test of getHandValue method, of class Hand.
     */
    @Test
    public void GoodtestGetHandValue() {
        System.out.println("Good case getHandValue");
        GroupOfCards deck = new GroupOfCards(52);
        Hand instance = new Hand(deck);
        User user = new User();
        user.getNewHand(deck);
        int expResult = 5;
        int result = user.getHand(1).getHandValue();
        assertEquals(expResult, result);
    }
@Test
    public void BadtestGetHandValue() {
        System.out.println("Bad case getHandValue");
        GroupOfCards deck = new GroupOfCards(52);
        Hand instance = new Hand(deck);
        User user = new User();
        user.getNewHand(deck);
        int expResult = 6;
        int result = user.getHand(1).getHandValue();
        assertFalse(expResult==result);
    }
    /**
     * Test of getCard method, of class Hand.
     */
    @Test
    public void testGetCard() {
        System.out.println("getCard");
        int cardnum = 0;
        GroupOfCards deck = new GroupOfCards(52);
        Hand instance = new Hand(deck);
        GroupOfCards tempDeck = new GroupOfCards(52);
        Hand aHand = new Hand(tempDeck);
        String expResult = aHand.getCard(cardnum).toString();
        String result = instance.getCard(cardnum).toString();
        assertEquals(expResult, result);
    }

    
    
}
