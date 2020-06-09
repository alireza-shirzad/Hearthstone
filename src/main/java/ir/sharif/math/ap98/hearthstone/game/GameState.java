package ir.sharif.math.ap98.hearthstone.game;

import ir.sharif.math.ap98.hearthstone.game.decks.SimpleDeck;
import ir.sharif.math.ap98.hearthstone.gui.BackgroundPanel;
import ir.sharif.math.ap98.hearthstone.players.Player;

public class GameState {
    private Player currentPlayer;
    private SimpleDeck currentDeck;

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public SimpleDeck getCurrentDeck() {
        return currentDeck;
    }

    public void setCurrentDeck(SimpleDeck currentDeck) {
        this.currentDeck = currentDeck;
    }


    //// Singletone Design
    private static GameState gameState;
    public static GameState getInstance() {
        if(gameState==null) {gameState =  new GameState();}
        return gameState;
    }
}
