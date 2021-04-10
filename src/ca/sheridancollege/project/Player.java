/**
 * SYST 17796 Project Winter 2021 Base code.
 * Students can modify and extend to implement their game.
 *@modifier Karan 10-4-2021
 *@modifier AsfandYar 10-4-2021
*@modifier Abubaker 10-4-2021
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * A class that models each Player in the game. Players have an identifier,
 * which should be unique.
 *
 * @author dancye
 */
public abstract class Player {

    

    
    

    /**
     * The method to be instantiated when you subclass the Player class with
     * your specific type of Player and filled in with logic to play your game.
     */
    ArrayList<Hand> hand;

    Player() {
        hand = new ArrayList<Hand>();
    }

    public boolean hasBlackJack(int handnum) {
        Hand[] aHand = new Hand[]{};
        aHand = hand.toArray(aHand);
        return (aHand[handnum - 1].getHandSize() == 2 && aHand[handnum - 1].getHandValue() == 21);
    }

    public boolean hasBusted() {
        Hand[] aHand = new Hand[]{};
        aHand = hand.toArray(aHand);
        return (aHand[0].getHandValue() > 21);
    }

    public Hand getHand(int handnum) {
        Hand[] aHand = new Hand[]{};
        aHand = hand.toArray(aHand);
        return aHand[handnum - 1];
    }

    public void getNewHand(GroupOfCards deck) {
        hand.clear();
        Hand myHand = new Hand(deck);
        hand.add(myHand);
    }
    
}

    

