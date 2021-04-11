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
import static org.junit.Assert.assertEquals;

/**
 *
 * @author Karan
 */
public class UserTest {

    public UserTest() {
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
     * Test of getCash method, of class User.
     * Good Test Case
     * to test valid functioning of getCash() method
     */
    @Test
    public void GoodtestGetCash() {
        System.out.println("Good case getCash()");
        User user1 = new User();
        int money = 10;
        user1.setCash(money);
        assertEquals(money,user1.getCash());

    }
/**
     * Test of getCash method, of class User.
     * Bad Test Case
     * to test invalid functioning of getCash() method
     */
    @Test
    public void BadtestGetCash() {
        System.out.println("Bad case getCash()");
        User user1 = new User();
        int money = 10;
        user1.setCash(money);
        assertNotEquals(20,user1.getCash());

    }
/**
     * Test of getCash method, of class User.
     * Boundary Test Case
     * to test boundary functioning of getCash() method
     */
    @Test
    public void BoundarytestGetCash() {
        System.out.println("Boundary case getCash()");
        User user1 = new User();
        int money = 10;
        user1.setCash(money);
        assertEquals(money,user1.getCash());

    }

    /**
     * Test of getBet method, of class User.
     * Good Test Case
     * to test valid functioning of getBet() method
     */
    @Test
    public void GoodtestGetBet() {
        System.out.println("Good case getBet()");
        User user1 = new User();
        int money = 10;
        user1.setBet(money);
        assertEquals(money,user1.getBet());

    }
/**
     * Test of getBet method, of class User.
     * Bad Test Case
     * to test invalid functioning of getBet() method
     */
    @Test
    public void BadtestGetBet() {
        System.out.println("Bad case getBet()");
        User user1 = new User();
        int money = 10;
        user1.setBet(money);
        assertNotEquals(20,user1.getBet());

    }
/**
     * Test of getBet method, of class User.
     * Boundary Test Case
     * to test boundary functioning of getBet() method
     */
    @Test
    public void BoundarytestGetBet() {
        System.out.println("Boundary case getBet()");
        User user1 = new User();
        int money = 10;
        user1.setBet(money);
        assertEquals(money,user1.getBet());

    }

    /**
     * Test of getName method, of class User.
     * Good Test Case
     * to test valid functioning of getName() method
     */
    @Test
    public void GoodtestGetName() {
        System.out.println("Good case getName()");
        String name = "Johhn";
        User user1 = new User();

        user1.setName(name);
        assertEquals(name,user1.getName());

    }
/**
     * Test of getName method, of class User.
     * Bad Test Case
     * to test invalid functioning of getName() method
     */
    @Test
    public void BadtestGetName() {
        System.out.println("Bad case getName()");
        String name = "Ben";
        User user1 = new User();

        user1.setName(name);
        assertNotEquals("John",user1.getName());

    }
/**
     * Test of getName method, of class User.
     * Boundary Test Case
     * to test boundary functioning of getName() method
     */
    @Test
    public void BoundarytestGetName() {
        System.out.println("Boundary case getName()");
        String name = "Ben";
        User user1 = new User();

        user1.setName(name);
        assertEquals("Ben",user1.getName());

    }

    /**
     * Test of setCash method, of class User.
     * Bad Test Case
     * to test invalid functioning of setCash() method
     */
    @Test
    public void BadtestSetCash() {
        System.out.println("Bad case setCash()");
        int money = 10;
        User user1 = new User();
        user1.setCash(money);
        assertNotEquals(20,user1.getCash());
    }
/**
     * Test of setCash method, of class User.
     * Good Test Case
     * to test valid functioning of setCash() method
     */
    @Test
    public void GoodtestSetCash() {
        System.out.println("Good case setCash()");
        int money = 10;
        User user1 = new User();
        user1.setCash(money);
        assertEquals(money,user1.getCash());
    }
/**
     * Test of setCash method, of class User.
     * Boundary Test Case
     * to test boundary functioning of setCash() method
     */
    @Test
    public void BoundarytestSetCash() {
        System.out.println("Boundary case setCash()");
        int money = 10;
        User user1 = new User();
        user1.setCash(money);
        assertEquals(money,user1.getCash());
    }

    /**
     * Test of setBet method, of class User.
     * Good Test Case
     * to test valid functioning of setBet() method
     */
    @Test
    public void GoodtestSetBet() {
        System.out.println("Good case setBet()");
        int money = 100;
        User user1 = new User();
        user1.setBet(money);
        assertEquals(money, user1.getBet());
    }
    /**
     * Test of setBet method, of class User.
     * Bad Test Case
     * to test invalid functioning of setBet() method
     */
    @Test
    public void BadtestSetBet() {
        System.out.println("Bad case setBet()");
        int money = 100;
        User user1 = new User();
        user1.setBet(money);
        assertNotEquals(20,user1.getBet());
    }
    /**
     * Test of setBet method, of class User.
     * Boundary Test Case
     * to test boundary functioning of setBet() method
     */
    @Test
    public void BoundarytestSetBet() {
        System.out.println("Boundar case setBet()");
        int money = 100;
        User user1 = new User();
        user1.setBet(money);
        assertEquals(money,user1.getBet());
    }

    /**
     * Test of setName method, of class User.
     * Good Test Case
     * to test valid functioning of setName() method
     */
    @Test
    public void GoodtestSetName() {
        System.out.println("Good case setName()");
        String name = "John";
        User user1 = new User();
        user1.setName(name);
        assertEquals(name,user1.getName());

    }
/**
     * Test of setName method, of class User.
     * Bad Test Case
     * to test invalid functioning of setName() method
     */
    @Test
    public void BadtestSetName() {
        System.out.println("Bad case setName()");
        String name = "John";
        User user1 = new User();
        user1.setName(name);
        assertNotEquals("Ben",user1.getName());

    }
/**
     * Test of setName method, of class User.
     * Boundary Test Case
     * to test boundary functioning of setName() method
     */
    @Test
    public void BoundarytestSetName() {
        System.out.println("Boundary case setName()");
        String name = "John";
        User user1 = new User();
        user1.setName(name);
        assertEquals( name,user1.getName());

    }

    /**
     * Test of doubleDown method, of class User.
     * Good Test Case
     * to test valid functioning of DoubleDown() method
     */
    @Test
    public void GoodtestDoubleDown() {
        System.out.println("Good case doubleDown()");
        User user1 = new User();
        user1.setBet(20);
        user1.setCash(100);
        user1.doubleDown();

        assertEquals(40, user1.getBet());
        assertEquals(60, user1.getCash());

    }
/**
     * Test of doubleDown method, of class User.
     * Bad Test Case
     * to test invalid functioning of DoubleDown() method
     */
    @Test
    public void BadtestDoubleDown() {
        System.out.println("Bad case doubleDown()");
        User user1 = new User();
        user1.setBet(60);
        user1.setCash(100);
        user1.doubleDown();
        
        assertEquals(-20, user1.getCash());
    }
/**
     * Test of doubleDown method, of class User.
     * Boundary Test Case
     * to test boundary functioning of DoubleDown() method
     */
    @Test
    public void BoundarytestDoubleDown() {
        System.out.println("Boundary case doubleDown");
        User user1 = new User();
        user1.setBet(50);
        user1.setCash(100);
        user1.doubleDown();
        
        assertEquals(0, user1.getCash());
    }

    /**
     * Test of win method, of class User.
     * Good Test Case
     * to test valid functioning of win() method
     */
    @Test
    public void GoodtestWin() {
        System.out.println("Good case win()");
        User user1 = new User();
        user1.setBet(20);
        user1.setCash(40);
        user1.win();

        assertEquals(60, user1.getCash());

    }
     /**
     * Test of win method, of class User.
     * Good Test Case
     * to test valid functioning of win() method
     */
    @Test
    public void BadtestWin() {
        System.out.println("Bad case win()");
        User user1 = new User();
        user1.setBet(40);
        user1.setCash(40);
        user1.win();

        assertNotEquals(90, user1.getCash());

    }
 /**
     * Test of win method, of class User.
     * Boundary Test Case
     * to test boundary functioning of win() method
     */
    @Test
    public void BoundarytestWin() {
         System.out.println("BOUNDARY Test case win()");
        User user1 = new User();
        user1.setBet(20);
        user1.setCash(40);
        user1.win();

        assertEquals(60, user1.getCash());

    }

    /**
     * Test of push method, of class User.
     * Good Test Case
     * to test valid functioning of push() method
     */
    @Test
    public void GoodtestPush() {
        System.out.println("Good case push()");
        User user1 = new User();
        user1.setBet(10);
        user1.setCash(30);
        user1.push();

        assertEquals(30, user1.getCash());
    }
/**
     * Test of push method, of class User.
     * Bad Test Case
     * to test invalid functioning of push() method
     */
    @Test
    public void BadtestPush() {
        System.out.println("Bad case push()");
       User user1 = new User();
        user1.setBet(10);
        user1.setCash(30);
        user1.push();

        assertNotEquals(40, user1.getCash());
    }
/**
     * Test of push method, of class User.
     * Boundary Test Case
     * to test boundary functioning of push() method
     */
    @Test
    public void BoundarytestPush() {
        System.out.println("Boundary case push()");
        User user1 = new User();
        user1.setBet(10);
        user1.setCash(30);
        user1.push();

        assertEquals(30, user1.getCash());
    }

    /**
     * Test of blackJack method, of class User.
     * Good Test Case
     * to test valid functioning of blackJack() method
     */
    @Test
    public void GoodtestBlackJack() {
        System.out.println("Good case blackJack()");
        User user1 = new User();
        user1.setCash(20);
        user1.setBet(10);
        user1.blackJack();
        assertEquals(50, user1.getCash());
    }
/**
     * Test of blackJack method, of class User.
     * Bad Test Case
     * to test invalid functioning of blackJack() method
     */
    @Test
    public void BadtestBlackJack() {
        System.out.println("Bad case blackJack()");
        User user1 = new User();
        user1.setCash(20);
        user1.setBet(10);
        user1.blackJack();
        assertNotEquals(60, user1.getCash());
    }
/**
     * Test of blackJack method, of class User.
     * Boundary Test Case
     * to test boundary functioning of blackJack() method
     */
    @Test
    public void BoundarytestBlackJack() {
        System.out.println("Boundary case blackJack");
        User user1 = new User();
        user1.setCash(20);
        user1.setBet(20);
        user1.blackJack();
        assertEquals(80, user1.getCash());
    }
   


    /**
     * Test of hasFiveCardTrick method, of class User.
     * Good Test Case
     * to test valid functioning of hasFiveCardTrick() method
     */
    @Test
    public void GoodtestHasFiveCardTrick() {
        
        System.out.println("Good test for hasFiveCardTrick()");
        User user1 = new User();
        GroupOfCards deck = new GroupOfCards(52);
        ArrayList<playingCard> playingCards = new ArrayList<>();
        playingCards.add(new playingCard(playingCard.Suit.HEARTS, playingCard.Value.ACE));
        playingCards.add(new playingCard(playingCard.Suit.HEARTS, playingCard.Value.TWO));
        playingCards.add(new playingCard(playingCard.Suit.HEARTS, playingCard.Value.THREE));
        playingCards.add(new playingCard(playingCard.Suit.DIAMONDS, playingCard.Value.TWO));
        playingCards.add(new playingCard(playingCard.Suit.CLUBS, playingCard.Value.TWO));
        playingCards.add(new playingCard(playingCard.Suit.SPADES, playingCard.Value.TWO));
        deck.getCards().clear();
        deck.setCards(playingCards);
        user1.getNewHand(deck);
        user1.getHand(1).Hit(deck);
        user1.getHand(1).Hit(deck);
        user1.getHand(1).Hit(deck);
        assertTrue(user1.hasFiveCardTrick(1));
    }
    /**
     * Test of hasFiveCardTrick method, of class User.
     * Bad Test Case
     * to test invalid functioning of hasFiveCardTrick() method
     */
    @Test
    public void BadtestHasFiveCardTrick() {
        
        System.out.println("Bad test for hasFiveCardTrick()");
        User user1 = new User();
        GroupOfCards deck = new GroupOfCards(52);
        ArrayList<playingCard> playingCards = new ArrayList<>();
        playingCards.add(new playingCard(playingCard.Suit.HEARTS, playingCard.Value.QUEEN));
        playingCards.add(new playingCard(playingCard.Suit.HEARTS, playingCard.Value.TWO));
        playingCards.add(new playingCard(playingCard.Suit.HEARTS, playingCard.Value.KING));
        playingCards.add(new playingCard(playingCard.Suit.DIAMONDS, playingCard.Value.QUEEN));
        playingCards.add(new playingCard(playingCard.Suit.CLUBS, playingCard.Value.TWO));
        playingCards.add(new playingCard(playingCard.Suit.SPADES, playingCard.Value.QUEEN));
        deck.getCards().clear();
        deck.setCards(playingCards);
        user1.getNewHand(deck);
        user1.getHand(1).Hit(deck);
        user1.getHand(1).Hit(deck);
        user1.getHand(1).Hit(deck);
        assertFalse(user1.hasFiveCardTrick(1));
    }
    /**
     * Test of hasFiveCardTrick method, of class User.
     * Boundary Test Case
     * to test boundary functioning of hasFiveCardTrick() method
     */
    @Test
    public void BoundarytestHasFiveCardTrick() {
        
        System.out.println("Boundary test for hasFiveCardTrick()");
        User user1 = new User();
        GroupOfCards deck = new GroupOfCards(52);
        ArrayList<playingCard> playingCards = new ArrayList<>();
        playingCards.add(new playingCard(playingCard.Suit.HEARTS, playingCard.Value.QUEEN));
        playingCards.add(new playingCard(playingCard.Suit.HEARTS, playingCard.Value.TWO));
        playingCards.add(new playingCard(playingCard.Suit.HEARTS, playingCard.Value.THREE));
        playingCards.add(new playingCard(playingCard.Suit.DIAMONDS, playingCard.Value.TWO));
        playingCards.add(new playingCard(playingCard.Suit.CLUBS, playingCard.Value.ACE));
        playingCards.add(new playingCard(playingCard.Suit.SPADES, playingCard.Value.ACE));
        deck.getCards().clear();
        deck.setCards(playingCards);
        user1.getNewHand(deck);
        user1.getHand(1).Hit(deck);
        user1.getHand(1).Hit(deck);
        user1.getHand(1).Hit(deck);
        assertTrue(user1.hasFiveCardTrick(1));
    }

}
