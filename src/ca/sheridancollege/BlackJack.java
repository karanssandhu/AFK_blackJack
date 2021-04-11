//@author Karan 10-4-2021
//@author AsfandYar 10-4-2021
//@author Abubaker 10-4-2021
package ca.sheridancollege;

import java.util.ArrayList;
import java.util.Random;
import java.util.*;

public class BlackJack extends Game {

    public static void main(String[] args) {
        BlackJack app = new BlackJack("BlackJack");
        app.play();
    }

    public BlackJack(String givenName) {
        super("BlackJack");
    }

    @Override
    public void play() {
        Output output = new Output();
        Input input = new Input(output);
        output.askName();
        output.greeting(input.getName());
        output.askCash();
        User user = new User();
        Dealer dealer = new Dealer();
        user.setCash(input.getCash());
        while (user.getCash() > 0) {
            GroupOfCards deck = new GroupOfCards(52);

            deck.shuffle();
            user.getNewHand(deck);
            dealer.getNewHand(deck);

            output.showCash(user.getCash());
            output.askBet();

            user.setBet(input.getBet(user.getCash()));
            user.setCash(user.getCash());

            output.showCash(user.getCash());
            output.showBet(user.getBet());
            output.showHand(user);
            output.showDealerFirstCard(dealer);
            System.out.println("Your Hand Value is:"+user.getHand(1).getHandValue());
            if (dealer.getHand(1).getCard(1).getValue() == 1) {
                output.insurance();
                if (input.choiceIsYes()) {
                    if (dealer.hasBlackJack(1)) {
                        output.winInsurance();
                        user.win();
                        output.showCash(user.getCash());
                    } else {
                        output.loseInsurance();
                        output.showCash(user.getCash());
                    }
                }
            }
            if (user.hasBlackJack(1) && dealer.hasBlackJack(1)) {
                output.userBlackJack();
                output.dealerBlackJack();
                output.push();
                user.push();
            } else if (user.hasBlackJack(1)) {
                user.blackJack();
                output.userBlackJack();
                output.showDealerHand(dealer);
                output.win();
            } else if (dealer.hasBlackJack(1)) {
                output.dealerBlackJack();
                output.showDealerHand(dealer);
                output.lose();
            } else {
                if (2 * user.getBet() < user.getCash()) {
                    output.askDoubleDown();
                    if (input.choiceIsYes()) {
                        user.doubleDown();
                        output.showCash(user.getCash());
                        output.showBet(user.getBet());
                    }
                }
                output.hitOrStand();
                while (input.choiceisHit()) {
                    user.getHand(1).Hit(deck);
                    output.showHand(user);
                    System.out.println(user.getHand(1).getHandValue());
                    output.hitOrStand();
                    if (user.hasBusted()) {
                        output.busted();
                        output.lose();
                        break;
                    }
                    if (user.hasFiveCardTrick(1)) {
                        output.hasFiveCardTrick();
                        output.win();
                        user.win();
                        break;
                    }
                }
                if (!user.hasBusted()) {
                    System.out.println(dealer.takeTurn(deck));
                    output.showDealerHand(dealer);
                    if (dealer.hasBusted()) {
                        output.dealerBusted();
                        System.out.println("Dealer hand value was"+dealer.getHand(1).getHandValue());
                        output.win();
                        user.win();
                    } else {
                        if ((21 - user.getHand(1).getHandValue()) < (21 - dealer
                                .getHand(1).getHandValue())) {
                            output.win();
                            user.win();
                            System.out.println("Your Hand Value is:"+user.getHand(1).getHandValue());
                        }
                        if ((21 - user.getHand(1).getHandValue()) == (21 - dealer
                                .getHand(1).getHandValue())) {
                            output.push();
                            user.push();
                            System.out.println("Your Hand Value is:"+user.getHand(1).getHandValue());
                        }
                        if ((21 - user.getHand(1).getHandValue()) > (21 - dealer
                                .getHand(1).getHandValue())) {
                            output.lose();
                            System.out.println("Your Hand Value is:"+user.getHand(1).getHandValue());
                        }
                    }
                }
            }
            output.showCash(user.getCash());
            output.playAgain();
            if (!input.choiceIsYes()) {
                break;
            }

        }
        if (user.getCash() == 0) {
            output.cashTotalZero(user.getCash());
        }
        output.cashTotal(user.getCash());
    }

    @Override
    public void declareWinner() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public class Output {

        Output() {
        }

        public void askName() {
            System.out.println("Hi! What is your name?");
        }

        public void greeting(String name) {
            System.out.println("Hello, " + name + ", let's play some Blackjack!");
        }

        public void askCash() {
            System.out.println("How much cash do you want to start with?");
        }

        public void tellCashStart(int cash) {
            System.out.println("You start with cash: " + cash);
        }

        public void showCash(int cash) {
            System.out.println("Cash: " + cash);
        }

        public void cannotBet() {
            System.out.println("You cannot bet more money than you have!");
        }

        public void askBet() {
            System.out.println("How much do you wish to bet?");
        }

        public void showBet(int bet) {
            System.out.println("Money on the table: " + bet);
        }

        public void showHand(User user) {
            System.out.println("Here is your hand: ");
            System.out.println(user.getHand(1));
        }

        public void showDealerFirstCard(Dealer dealer) {
            System.out.println("The dealer is showing:");
            Hand hand = dealer.getHand(1);
            System.out.println(hand.getCard(1));
        }

        public void showDealerHand(Dealer dealer) {
            System.out.println("Here is the dealer's hand:");
            System.out.println(dealer.getHand(1));
        }

        public void askDoubleDown() {
            System.out.println("Would you like to double down?(yes/no)");
        }

        public void yesOrNo() {
            System.out.println("Please answer yes or no.");
        }

        public void hasDoubledDown() {
            System.out.println("You have opted to double down!");
        }

        public void insurance() {
            System.out.println("The dealer is showing ace! Would you like insurance?");
        }

        public void hasInsurance() {
            System.out.println("You have opted for insurance!");
        }

        public void split() {
            System.out.println("You have two of the same card- would you like to split?");
        }

        public void hasSplit() {
            System.out.println("You have opted to split!");
        }

        public void splitHands(User user) {
            System.out.println("Here are your hands:");
            System.out.println(user.getHand(1));
            System.out.println(user.getHand(2));
        }

        public void dealerBlackJack() {
            System.out.println("The dealer has Blackjack!");
        }

        public void userBlackJack() {
            System.out.println("You have BlackJack!");
            System.out.println("You win 2x your money back!");
        }

        public void win() {
            System.out.println("Congratulations, you win!");
        }

        public void lose() {
            System.out.println("Sorry, you lose!");
        }

        public void push() {
            System.out.println("It's a push!");
            System.out.println("You get your money back.");
        }

        public void hitOrStand() {
            System.out.println("Would you like to hit or stand?(hit/stand)");
        }

        public void enterHitorStand() {
            System.out.println("Please enter hit or stand.");
        }

        public void playAgain() {
            System.out.println("Would you like to play again?(yes/no)");
        }

        public void cashTotal(int cash) {
            System.out.println("Your cash total is: " + cash);
            System.out.println("Enjoy your winnings!");
        }

        public void cashTotalZero(int cash) {
            System.out.println("Your total cash is: " + cash);
            System.out.println("You ran out of cash!");
        }

        public void hasFiveCardTrick() {
            System.out.println("You have a five card trick!");
        }

        public void winInsurance() {
            System.out.println("The dealer does have Blackjack!");
            System.out.println("You have won your insurance.");
        }

        public void loseInsurance() {
            System.out.println("Sorry, the dealer does not have Blackjack.");
            System.out.println("You have lost your insurance");
        }

        public void busted() {
            System.out.println("You busted!");
        }

        public void dealerBusted() {
            System.out.println("The dealer busted!");
        }
    }

    public class Input {

        private Output outputter;

        Input(Output outputs) {
           outputter = outputs;
        }

        public String getName() {
            Scanner scan = new Scanner(System.in);
            String name = scan.nextLine();
            return name;
        }

        public int getCash() {
            Scanner money = new Scanner(System.in);
            int cash = money.nextInt();
            return cash;
        }

        public int getBet(int cash) {
            Scanner sc = new Scanner(System.in);
            int bet = sc.nextInt();
            while (bet > cash) {
                outputter.cannotBet();
                outputter.askBet();
                bet = sc.nextInt();
            }
            return bet;
        }

        public boolean choiceIsYes() {
            Scanner doubledown = new Scanner(System.in);
            String doubled = doubledown.nextLine();
            while (!isyesorno(doubled)) {
                outputter.yesOrNo();
                doubled = doubledown.nextLine();
            }
            return doubled.equals("yes");
        }

        public boolean isyesorno(String answer) {
            return (answer.equals("yes") || answer.equals("no"));
        }

        public boolean choiceisHit() {
            Scanner hitter = new Scanner(System.in);
            String hit = hitter.nextLine();
            while (!ishitorstand(hit)) {
                outputter.yesOrNo();
                hit = hitter.nextLine();
            }
            return hit.equals("hit");
        }

        public boolean ishitorstand(String hit) {
            return (hit.equals("hit") || hit.equals("stand"));
        }

    }

}
