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
     */
    @Test
    public void GoodtestShowFirstCard() {
        System.out.println("Good test case for showFirstCard()");
        
        dealer.getNewHand(deck);
        dealer.showFirstCard();
        playingCard card = new playingCard(playingCard.Suit.HEARTS, playingCard.Value.ACE);
        assertEquals(dealer.hand.get(0).getHand().get(0).toString(), card.toString());
    }
    
    /**
     * Test of showFirstCard method, of class Dealer.
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
     * Test of wantsToHit method, of class Dealer.
     */
    @Test
    public void testWantsToHit() {
        /*good*/
        System.out.println("wantsToHit");
        Dealer dealer = new Dealer();
        GroupOfCards deck = new GroupOfCards(52);
        dealer.getNewHand(deck);
        boolean result = dealer.wantsToHit();
        System.out.println(result);
        assertTrue(result);
        /*bad*/
        dealer.getHand(1).Hit(deck);
        dealer.getHand(1).Hit(deck);
        dealer.getHand(1).Hit(deck);
        dealer.getHand(1).Hit(deck);
        dealer.getHand(1).Hit(deck);

        result = dealer.wantsToHit();
        assertFalse(result);
    }

    @Test
    public void boundaryWantsToHitTest() {
        Dealer dealer = new Dealer();
        boolean result = dealer.wantsToHit();
        assertFalse(result);
    }

    @Test
    public void BadWantsToHitTest() {
        System.out.println("wantsToHit");
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
     * Test of showHand method, of class Dealer.
     */
    @Test
    public void testGoodShowHand() {
        System.out.println("showHand");
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

    @Test
    public void testBadShowHand() {
        System.out.println("showHand");
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

    @Test
    public void testBoundaryShowHand() {
        System.out.println("showHand");
        List<Hand> handList = new ArrayList<>();
        dealer.showHand();
        assertEquals(handList.toString(), dealer.hand.toString());
    }

    /**
     * Test of takeTurn method, of class Dealer.
     */
    @Test
    public void testGoodTakeTurn() {
        System.out.println("takeTurn");
        dealer.getNewHand(deck);
        String result = dealer.takeTurn(deck);
        assertEquals(result, "The dealer stands.");
    }

    @Test
    public void testBadTakeTurn() {
        System.out.println("takeTurn");
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

    @Test
    public void testBoundaryTakeTurn() {
        System.out.println("takeTurn");
        String result = dealer.takeTurn(deck);
        assertEquals("Please draw initial hand!", result);
    }
}
