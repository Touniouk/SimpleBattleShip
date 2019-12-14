package main;

public class Board {
    private char[][] tiles;

    public Board() {
        tiles = new char[10][10];
        for (int i = 0; i < tiles.length; i++) tiles[i] = new char[] {' ',' ',' ',' ',' ',' ',' ',' ',' ',' '};
    }

    public char[][] getTiles() {
        return tiles;
    }

    public char getTile(String tileNumber) {
        char[] arr = tiles[tileNumber.toUpperCase().charAt(0)-65];
        return arr[Character.getNumericValue(tileNumber.charAt(1))];
    }
}
