package fr.fergal.grid;

import fr.fergal.player.Player;


public class Token {

    // FIELDS
    private char tokenChar;
    private Player owner;

    // CONSTRUCTORS
    public Token(char c, Player player){
        this.tokenChar = c;
        this.owner = player;
    }

    //GETTERS / SETTERS
    public Player getOwner(){
        return this.owner;
    }

    // METHODS
    @Override
    public String toString() {
        return Character.toString(this.tokenChar);
    }
}
