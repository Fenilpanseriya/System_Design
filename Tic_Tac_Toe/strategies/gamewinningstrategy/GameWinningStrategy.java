package strategies.gamewinningstrategy;

import entity.Board;
import entity.Cell;
import entity.Player;

public interface GameWinningStrategy {
    boolean checkIfWon(Board b,Player p);
}
