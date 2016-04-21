package fr.fergal.grid;

import fr.fergal.player.Player;


public class GridCase {

    /* FIELDS */
    public int id;
    private Token content;

    // CONSTRUCTORS
    public GridCase(int caseId){
        this.id = caseId;
        this.content = null;
    }

    public GridCase(int caseId, Token token){
        this.id = caseId;
        this.content = token;
    }

    // GETTERS / SETTERS
    public void setToken(Token token){
        this.content = token;
    }

    public Player getTokenOwner(){
        if (this.content != null)
            return this.content.getOwner();
        else
            return null;
    }

    // METHODS
    public boolean isEmpty(){
        return this.content == null;
    }


    @Override
    public String toString(){
        if (this.content != null)
            return this.content.toString();
        else
            return Integer.toString(this.id);
    }
}
