package angrybird.util.factory.impl;

import angrybird.util.factory.Game;

public class Chess implements Game {
    private int moves = 0;

    private static final int MOVES = 4;

    public boolean move() {
        System.out.println("Chess move " + moves);
        return ++ moves != MOVES;
    }
}
