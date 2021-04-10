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
public class GameTest {

    public GameTest() {
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
     * Test of getGameName method, of class Game.
     */
    @Test
    public void GoodtestGetGameName() {
        System.out.println("Good case getGameName()");
        BlackJack instance = new BlackJack("BlackJack");
        String expResult = "BlackJack";
        String result = instance.getGameName();
        assertEquals(expResult, result);

    }

    @Test
    public void BadtestGetGameName() {
        System.out.println("Bad case getGameName()");
        BlackJack instance = new BlackJack("BlackJack");
        String expResult = "Poker";
        String result = instance.getGameName();
        assertFalse(expResult == result);
    }
    @Test
    public void BoundarytestGetGameName() {
    System.out.println("Boundary case getGameName");
    BlackJack instance =new BlackJack("BlackJack");
    String expResult="BlackJack";
    String result=instance.getGameName();
    assertEquals(expResult,result);
    }
}
      

       
