package main;

import java.util.List;

public class BattleshipGame {

    private boolean finished;
    private int turnCounter;
    private int playerGo;
    private List<Player> players;

    public static void main(String... args) {
    }

    public BattleshipGame() {
        // Initialise game
        finished =false;
        turnCounter = 0;
        playerGo = 0;
        // Create two players
        // Start game
    }

    public void playTurn() {
        turnCounter++;
        while (!finished) {
            for (Player player : players) {
                player.play();
                if (player.hasWon()) {
                    finished = true;
                    break;
                }
            }
        }
    }
}
