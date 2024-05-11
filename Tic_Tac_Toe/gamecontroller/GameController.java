package gamecontroller;

import java.util.List;
import entity.Game;
import entity.GameStatus;
import entity.Player;
import strategies.gamewinningstrategy.GameWinningStrategy;


public class GameController  {

    public Game createGame(List<Player>players,List<GameWinningStrategy> strategies,int dimensionOfBoard){
        Game game=new Game.Builder()
                            .setDimension(dimensionOfBoard)
                            .addAddWinningStrategies(strategies)
                            .addPlayers(players).build();
        return game;
    }

    public void makeMove(Game game){
        game.makeMove();
    }

    public GameStatus getGameStatus(Game game){
        return game.getStatus();

    }

    public Player getWinner(Game game){
        return game.getWinner();
    }

    public boolean undo(Game game) throws Exception {
        return game.undo();
    }
}
