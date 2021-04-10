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
public class PlayerTest {

    public PlayerTest() {
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

    @Test
    public void testHasBlackJack() {
        System.out.println("hasBlackJack");
        User user1 = new User();
        GroupOfCards deck = new GroupOfCards(52);
        deck.shuffle();
        user1.getNewHand(deck);
        int handnum = 1;
        boolean expResult = false;
        boolean result = user1.hasBlackJack(handnum);
        System.out.println(result);
        assertEquals(expResult, result);

    }

    /**
     * Test of hasBusted method, of class Player.
     */
    @Test
    public void GoodtestHasBusted() {
        System.out.println("Good case hasBusted()");
        User user1 = new User();
        GroupOfCards deck = new GroupOfCards(52);
        deck.shuffle();
        user1.getNewHand(deck);
        user1.getHand(1).Hit(deck);
        user1.getHand(1).Hit(deck);
        user1.getHand(1).Hit(deck);
        user1.getHand(1).Hit(deck);
        Hand hand=new Hand(deck);
        boolean expResult = true;
        boolean result = user1.hasBusted();
        System.out.println(result);
        assertEquals(expResult, result);

    }
     @Test
    public void BoundarytestHasBusted() {
        System.out.println("Boundary case hasBusted()");
        User user1 = new User();
        GroupOfCards deck = new GroupOfCards(52);
        deck.shuffle();
        user1.getNewHand(deck);
        user1.getHand(1).Hit(deck);
        user1.getHand(1).Hit(deck);
        user1.getHand(1).Hit(deck);
        user1.getHand(1).Hit(deck);
        Hand hand=new Hand(deck);
        boolean expResult = true;
        boolean result = user1.hasBusted();
        System.out.println(result);
        assertEquals(expResult, result);

    }

    @Test
    public void BadtestHasBusted() {
        System.out.println("Bad case hasBusted()");
        User user1 = new User();
        GroupOfCards deck = new GroupOfCards(52);
        deck.shuffle();
        user1.getNewHand(deck);
       
        Hand hand=new Hand(deck);
        boolean expResult = false;
        boolean result = user1.hasBusted();
        System.out.println(result);
        assertEquals(expResult, result);

    }
     
    /**
     * Test of getHand method, of class Player.
     */
    @Test
    public void testGetHand() {
        ArrayList<Hand> Hand;
        Hand = new ArrayList<Hand>();
        System.out.println("getNewHand");
        GroupOfCards deck = new GroupOfCards(52);
        User user1 = new User();
        User user = new User();
        user1.getNewHand(deck);
        user.getNewHand(deck);
        boolean expresult = false;
        boolean actResult = user1.hand.contains(user.getHand(1));
        assertEquals(expresult, actResult);
    }

    /**
     * Test of getNewHand method, of class Player.
     */
   @Test
    public void testGetNewHand() {
        System.out.println("getNewHand");
        GroupOfCards deck = new GroupOfCards(52);
        User user = new User();
        user.getNewHand(deck);
        Hand[] aHand = new Hand[]{};
        aHand = user.hand.toArray(aHand);
        Hand myHand = aHand[0];
        assertEquals(myHand.getHandSize(),2);
    }

    public class PlayerImpl extends Player {
    }

}
