package factories;

import models.BotDifficultyLevel;
import startegies.botStrategies.BotPlayingStrategy;
import startegies.botStrategies.EasyBotPlayingStrategy;

public class BotPlayingStrategyFactory  {

    public static BotPlayingStrategy getStrategy(BotDifficultyLevel difficultyLevel){
        if(difficultyLevel == BotDifficultyLevel.EASY){
            return new EasyBotPlayingStrategy();
        }
        return new EasyBotPlayingStrategy();
    }
}
