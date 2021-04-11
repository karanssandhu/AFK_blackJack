/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege;

import java.util.ArrayList;
import java.util.List;

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
    public void GoodtestHasBlackJack() {
        System.out.println("Good test for hasBlackJack");
        User user1 = new User();
        GroupOfCards deck = new GroupOfCards(52);
        ArrayList<playingCard> playingCards = new ArrayList<>();
        playingCards.add(new playingCard(playingCard.Suit.HEARTS, playingCard.Value.ACE));
        playingCards.add(new playingCard(playingCard.Suit.HEARTS, playingCard.Value.QUEEN));
        deck.getCards().clear();
        deck.setCards(playingCards);
        user1.getNewHand(deck);
        boolean result = user1.hasBlackJack(1);
        assertTrue(result);

    }

    @Test
    public void BadtestHasBlackJack() {
        System.out.println("Bad test for hasBlackJack");
        User user1 = new User();
        GroupOfCards deck = new GroupOfCards(52);
        ArrayList<playingCard> playingCards = new ArrayList<>();
        playingCards.add(new playingCard(playingCard.Suit.HEARTS, playingCard.Value.ACE));
        playingCards.add(new playingCard(playingCard.Suit.HEARTS, playingCard.Value.ACE));
        deck.getCards().clear();
        deck.setCards(playingCards);
        user1.getNewHand(deck);
        assertFalse(user1.hasBlackJack(1));

    }
    
    @Test
    public void BoundarytestHasBlackJack() {
        System.out.println("Boundary test for hasBlackJack");
        User user1 = new User();
        GroupOfCards deck = new GroupOfCards(52);
        ArrayList<playingCard> playingCards = new ArrayList<>();
        playingCards.add(new playingCard(playingCard.Suit.HEARTS, playingCard.Value.QUEEN));
        playingCards.add(new playingCard(playingCard.Suit.HEARTS, playingCard.Value.ACE));
        deck.getCards().clear();
        deck.setCards(playingCards);
        user1.getNewHand(deck);
        boolean result = user1.hasBlackJack(1);
        System.out.println(result);
        assertTrue(result);

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
    public void GoodtestGetHand() {
        System.out.println("Good test case hasBusted()");
        User user1 = new User();
        GroupOfCards deck = new GroupOfCards(52);
        ArrayList<playingCard> playingCards = new ArrayList<>();
        
        playingCard card1 = new playingCard(playingCard.Suit.HEARTS, playingCard.Value.TWO);
        playingCards.add(new playingCard(playingCard.Suit.HEARTS, playingCard.Value.TWO));
        
        playingCard card = new playingCard(playingCard.Suit.CLUBS, playingCard.Value.ACE);
        playingCards.add(new playingCard(playingCard.Suit.CLUBS, playingCard.Value.ACE));
        
        deck.getCards().clear();
        deck.setCards(playingCards);
        user1.getNewHand(deck);

        assertEquals(card1.toString(),user1.getHand(1).getCard(0).toString());
    }
    
    @Test
    public void BadtestGetHand() {
       System.out.println("Bad test case hasBusted()");
       User user1 = new User();
        GroupOfCards deck = new GroupOfCards(52);
        ArrayList<playingCard> playingCards = new ArrayList<>();
        
        playingCard card1 = new playingCard(playingCard.Suit.HEARTS, playingCard.Value.TWO);
        playingCards.add(new playingCard(playingCard.Suit.HEARTS, playingCard.Value.TWO));
        
        playingCard card = new playingCard(playingCard.Suit.CLUBS, playingCard.Value.ACE);
        playingCards.add(new playingCard(playingCard.Suit.CLUBS, playingCard.Value.TWO));
        
        deck.getCards().clear();
        deck.setCards(playingCards);
        user1.getNewHand(deck);

        assertEquals(card1.toString(),user1.getHand(1).getCard(0).toString());
    }
    
    @Test
    public void BoundarytestGetHand() {
        System.out.println("Boundary test case hasBusted()");
        User user1 = new User();
        GroupOfCards deck = new GroupOfCards(52);
        ArrayList<playingCard> playingCards = new ArrayList<>();
        
        playingCard card1 = new playingCard(playingCard.Suit.HEARTS, playingCard.Value.TWO);
        playingCards.add(new playingCard(playingCard.Suit.HEARTS, playingCard.Value.TWO));
        
        playingCard card = new playingCard(playingCard.Suit.CLUBS, playingCard.Value.ACE);
        playingCards.add(new playingCard(playingCard.Suit.CLUBS, playingCard.Value.ACE));
        
        deck.getCards().clear();
        deck.setCards(playingCards);
        user1.getNewHand(deck);

        assertEquals(card1.toString(),user1.getHand(1).getCard(0).toString());
    }

    /**
     * Test of getNewHand method, of class Player.
     */
   @Test
    public void GoodtestGetNewHand() {
        System.out.println("getNewHand");
        GroupOfCards deck = new GroupOfCards(52);
        User user = new User();
        user.getNewHand(deck);
        Hand[] aHand = new Hand[]{};
        aHand = user.hand.toArray(aHand);
        Hand myHand = aHand[0];
        assertEquals(myHand.getHandSize(),2);
    }
    
    @Test
    public void BadtestGetNewHand() {
        System.out.println("Bad test case for getNewHand()");
        GroupOfCards deck = new GroupOfCards(52);
        User user = new User();
        user.getNewHand(deck);
        Hand[] aHand = new Hand[]{};
        aHand = user.hand.toArray(aHand);
        Hand myHand = aHand[0];
        assertEquals(myHand.getHandSize(),1);
    }
    
    @Test
    public void BoundarytestGetNewHand() {
        System.out.println("Boundary test case for getNewHand()");
        GroupOfCards deck = new GroupOfCards(52);
        User user = new User();
        user.getNewHand(deck);
        user.getHand(1).Hit(deck);
        Hand[] aHand = new Hand[]{};
        aHand = user.hand.toArray(aHand);
        Hand myHand = aHand[0];
        assertEquals(myHand.getHandSize(),3);
    }
}
