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
     */
    @Test
    public void GoodtestGetCash() {
        System.out.println("Good case getCash()");
        User user1 = new User();
        int money = 10;
        user1.setCash(money);
        assertTrue(user1.getCash() == money);

    }

    @Test
    public void BadtestGetCash() {
        System.out.println("Bad case getCash()");
        User user1 = new User();
        int money = 10;
        user1.setCash(money);
        assertFalse(user1.getCash() == 20);

    }

    @Test
    public void BoundarytestGetCash() {
        System.out.println("Boundary case getCash()");
        User user1 = new User();
        int money = 10;
        user1.setCash(money);
        assertTrue(user1.getCash() == money);

    }

    /**
     * Test of getBet method, of class User.
     */
    @Test
    public void GoodtestGetBet() {
        System.out.println("Good case getBet()");
        User user1 = new User();
        int money = 10;
        user1.setBet(money);
        assertTrue(user1.getBet() == money);

    }

    @Test
    public void BadtestGetBet() {
        System.out.println("Bad case getBet()");
        User user1 = new User();
        int money = 10;
        user1.setBet(money);
        assertFalse(user1.getBet() == 20);

    }

    @Test
    public void BoundarytestGetBet() {
        System.out.println("Boundary case getBet()");
        User user1 = new User();
        int money = 10;
        user1.setBet(money);
        assertTrue(user1.getBet() == money);

    }

    /**
     * Test of getName method, of class User.
     */
    @Test
    public void GoodtestGetName() {
        System.out.println("Good case getName()");
        String name = "Johhn";
        User user1 = new User();

        user1.setName(name);
        assertTrue(name == user1.getName());

    }

    @Test
    public void BadtestGetName() {
        System.out.println("Bad case getName()");
        String name = "Ben";
        User user1 = new User();

        user1.setName(name);
        assertFalse("John" == user1.getName());

    }

    @Test
    public void BoundarytestGetName() {
        System.out.println("Boundary case getName()");
        String name = "Ben";
        User user1 = new User();

        user1.setName(name);
        assertFalse("John" == user1.getName());

    }

    /**
     * Test of setCash method, of class User.
     */
    @Test
    public void BadtestSetCash() {
        System.out.println("Bad case setCash()");
        int money = 10;
        User user1 = new User();
        user1.setCash(money);
        assertFalse(20 == user1.getCash());
    }

    @Test
    public void GoodtestSetCash() {
        System.out.println("Good case setCash()");
        int money = 10;
        User user1 = new User();
        user1.setCash(money);
        assertTrue(money == user1.getCash());
    }

    @Test
    public void BoundarytestSetCash() {
        System.out.println("Boundary case setCash()");
        int money = 10;
        User user1 = new User();
        user1.setCash(money);
        assertTrue(money == user1.getCash());
    }

    /**
     * Test of setBet method, of class User.
     */
    @Test
    public void GoodtestSetBet() {
        System.out.println("Good case setBet()");
        int money = 100;
        User user1 = new User();
        user1.setBet(money);
        assertTrue(money == user1.getBet());
    }

    @Test
    public void BadtestSetBet() {
        System.out.println("Bad case setBet()");
        int money = 100;
        User user1 = new User();
        user1.setBet(money);
        assertFalse(20 == user1.getBet());
    }

    @Test
    public void BoundarytestSetBet() {
        System.out.println("Boundar case setBet()");
        int money = 100;
        User user1 = new User();
        user1.setBet(money);
        assertTrue(money == user1.getBet());
    }

    /**
     * Test of setName method, of class User.
     */
    @Test
    public void GoodtestSetName() {
        System.out.println("Good case setName()");
        String name = "John";
        User user1 = new User();
        user1.setName(name);
        assertTrue(user1.getName() == name);

    }

    @Test
    public void BadtestSetName() {
        System.out.println("Bad case setName()");
        String name = "John";
        User user1 = new User();
        user1.setName(name);
        assertFalse(user1.getName() == "Ben");

    }

    @Test
    public void BoundarytestSetName() {
        System.out.println("Boundary case setName()");
        String name = "John";
        User user1 = new User();
        user1.setName(name);
        assertEquals(user1.getName(), name);

    }

    /**
     * Test of doubleDown method, of class User.
     */
    @Test
    public void GoodtestDoubleDown() {
        System.out.println("Good case doubleDown()");
        User user1 = new User();
        user1.setCash(100);
        user1.setBet(20);
        user1.doubleDown();
        boolean Expresult = true;
        boolean actResult = false;
        if (user1.getCash() == 80 && user1.getBet() == 40) {
            actResult = true;
        }
        assertEquals(Expresult, actResult);
    }

    @Test
    public void BadtestDoubleDown() {
        System.out.println("Bad case doubleDown()");
        User instance = new User();
        instance.setCash(100);
        instance.setBet(20);
        instance.doubleDown();
        boolean Expresult = false;
        boolean actResult = false;
        if (instance.getCash() == 80 && instance.getBet() == 40) {
            actResult = false;
        }
        assertEquals(Expresult, actResult);
    }

    @Test
    public void BoundarytestDoubleDown() {
        System.out.println("Boundary case doubleDown");
        User user1 = new User();
        user1.setCash(100);
        user1.setBet(20);
        user1.doubleDown();
        boolean Expresult = true;
        boolean actResult = false;
        if (user1.getCash() == 80 && user1.getBet() == 40) {
            actResult = true;
        }
        assertEquals(Expresult, actResult);
    }

    /**
     * Test of win method, of class User.
     */
    @Test
    public void GoodtestWin() {
        System.out.println("Good case win()");
        User user1 = new User();
        user1.setBet(20);
        user1.setCash(40);
        user1.win();
        boolean expResult = true;
        boolean actualResult = false;
        if (user1.getCash() == 80) {
            actualResult = true;
        }
        assertEquals(actualResult, expResult);

    }

    @Test
    public void BadtestWin() {
        System.out.println("Bad case win()");
        User user1 = new User();
        user1.setBet(20);
        user1.setCash(40);
        user1.win();
        boolean expResult = false;
        boolean actualResult = false;
        if (user1.getCash() == 180) {
            actualResult = false;
        }
        assertEquals(actualResult, expResult);

    }

    @Test
    public void BoundarytestWin() {
        System.out.println("Boundary case win()");
        User user1 = new User();
        user1.setBet(20);
        user1.setCash(40);
        user1.win();
        boolean expResult = true;
        boolean actualResult = false;
        if (user1.getCash() == 80) {
            actualResult = true;
        }
        assertEquals(actualResult, expResult);

    }

    /**
     * Test of push method, of class User.
     */
    @Test
    public void GoodtestPush() {
        System.out.println("Good case push()");
        User user1 = new User();
        user1.setBet(10);
        user1.setCash(20);
        user1.push();
        boolean expResult = true;
        boolean actualResult = false;
        if (user1.getCash() == 30) {
            actualResult = true;
        }
        assertEquals(actualResult, expResult);
    }

    @Test
    public void BadtestPush() {
        System.out.println("Bad case push()");
        User user1 = new User();
        user1.setBet(10);
        user1.setCash(20);
        user1.push();
        boolean expResult = false;
        boolean actualResult = false;
        if (user1.getCash() == 60) {
            actualResult = false;
        }
        assertEquals(actualResult, expResult);
    }

    @Test
    public void BoundarytestPush() {
        System.out.println("Boundary case push()");
        User user1 = new User();
        user1.setBet(10);
        user1.setCash(20);
        user1.push();
        boolean expResult = true;
        boolean actualResult = false;
        if (user1.getCash() == 30) {
            actualResult = true;
        }
        assertEquals(actualResult, expResult);
    }

    /**
     * Test of blackJack method, of class User.
     */
    @Test
    public void GoodtestBlackJack() {
        System.out.println("Good case blackJack()");
        User user1 = new User();
        user1.setCash(20);
        user1.setBet(10);
        user1.blackJack();
        boolean expResult = true;
        boolean actualResult = false;
        if (user1.getCash() == 50) {
            actualResult = true;
        }
        assertEquals(actualResult, expResult);
    }

    @Test
    public void BadtestBlackJack() {
        System.out.println("Bad case blackJack()");
        User user1 = new User();
        user1.setCash(20);
        user1.setBet(10);
        user1.blackJack();
        boolean expResult = false;
        boolean actualResult = false;
        if (user1.getCash() == 70) {
            actualResult = false;
        }
        assertEquals(actualResult, expResult);
    }

    @Test
    public void BoundarytestBlackJack() {
        System.out.println("Boundary case blackJack");
        User user1 = new User();
        user1.setCash(20);
        user1.setBet(10);
        user1.blackJack();
        boolean expResult = true;
        boolean actualResult = false;
        if (user1.getCash() == 50) {
            actualResult = true;
        }
        assertEquals(actualResult, expResult);
    }
    @Test


    /**
     * Test of hasFiveCardTrick method, of class User.
     */
   
    public void testHasFiveCardTrick() {
        
        System.out.println("hasFiveCardTrick");
        User user1 = new User();
        GroupOfCards deck = new GroupOfCards(52);
        deck.shuffle();
        user1.getNewHand(deck);
        user1.getHand(1).Hit(deck);
        user1.getHand(1).Hit(deck);
        user1.getHand(1).Hit(deck);
        boolean expResult = false;
        boolean result = user1.hasFiveCardTrick(1);
        assertEquals(expResult, result);
    }

}
