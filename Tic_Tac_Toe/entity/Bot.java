package entity;

import botplayingfactory.BotPlayingFactory;
import strategies.BotPlayingStrategy;

public class Bot extends Player{

    BotDifficulty difficulty;
    BotPlayingStrategy botStrategy;

    public Bot(Symbol s,BotDifficulty b){
        super(PlayesType.BOT,s);
        this.difficulty=b;
        this.botStrategy=new BotPlayingFactory().createBotPlayingFactory(difficulty);
    }

    public Moves makeNextMove(Board board){
        return botStrategy.makeRandomMoves(board, this);
    }
    
    
}
