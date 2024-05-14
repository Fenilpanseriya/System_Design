// Requirements
// 1. game btw >=2 player
// 2.only human players allow
// 3. size of board is variable(1 to n)
// 4. position of snaks and ladders are rendomly generated at the start of game
// 5. check for all snaks and ladders position whether it is valid or not(i.e. snack not start with position 1 and snack not start with last position of board(winning position) etc...)
// 6. Dice have 1 to x number , x will be decided at game start time
// 7. size of the sancks and ladders are rendom
// 8.in future different board entity like frog etc.. also come
// 9. player start game after getting 1 or 6 , there should other strategies as well in future
// 10.give another chance when maximum dice number come
// 11. undo moves
// 12. to wi the game winner should reach exactly last position of the board
// 13. maintain leaderboard rankings



import controler.GameController;
import modals.Button;
import modals.Game;
import modals.GameStatus;
import modals.Player;
import strategies.RegularMoveStrategy;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Player p1=new Player();
        Player p2=new Player();
        Game g=new Game.Builder().setMaxButtonPerPlayer(1).addPlayers(List.of(p1,p2)).setDimension(20).setMoveStrategy(new RegularMoveStrategy()).setMaxDiceNumber(6).build();
        GameController controller=new GameController();
        while(g.getGameStatus()!= GameStatus.FINISH){
            controller.makeMove(g);
        }

    }
}
