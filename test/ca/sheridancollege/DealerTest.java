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

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 *
 * @author Karan
 */
public class DealerTest {
    static Dealer dealer;
    static GroupOfCards deck;
    public DealerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        dealer = new Dealer();
        deck = new GroupOfCards(52);
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
     * Test of showFirstCard method, of class Dealer.
     * Good test case
     * to check all the valid cases for the showFirstCard()
     */
    @Test
    public void GoodtestShowFirstCard() {
        System.out.println("Good test case for showFirstCard()");
        GroupOfCards tempDeck = new GroupOfCards(52);
        ArrayList<playingCard> playingCards = new ArrayList<>();
        playingCards.add(new playingCard(playingCard.Suit.HEARTS, playingCard.Value.ACE));
        playingCards.add(new playingCard(playingCard.Suit.HEARTS, playingCard.Value.ACE));
        deck.getCards().clear();
        deck.setCards(playingCards);
        dealer.getNewHand(tempDeck);
        dealer.showFirstCard();
        playingCard card = new playingCard(playingCard.Suit.HEARTS, playingCard.Value.ACE);
        assertEquals(dealer.hand.get(0).getHand().get(0).toString(), card.toString());
    }
    
    /**
     * Test of showFirstCard method, of class Dealer.
     * Bad test case
     * to check all the invalid cases for the showFirstCard()
     */
    @Test
    public void BadtestShowFirstCard() {
        System.out.println("Bad test case for showFirstCard");

        dealer.getNewHand(deck);
        dealer.showFirstCard();
        playingCard card = new playingCard(playingCard.Suit.CLUBS, playingCard.Value.ACE);
        assertNotEquals(card.toString(),dealer.hand.get(0).getHand().get(0).toString());
    }
    
    /**
     * Test of showFirstCard method, of class Dealer.
     * Boundary test case
     * to check all the boundary cases for the showFirstCard()
     */
    @Test
    public void BoundarytestShowFirstCard() {
        System.out.println("Good test case for showFirstCard()");
        
        dealer.getNewHand(deck);
        dealer.showFirstCard();
        playingCard card = new playingCard(playingCard.Suit.HEARTS, playingCard.Value.ACE);
        assertEquals(dealer.hand.get(0).getHand().get(0).toString(), card.toString());
    }

    /**
     * Test of wantsToHit method, of class Dealer.
     * Good test case
     * to check all the valid cases for the wantsToHit()
     */
    @Test
    public void GoodtestWantsToHit() {
        System.out.println("Good test case for wantsToHit");
        Dealer dealer = new Dealer();
        GroupOfCards deck = new GroupOfCards(52);
        dealer.getNewHand(deck);
        boolean result = dealer.wantsToHit();
        System.out.println(result);
        assertTrue(result);
    }

     /**
     * Test of wantsToHit method, of class Dealer.
     * Boundary test case
     * to check all the Boundary cases for the wantsToHit()
     */
    @Test
    public void boundaryWantsToHitTest() {
        System.out.println("Boundary test case for wantsToHit");
        Dealer dealer = new Dealer();
        boolean result = dealer.wantsToHit();
        assertFalse(result);
    }
    
    /**
     * Test of wantsToHit method, of class Dealer.
     * Boundary test case
     * to check all the Boundary cases for the wantsToHit()
     */
    @Test
    public void BadWantsToHitTest() {
        System.out.println("Bad test case for wantsToHit");
        Dealer dealer = new Dealer();
        GroupOfCards deck = new GroupOfCards(52);
        dealer.getNewHand(deck);
        dealer.getHand(1).Hit(deck);
        dealer.getHand(1).Hit(deck);
        dealer.getHand(1).Hit(deck);
        dealer.getHand(1).Hit(deck);
        dealer.getHand(1).Hit(deck);

        boolean result = dealer.wantsToHit();
        assertFalse(result);
    
    }

    /**
     * Test of showHand() method, of class Dealer.
     * Good test case
     * to check all the valid cases for the showHand()()
     */
    @Test
    public void GoodtestShowHand() {
        System.out.println("Good test for showHand");
        GroupOfCards tempDeck = new GroupOfCards(52);
        ArrayList<playingCard> playingCards = new ArrayList<>();
        playingCards.add(new playingCard(playingCard.Suit.HEARTS, playingCard.Value.ACE));
        playingCards.add(new playingCard(playingCard.Suit.HEARTS, playingCard.Value.TWO));
        tempDeck.getCards().clear();
        tempDeck.setCards(playingCards);
        dealer.getNewHand(tempDeck);
        List<Hand> handList = new ArrayList<>();
        playingCards.add(new playingCard(playingCard.Suit.HEARTS, playingCard.Value.ACE));
        playingCards.add(new playingCard(playingCard.Suit.HEARTS, playingCard.Value.TWO));
        Hand hand = new Hand(deck);
        hand.setHand(playingCards);
        handList.add(hand);
        dealer.showHand();
        assertEquals(handList.toString(), dealer.hand.toString());
    }

    /**
     * Test of showHand() method, of class Dealer.
     * Bad test case
     * to check all the invalid cases for the showHand()()
     */
    @Test
    public void BadtestShowHand() {
        System.out.println("Bad test for showHand");
        dealer.getNewHand(deck);
        List<Hand> handList = new ArrayList<>();
        ArrayList<playingCard> playingCards = new ArrayList<>();
        playingCards.add(new playingCard(playingCard.Suit.HEARTS, playingCard.Value.ACE));
        playingCards.add(new playingCard(playingCard.Suit.HEARTS, playingCard.Value.THREE));
        Hand hand = new Hand(deck);
        hand.setHand(playingCards);
        handList.add(hand);
        dealer.showHand();
        assertNotEquals(handList.toString(), dealer.hand.toString());
    }

     /**
     * Test of showHand() method, of class Dealer.
     * Boundary test case
     * to check all the boundary cases for the showHand()()
     */
    @Test
    public void BoundarytestShowHand() {
         GroupOfCards tempDeck = new GroupOfCards(52);
        ArrayList<playingCard> playingCards = new ArrayList<>();
        playingCards.add(new playingCard(playingCard.Suit.HEARTS, playingCard.Value.ACE));
        playingCards.add(new playingCard(playingCard.Suit.HEARTS, playingCard.Value.TWO));
        tempDeck.getCards().clear();
        tempDeck.setCards(playingCards);
        dealer.getNewHand(tempDeck);
        List<Hand> handList = new ArrayList<>();
        playingCards.add(new playingCard(playingCard.Suit.HEARTS, playingCard.Value.ACE));
        playingCards.add(new playingCard(playingCard.Suit.HEARTS, playingCard.Value.TWO));
        Hand hand = new Hand(deck);
        hand.setHand(playingCards);
        handList.add(hand);
        dealer.showHand();
        assertEquals(handList.toString(), dealer.hand.toString());
    }

    /**
     * Test of takeTurn method, of class Dealer.
     * Good test case
     * to check all the good cases for the takeTurn()
     */
    @Test
    public void GoodtestTakeTurn() {
        System.out.println("Good test for takeTurn");
        dealer.getNewHand(deck);
        String result = dealer.takeTurn(deck);
        assertEquals(result, "The dealer stands.");
    }

    /**
     * Test of takeTurn method, of class Dealer.
     * Bad test case
     * to check all the invalid cases for the takeTurn()
     */
    @Test
    public void BadtestTakeTurn() {
        System.out.println("Bad test for takeTurn");
        dealer.getNewHand(deck);
        dealer.getHand(1).Hit(deck);
        dealer.getHand(1).Hit(deck);
        dealer.getHand(1).Hit(deck);
        dealer.getHand(1).Hit(deck);
        dealer.getHand(1).Hit(deck);
        dealer.getHand(1).Hit(deck);
        dealer.getHand(1).Hit(deck);
        dealer.getHand(1).Hit(deck);
        String result = dealer.takeTurn(deck);
        assertEquals(10, dealer.hand.get(0).getHandSize());
    }
    /**
     * Test of takeTurn method, of class Dealer.
     * Boundary test case
     * to check all the boundary cases for the takeTurn()
     */
    @Test
    public void BoundarytestTakeTurn() {
        GroupOfCards tempDeck = new GroupOfCards(52);
        Dealer dealer1 = new Dealer();
        System.out.println("Boundary test for takeTurn");
        String result = dealer1.takeTurn(tempDeck);
        assertEquals("Please initialise hand!", result);
    }
}
