package entity;
import java.util.*;

import strategies.gamewinningstrategy.GameWinningStrategy;

public class Game extends Exception{
    private List<GameWinningStrategy> strategies;
    private List<Moves>moves;
    private List<Player>players;
    private Board board;
    private Player winner;
    private GameStatus status=GameStatus.IN_PROGRESS;
    private int lastMoovedIndex;

    private Game(){
        this.strategies=new ArrayList<>();
        this.moves=new ArrayList<>();
        this.players=new ArrayList<>();
        this.lastMoovedIndex=-1;

    }
    public GameStatus getStatus() {
        return status;
    }
    public Player getWinner() {
        return winner;
    }

    public static Builder create(){
        return new Game.Builder();
    }
    

    public void makeMove(){

        if(this.moves.size()==this.board.getDimension()*this.board.getDimension()){
            System.out.println("game is draw");
            return;
        }

        this.lastMoovedIndex++;
        this.lastMoovedIndex=(this.lastMoovedIndex)%(this.players.size());
        System.out.println("player is "+this.players.get(lastMoovedIndex));
        Moves move= this.players.get(lastMoovedIndex).makeNextMove(this.board);
        System.out.println("move----> "+move);
        this.moves.add(move);
        move.getCell().setSymbol(move.getSymbol());

        for(GameWinningStrategy gameWinningStrategy:strategies){
            boolean winningStatus=gameWinningStrategy.checkIfWon(this.board, this.players.get(lastMoovedIndex));
            if(winningStatus){
                this.status=GameStatus.FINISH;
                this.winner=this.players.get(lastMoovedIndex);
                break;
            }
        }

    }
    public void display(){
        for(List<Cell>cell:this.board.getBoard()){
            for(Cell c:cell){
                System.out.print(c.getSymbol()+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public boolean undo() throws Exception{

        if(this.moves.size()==0){
            throw new Exception("moves size is 0");
        }
        Moves lastMove=this.moves.get(lastMoovedIndex);
        this.lastMoovedIndex-=1;
        this.lastMoovedIndex=(this.lastMoovedIndex + this.players.size())%this.players.size();
        this.moves.remove(lastMove);
        return true;
    }

    public static class Builder{
        private List<GameWinningStrategy> strategies=new ArrayList<>();
        private List<Player>players=new ArrayList<>();
        private int dimension;

        public Builder addPlayers(List<Player>p){
            for (Player player : p) {
                players.add(player);
            }
            return this;
        }

        public Builder addAddWinningStrategies(List<GameWinningStrategy> gameWinningStrategies){
            for (GameWinningStrategy strategy :gameWinningStrategies ) {
                strategies.add(strategy);
            }
            return this;
        }

        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            System.out.println(this.dimension+"|||");
            return this;
        }


        public Game build(){
            int cnt=0;
            for(Player p:this.players){
                if(p.getPlayerType()==PlayesType.BOT){
                    cnt++;
                }
            }
            if(cnt>1){
                System.out.println("thare should be no multiple bot, limit is 1 for bot");
                return null;
            }

            Game game=new Game();
            game.players.addAll(this.players);
            game.strategies.addAll(this.strategies);
            game.board=new Board(this.dimension);

            System.out.println("game "+game.board);
            return game;
        }
        

    }
}