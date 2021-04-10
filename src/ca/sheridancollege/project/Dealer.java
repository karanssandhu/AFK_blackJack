//@author Karan 10-4-2021
//@author AsfandYar 10-4-2021
//@author Abubaker 10-4-2021
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Arrays;

public class Dealer extends Player {

    public Dealer() {
    }

    public void showFirstCard() {
        playingCard[] firstCard = new playingCard[]{};
        firstCard = hand.toArray(firstCard);
        System.out.println("[" + firstCard[0] + "]");
    }

    public boolean wantsToHit() {
        Hand[] aHand = new Hand[]{};
        aHand = hand.toArray(aHand);
        return aHand[0].getHandValue() < 17;
    }

    public void showHand() {
        System.out.println(hand);
    }

    public void takeTurn(GroupOfCards deck) {
        Hand[] aHand = new Hand[]{};
        aHand = hand.toArray(aHand);
        while (wantsToHit()) {
            System.out.println("The dealer hits.");
            aHand[0].Hit(deck);
            if (hasBusted()) {
                break;
            }
        }
        System.out.println("The dealer stands.");
    }
}
