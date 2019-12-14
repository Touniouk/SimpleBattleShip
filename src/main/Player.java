package main;

public abstract class Player {
    private Board board;
    private String name;

    public abstract void generateShipPlacement();

    public void printBoard() {
        StringBuilder builder = new StringBuilder();
        builder.append(name + "'s board:\n").append("  | A | B | C | D | E | F | G | H | I | J\n");
    }

    public abstract void play();

    public abstract boolean hasWon();
}
