/**
 * SYST 17796 Project Winter 2021 Base code.
 * Students can modify and extend to implement their game.
*@modifier Karan 10-4-2021
*@modifier AsfandYar 10-4-2021
*@modifier Abubaker 10-4-2021
 */
package ca.sheridancollege;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the code 
 * should remember to add themselves as a modifier.
 * @author dancye
 */
public abstract class Card 
{
    //default modifier for child classes
    
    /**
     * Students should implement this method for their specific children classes 
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
    
    @Override
    public abstract String toString();
    
}
