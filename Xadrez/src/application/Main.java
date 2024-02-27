package application;

import chess.ChassMatch;

public class Main {
    public static void main(String[] args) {

        ChassMatch chessmatch = new ChassMatch();
        UI.printBoard(chessmatch.getpieces());

    }
}