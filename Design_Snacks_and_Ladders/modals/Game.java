

package modals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import strategies.HandleMovesStrategies;

/**
 * Game
 */
public class Game {
    private Board board;
    private Dice dice;
    private List<Player>players;
    private HandleMovesStrategies moveStrategy;
    private GameStatus gameStatus;
    private List<Player> rankings;
    private int maxButtonPerPlayer;
    private int lastPlayerIndex=-1;

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void makeMove(){
        int diceNumber=dice.roll();
        System.out.println("dice number is "+diceNumber);
        lastPlayerIndex++;
        lastPlayerIndex=lastPlayerIndex%this.players.size();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter which button you want to move ahead ");
        int buttonNumber=sc.nextInt();

        Button button=players.get(lastPlayerIndex).getButtons(buttonNumber);
        System.out.println("button is "+players.get(lastPlayerIndex).getButtons(buttonNumber));
        System.out.println(players.get(lastPlayerIndex).getAllButtons());
        if(diceNumber != dice.getMaxNumber() &&  players.get(lastPlayerIndex).getButtons(buttonNumber).getStatus()==ButtonStatus.LOCKED){
            System.out.println("you can not move. to move buutton "+buttonNumber+" you need dice number "+dice.getMaxNumber());
        }
        if(diceNumber == dice.getMaxNumber() ){

            if(button.getStatus()==ButtonStatus.LOCKED){
                button.setStatus(ButtonStatus.UNLOCKED);
                button.setPosition(1);
            }
            else{
                int nextPos=players.get(lastPlayerIndex).getButtons(buttonNumber).getPosition() + diceNumber;
                if(nextPos== board.getDimension()){
                  gameStatus=GameStatus.FINISH;
                }
                if(board.getMap().containsKey(nextPos)){
                    int newPos=board.getMap().get(nextPos).getEndPos();
                    button.setPosition(newPos);
                }
                button.setPosition(nextPos);
            }

            makeMove();
        }
        else{
            int nextPos=players.get(lastPlayerIndex).getButtons(buttonNumber).getPosition() + diceNumber;
            if(board.getMap().containsKey(nextPos)){
                int newPos=board.getMap().get(nextPos).endPos;
                button.setPosition(newPos);
            }
            
            button.setPosition(nextPos);
            if(nextPos== board.getDimension()){
                gameStatus=GameStatus.FINISH;
              }
        }
        
    }
    
    public static class  Builder {
        private List<Player>players;
        private HandleMovesStrategies moveStrategy;
        private int maxButtonPerPlayer;
        private int dimension;
        private int maxDiceNumber;

        public Builder addPlayers(List<Player>p){
            this.players=new ArrayList<>();
            players.addAll(p);
            for(int i=0;i<this.players.size();i++){
                int count=this.maxButtonPerPlayer;
                int initialButtonNumber=1;
                Player player=players.get(i);
                while(count>0){
                    System.out.println("in loop");
                    Button b=new Button();
                    player.setButtons(initialButtonNumber, b);
                    initialButtonNumber++;
                    count--;
                }
                System.out.print("\n");
                
            }
            return this;
        }
        public Builder setMoveStrategy(HandleMovesStrategies strategy){
            this.moveStrategy=strategy;
            return this;
        }
        public Builder setMaxButtonPerPlayer(int maxButtonPerPlayer){
            this.maxButtonPerPlayer=maxButtonPerPlayer;
            return this;
        }
        public Builder setDimension(int dimension){
            this.dimension=dimension;
            return this;
        }
        public Builder setMaxDiceNumber(int maxDiceNum){
            this.maxDiceNumber=maxDiceNum;
            return this;
        }


        public Game build(){
            Game game=new Game();
            game.board=new Board(dimension);
            Snack s=new Snack();
            Ladders l=new Ladders();
            game.board.setEntityMap(1,l);
            game.board.setEntityMap(2,s);
            game.dice=new Dice(maxDiceNumber);
            game.players=this.players;
            game.moveStrategy=this.moveStrategy;
            game.maxButtonPerPlayer=this.maxButtonPerPlayer;
            game.gameStatus=GameStatus.CREATING;
            game.rankings=new ArrayList<>();
            return game;

        }
    }
    
}