import java.util.List;

import entity.Bot;
import entity.BotDifficulty;
import entity.Game;
import entity.GameStatus;
import gamecontroller.GameController;
import strategies.gamewinningstrategy.GameWinningStrategy;
import strategies.gamewinningstrategy.RegularWinningStrategy;
import entity.Symbol;
import entity.HumanPlayer;
import entity.Player;
public class Main {
    public static void main(String[] args) {
        GameController controller=new GameController();
        Player HumanPlayer=new HumanPlayer(new Symbol('x'));
        Player botPlayer=new Bot(new Symbol('O'),BotDifficulty.HARD);
        GameWinningStrategy strategy=new RegularWinningStrategy();
        Game game=controller.createGame(List.of(HumanPlayer,botPlayer), List.of(strategy), 3);
        System.out.println("status is "+game.getStatus());
        while(!controller.getGameStatus(game).equals(GameStatus.FINISH)){
            game.makeMove();

        }
    
        
    }
}
