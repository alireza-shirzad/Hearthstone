package ir.sharif.math.ap98.hearthstone.players;

import ir.sharif.math.ap98.hearthstone.characters.cards.Card;
import ir.sharif.math.ap98.hearthstone.characters.heros.Hero;
import ir.sharif.math.ap98.hearthstone.game.decks.SimpleDeck;
import ir.sharif.math.ap98.hearthstone.game.decks.SpareDeck;

import java.util.ArrayList;


public class Player implements Cloneable {
    public String username;
    public String passwordHash;
    public int gold;
    public ArrayList<SimpleDeck> simpleDecks;
    public SpareDeck spareDeck;

    //default constructor
    public Player()
    {
        super();
    }
    public Player(String username, String passwordHash) {
        this.username = username;
        this.passwordHash = passwordHash;
        this.gold = 50;
        this.simpleDecks = new ArrayList<>();
        simpleDecks.add(SimpleDeck.GetDefault(Hero.Type.Mage));
        simpleDecks.add(SimpleDeck.GetDefault(Hero.Type.Rogue));
        simpleDecks.add(SimpleDeck.GetDefault(Hero.Type.Warlock));
        simpleDecks.add(SimpleDeck.GetDefault(Hero.Type.Hunter));
        simpleDecks.add(SimpleDeck.GetDefault(Hero.Type.Priest));
        this.spareDeck = SpareDeck.GetDefault();
    }


    //// Getters and Setters
    public String getId(){return getPasswordHash().substring(0,4);}
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPasswordHash() {
        return passwordHash;
    }
    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }
    public int getGold() {
        return gold;
    }
    public void setGold(int gold) {
        this.gold = gold;
    }
    public ArrayList<SimpleDeck> getSimpleDecks() {
        return simpleDecks;
    }
    public void setSimpleDecks(ArrayList<SimpleDeck> simpleDecks) {
        this.simpleDecks = simpleDecks;
    }
    public SpareDeck getSpareDeck() {
        return spareDeck;
    }
    public void setSpareDeck(SpareDeck spareDeck) {
        this.spareDeck = spareDeck;
    }
    public ArrayList<Card> getAllCards(){
        ArrayList<Card> totallCards = new ArrayList<>();
        for (SimpleDeck simpleDeck : simpleDecks) {
            totallCards.addAll(simpleDeck.getCards());
        }
        totallCards.addAll(spareDeck.getCards());
        return totallCards;
    }
    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }

}
