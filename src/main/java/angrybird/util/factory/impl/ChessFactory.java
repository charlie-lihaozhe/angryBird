package angrybird.util.factory.impl;

import angrybird.util.factory.Game;
import angrybird.util.factory.GameFactory;

public class ChessFactory implements GameFactory {
    public Game getGame() {
        return new Chess();
    }
}
