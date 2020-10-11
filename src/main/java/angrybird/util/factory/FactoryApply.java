package angrybird.util.factory;

public class FactoryApply {
    public void playGames(GameFactory gameFactory) {
        Game game = gameFactory.getGame();
        game.move();
    }
}
