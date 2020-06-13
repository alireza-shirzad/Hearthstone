package ir.sharif.math.ap98.hearthstone.game;

import ir.sharif.math.ap98.hearthstone.game.Passive.Passive;
import ir.sharif.math.ap98.hearthstone.game.decks.SimpleDeck;
import ir.sharif.math.ap98.hearthstone.gui.BackgroundPanel;
import ir.sharif.math.ap98.hearthstone.players.Player;

public class GameState {
    private Player currentPlayer;
    private SimpleDeck currentDeck;
    private SimpleDeck playDeck;
    private Passive passive;

    public void initiatePlayDeck(){
        try {
            playDeck = (SimpleDeck) currentDeck.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    public Passive getPassive() {
        return passive;
    }
    public void setPassive(Passive passive) {
        this.passive = passive;
    }
    public static GameState getGameState() {
        return gameState;
    }
    public static void setGameState(GameState gameState) {
        GameState.gameState = gameState;
    }
    public SimpleDeck getPlayDeck() {
        return playDeck;
    }
    public void setPlayDeck(SimpleDeck playDeck) {
        this.playDeck = playDeck;
    }
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
