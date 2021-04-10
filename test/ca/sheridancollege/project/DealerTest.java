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
public class DealerTest {
    
    public DealerTest() {
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
     * Test of showFirstCard method, of class Dealer.
     */
    @Test
    public void testShowFirstCard() {
        System.out.println("showFirstCard");
        Dealer instance = new Dealer();
        instance.showFirstCard();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of wantsToHit method, of class Dealer.
     */
    @Test
    public void testWantsToHit() {
        System.out.println("wantsToHit");
        Dealer instance = new Dealer();
        boolean expResult = false;
        boolean result = instance.wantsToHit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showHand method, of class Dealer.
     */
    @Test
    public void testShowHand() {
        System.out.println("showHand");
        Dealer instance = new Dealer();
        instance.showHand();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of takeTurn method, of class Dealer.
     */
    @Test
    public void testTakeTurn() {
        System.out.println("takeTurn");
        GroupOfCards deck = null;
        Dealer instance = new Dealer();
        instance.takeTurn(deck);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
