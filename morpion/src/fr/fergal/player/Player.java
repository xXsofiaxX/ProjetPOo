package fr.fergal.player;

import fr.fergal.grid.Token;


public class Player {
    // FIELDS
    private int id;
    private Token token;

    // CONSTRUCTOR
    public Player(int playerId, char c){
        this.id = playerId;
        this.token = new Token(c, this);
    }

    // GETTERS / SETTERS
    public Token getToken(){
        return this.token;
    }

    // METHODS
    @Override
    public boolean equals(Object other){
        if (other == null) {
            return false;
        }
        if (other instanceof Player){
            Player player = (Player)other;

            return player.id == this.id;
        }else
            return false;
    }

}
