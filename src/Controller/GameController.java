package Controller;

import expections.BotCountException;
import expections.PlayerCountDimensionMismatchException;
import expections.SymbolCountException;
import models.Game;
import models.GameState;
import models.Player;
import startegies.winningStrategies.WinningStrategy;

import java.util.List;

public class GameController {
    public Game startGame(int dimension,
                          List<Player> players,
                          WinningStrategy winningStrategy) throws BotCountException, SymbolCountException,  PlayerCountDimensionMismatchException {
        // we will create a game here
        //before creating the object, first we need to validate the values -> Builder
//        game.getbuilder().addplayer().addwiingstrategy();
//        game.addplayer().addplayer().addwinningstrategy();
        return  Game.getBuilder()
                .setDimension(dimension)
                .setPlayers(players)
                .setWinningStrategy(winningStrategy)
                .build();
    }
    public void displayBoard(Game game){
        game.displayBoard();

    }
    public void makeMove(Game game){
        game.makeMove();

    }

    public GameState checkState(Game game){
        return game.getGameState();
    }
    public Player getWinner(Game game){
        return game.getWinner();
    }
    public void undo(Game game){
        game.undo();
    }
}
