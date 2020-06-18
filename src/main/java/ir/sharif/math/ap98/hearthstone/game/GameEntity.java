package ir.sharif.math.ap98.hearthstone.game;

import ir.sharif.math.ap98.hearthstone.characters.heros.Hero;
import ir.sharif.math.ap98.hearthstone.game.Passive.Passive;
import ir.sharif.math.ap98.hearthstone.game.decks.SimpleDeck;
import ir.sharif.math.ap98.hearthstone.players.Player;

public class GameEntity {
    private Player player;
    private Hand hand;
    private Hero hero;
    private SimpleDeck deck;
    private Passive passive;
    public GameEntity(Player player, Hand hand, SimpleDeck deck, Hero hero) {
        this.player = player;
        this.hand = hand;
        this.deck = deck;
        this.hero = hero;
    }
    public GameEntity(Player player, Hand hand, SimpleDeck deck, Passive passive, Hero hero) {
        this(player, hand, deck, hero);
        this.passive = passive;
    }

    public Hero getHero() {
        return hero;
    }
    public void setHero(Hero hero) {
        this.hero = hero;
    }
    public Player getPlayer() {
        return player;
    }
    public void setPlayer(Player player) {
        this.player = player;
    }
    public Hand getHand() {
        return hand;
    }
    public void setHand(Hand hand) {
        this.hand = hand;
    }
    public SimpleDeck getDeck() {
        return deck;
    }
    public void setDeck(SimpleDeck deck) {
        this.deck = deck;
    }
    public Passive getPassive() {
        return passive;
    }
    public void setPassive(Passive passive) {
        this.passive = passive;
    }
}
