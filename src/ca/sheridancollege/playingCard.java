//@author Karan 10-4-2021
//@author AsfandYar 10-4-2021
//@author Abubaker 10-4-2021
package ca.sheridancollege;

public class playingCard extends Card {

    public enum Suit {
        HEARTS,
        DIAMONDS,
        SPADES,
        CLUBS
    };

    public enum Value {
        ACE,
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN,
        JACK,
        QUEEN,
        KING
    };

    private final Suit suit;
    private final Value value;

    public playingCard(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    public int getSuit() {
        if(this.suit==null){
            return 0;
        }
        return this.suit.ordinal();
    }

    public int getRank() {
        if(this.value==null){
            return 0;
        }
        return value.ordinal();
    }

   public int getValue() {
        int rank = 0;
        if(this.value==null){
            rank = 0;
        }
        else if (value.ordinal() == 0) {
            rank = 11;
        } else if (value.ordinal() >= 10) {
            rank = 10;
        } else {
            rank = value.ordinal()+1;
        }
        return rank;
    }

    @Override
    public String toString() {
        return "" + value + " of " + suit;
    }

}
