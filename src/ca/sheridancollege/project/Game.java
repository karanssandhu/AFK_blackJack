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
 * The class that models your game. You should create a more specific child of
 * this class and instantiate the methods given.
 *
 * @author dancye
 */
public abstract class Game {

    private final String gameName;//the title of the game

    public Game(String givenName) {
        gameName = givenName;
    }

    /**
     * @return the gameName
     */
    public String getGameName() {
        return gameName;
    }

    /**
     * Play the game. This might be one method or many method calls depending on
     * your game.
     */
    public abstract void play();

    /**
     * When the game is over, use this method to declare and display a winning
     * player.
     */
    public abstract void declareWinner();

}//end class