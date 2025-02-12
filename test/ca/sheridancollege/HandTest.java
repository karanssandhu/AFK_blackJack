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
     * Boundary test case
     * to test the valid boundary functioning of the Hit method
     */
    @Test
    public void BoundarytestHit() {
        System.out.println("Boundary case Hit");
        GroupOfCards deck = new GroupOfCards(52);
        Hand hand = new Hand(deck);
        hand.Hit(deck);
        assertEquals(hand.getHandSize(), 3);
    }

    /**
     * Test of Hit method, of class Hand.
     * Good test case
     * to test if valid functioning of the Hit method
     */
    @Test
    public void GoodtestHit() {
        System.out.println("Good case Hit()");
        GroupOfCards deck = new GroupOfCards(52);
        Hand hand = new Hand(deck);
        hand.Hit(deck);
        hand.Hit(deck);
        assertEquals(hand.getHandSize(), 4);
    }

    /**
     * Test of Hit method, of class Hand.
     * Bad test case
     * to test the valid functioning of the Hit method
     */
    @Test
    public void BadtestHit() {
        System.out.println("Bad case Hit()");
        GroupOfCards deck = new GroupOfCards(52);
        Hand hand = new Hand(deck);
        assertEquals(hand.getHandSize(), 2);
    }

    /**
     * Test of good getHandSize method, of class Hand.
     * Good test case
     * to test the valid functioning of the getHandSize method
     */
    @Test
    public void GoodtestGetHandSize() {
        System.out.println("Good case getHandSize()");
        GroupOfCards deck = new GroupOfCards(52);
        Hand hand = new Hand(deck);
        User user = new User();
        user.getNewHand(deck);
        int expResult = 2;
        int result = hand.getHandSize();
        assertEquals(expResult, result);
    }

    /**
     * Test of getHandSize method, of class Hand.
     * Bad test case
     * to test the invalid functioning of the getHandSize method
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
        assertNotEquals(expResult, result);
    }
    
    /**
     * Test of  getHandSize method, of class Hand.
     * Boundary test case
     * to test the boundary functioning of the getHandSize method
     */
    @Test
    public void BoundarytestGetHandSize() {
        System.out.println("Boundary case getHandSize()");
        GroupOfCards deck = new GroupOfCards(52);
        Hand hand = new Hand(deck);
        User user = new User();
        user.getNewHand(deck);
        int expResult = 2;
        int result = hand.getHandSize();
        assertEquals(expResult, result);
    }

    /**
     * Test of getHandValue method, of class Hand.
     * Good  test case
     * to test the valid functioning of the getHandValue method
     */
    @Test
    public void GoodtestGetHandValue() {
        System.out.println("Good case getHandValue");
        GroupOfCards deck = new GroupOfCards(52);
        Hand instance = new Hand(deck);
        User user = new User();
        user.getNewHand(deck);
        int expResult = 7;
        int result = user.getHand(1).getHandValue();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getHandValue method, of class Hand.
     * Bad  test case
     * to test the invalid functioning of the getHandValue method
     */
    @Test
    public void BadtestGetHandValue() {
        System.out.println("Bad case getHandValue");
        GroupOfCards deck = new GroupOfCards(52);
        Hand instance = new Hand(deck);
        User user = new User();
        user.getNewHand(deck);
        int expResult = 6;
        int result = user.getHand(1).getHandValue();
        assertNotEquals(expResult, result);
    }

     /**
     * Test of getHandValue method, of class Hand.
     * Bad  test case
     * to test the boundary functioning of the getHandValue method
     */
    @Test
    public void BoundarytestGetHandValue() {
        System.out.println("Boundary case getHandValue");
        GroupOfCards deck = new GroupOfCards(52);
        Hand instance = new Hand(deck);
        User user = new User();
        user.getNewHand(deck);
        user.getHand(1).Hit(deck);
        int expResult = 12;
        int result = user.getHand(1).getHandValue();
        assertEquals(expResult, result);
    }
    
    
    /**
     * Test of getCard method, of class Hand. 
     * //TODO - Ignore
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
