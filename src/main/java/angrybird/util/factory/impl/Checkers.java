package angrybird.util.factory.impl;

import angrybird.util.factory.Game;

public class Checkers implements Game {
    private int moves = 0;

    private static final int MOVES = 3;

    public boolean move() {
        System.out.println("Checks move " + moves);
        return ++ moves != MOVES;
    }
}
