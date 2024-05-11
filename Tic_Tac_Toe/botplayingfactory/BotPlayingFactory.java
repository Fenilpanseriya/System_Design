package botplayingfactory;

import entity.BotDifficulty;
import strategies.BotPlayingStrategy;
import strategies.RandomMoveStrategy;

public class BotPlayingFactory {
    public BotPlayingStrategy createBotPlayingFactory(BotDifficulty botDifficulty){
        return new RandomMoveStrategy();
    }
}
