

package strategies;

import modals.Board;
import modals.Player;

/**
 * HandleMovesStrategies
 */
public interface HandleMovesStrategies {
    public void move(Player p,int value, Board board);
    
}