/**
 * SYST 17796 Project Winter 2021 Base code.
 * Students can modify and extend to implement their game.
 * @modifier Karan 10-4-2021
*@modifier AsfandYar 10-4-2021
*@modifier Abubaker 10-4-2021
 */
package ca.sheridancollege;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you
 * might want to subclass this more than once. The group of cards has a maximum
 * size attribute which is flexible for reuse.
 *
 * @author dancye
 */
public class GroupOfCards {

    //The group of cards, stored in an ArrayList
    private ArrayList<playingCard> cards;
    private int size;//the size of the grouping

    public GroupOfCards(int givenSize) {
        size = givenSize;
        cards = new ArrayList<playingCard>();
      
        for (playingCard.Suit s : playingCard.Suit.values()) {
            for (playingCard.Value v : playingCard.Value.values()) {
                cards.add(new playingCard(s, v));
            }
        }

    }

    /**
     * A method that will get the group of cards as an ArrayList
     *
     * @return the group of cards.
     */
    public ArrayList<playingCard> showCards() {
        return cards;
    }

    public void shuffle() {
        Random random = new Random();
        playingCard temp;
        for (int i = 0; i < 200; i++) {
            int index1 = random.nextInt(cards.size() - 1);
            int index2 = random.nextInt(cards.size() - 1);
            temp = cards.get(index2);
            cards.set(index2, cards.get(index1));
            cards.set(index1, temp);
        }
    }

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        if(cards.size()<=0){
            return 0;
        }
        return size;
    }

    /**
     * @param givenSize the max size for the group of cards
     */
    public void setSize(int givenSize) {
        size = givenSize;
    }

    public playingCard drawCard() {
        if(cards.size()<=0){
            return null;
        }
        playingCard card = cards.remove(0);
        size--;
        return card;
    }

    public ArrayList<playingCard> getCards() {
        return cards;
    }

    public void setCards(ArrayList<playingCard> cards) {
        this.cards = cards;
    }
}

//end class
