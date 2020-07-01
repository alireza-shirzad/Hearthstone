package ir.sharif.math.ap98.hearthstone.game;

import ir.sharif.math.ap98.hearthstone.characters.cards.Card;
import ir.sharif.math.ap98.hearthstone.characters.heros.Hero;
import ir.sharif.math.ap98.hearthstone.game.Passive.Passive;
import ir.sharif.math.ap98.hearthstone.game.decks.SimpleDeck;
import ir.sharif.math.ap98.hearthstone.gui.panels.Play.PlayRefrences;
import ir.sharif.math.ap98.hearthstone.players.Player;

import java.util.ArrayList;
import java.util.Random;

public class GameEntity {
    private Player player;
    private MatchState.EntityType type;
    private Hand hand;
    private ArrayList<Card> middleCards;
    private Hero hero;
    private SimpleDeck deck;
    private Passive passive;
    private int numOfMana;
    private int numOfTurn;

    public GameEntity(Player player, Hand hand, SimpleDeck deck, Hero hero, MatchState.EntityType type) {
        this.player = player;
        this.hand = hand;
        this.deck = deck;
        this.hero = hero;
        this.type = type;
        this.numOfTurn = 1;
        this.numOfMana = 1;
        middleCards = new ArrayList<>();
    }
    public GameEntity(Player player, Hand hand, SimpleDeck deck, Passive passive, Hero hero, MatchState.EntityType type) {
        this(player, hand, deck, hero, type);
        this.passive = passive;
    }
    public void drawCard(){
        if(deck.getCards().size()>0) {
            Random random = new Random(System.nanoTime());
            int ind = random.nextInt(deck.getCards().size());
            Card card = deck.getCards().get(ind);
            hand.add(card);
            deck.Remove(card);
        }
    }

    public PlayCardResult playCard(Card card){
        if(card.getManaCost()>numOfMana){
            return PlayCardResult.ERROR_NOMANA;
        } else if(card.getCardType()== Card.Type.Minion & middleCards.size()>=7){
            return PlayCardResult.ERROR_FULLMIDDLE;
        }else {
            middleCards.add(card);
            hand.remove(card);
            numOfMana = getNumOfMana() - card.getManaCost();
            if(card.getCardType()== Card.Type.Minion){
                PlayRefrences.getPlayPanel().getDrawer().drawCardsPanel();
            }
            return PlayCardResult.SUCCESS;
        }
    }

    public enum PlayCardResult{
        SUCCESS,
        ERROR_NOMANA,
        ERROR_FULLMIDDLE;
    }

    public void nextTurn(){
        numOfTurn++;
        setNumOfMana(numOfTurn);
        drawCard();
    }

    public int getNumOfTurn() {
        return numOfTurn;
    }
    public void setNumOfTurn(int numOfTurn) {
        this.numOfTurn = numOfTurn;
    }
    public ArrayList<Card> getMiddleCards() {
        return middleCards;
    }
    public void setMiddleCards(ArrayList<Card> middleCards) {
        this.middleCards = middleCards;
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
    public int getNumOfMana() {
        return numOfMana;
    }
    public void setNumOfMana(int numOfMana) {
        if (numOfMana<=10) this.numOfMana = numOfMana;
    }

}
