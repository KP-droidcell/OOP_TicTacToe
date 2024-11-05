import javax.swing.*;
import java.awt.*;

public class Game {
    private char player1;
    private char player2;
    private char currentPlayer;

    public Game()
    {
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = player1;
    }

    private void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }
}