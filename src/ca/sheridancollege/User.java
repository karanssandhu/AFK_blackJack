//@author Karan 10-4-2021
//@author AsfandYar 10-4-2021
//@author Abubaker 10-4-2021
package ca.sheridancollege;

import java.util.ArrayList;
import java.util.Arrays;

public class User extends Player {

    private int cash;
    private int bet;
    private String name;

    public User() {
        this.bet = 0;
        this.cash = 0;
    }

    public int getCash() {
        return cash;
    }

    public int getBet() {
        return bet;
    }

    public String getName() {
        return name;
    }

    public void setCash(int money) {
        cash = money - bet;
    }

    public void setBet(int money) {
        bet = money;
    }

    public void setName(String username) {
        name = username;
    }

    
    public void doubleDown() {
        cash = cash - bet;
        bet = 2 * bet;
    }

    public void win() {
        cash = cash + 2 * bet;
    }

    public void push() {
        cash = cash + bet;
    }

    public void blackJack() {
        cash = cash + 3 * bet;
    }

   

    public boolean hasFiveCardTrick(int handnum) {
        Hand[] aHand = new Hand[]{};
        aHand = hand.toArray(aHand);
        Hand myHand = aHand[handnum - 1];
        return (myHand.getHandSize() == 5 && myHand.getHandValue() < 21);
    }

    

}
