package strategies;

import entity.Board;
import entity.Moves;
import entity.Player;
import entity.Symbol;

/**
 * BotPlayingStrategy
 */
public interface BotPlayingStrategy {

    Moves makeRandomMoves(Board b, Player player);
}
