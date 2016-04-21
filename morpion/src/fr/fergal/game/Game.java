package fr.fergal.game;

import fr.fergal.grid.Grid;
import fr.fergal.player.Player;
import io.Input;

import java.util.Scanner;




public class Game {

    // Fields
    private Grid grid;
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    // Controllers
    public Game(){
        this.grid = new Grid();
        this.player1 = new Player(0, 'O');
        this.player2 = new Player(1, 'X');
    }

    // PRIVATE METHODS
    private void swapTurn(){
        if (this.currentPlayer.equals(this.player1))
            this.currentPlayer = this.player2;
        else
            this.currentPlayer = this.player1;
    }

    private int getUserInput(Scanner scan){
        int input = -1;

        while(true){
            System.out.println("Player " + this.currentPlayer.getToken() + " Your turn : ");
            input = Input.readInt(scan);

            if (0 <= input && input <= 8){
                break;
            }

        }
        return input;
    }

    // Methods
    private void printGrid(){
        System.out.flush();
        System.out.println(this.grid);
    }

    public void start(){
        currentPlayer = this.player1;
        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println(this.grid.toString());

            int input = getUserInput(scan);
            this.grid.setCaseToken(input, this.currentPlayer.getToken());
            if (this.grid.getWinner() != null){
                printGrid();
                System.out.println("Player " + this.currentPlayer.getToken() + " won the game!");
                break;
            }else if (this.grid.isFull()){
                printGrid();
                System.out.println("Nobody won the game");
                break;
            }


            swapTurn();
        }
        scan.close();

    }

}
