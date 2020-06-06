package ir.sharif.math.ap98.hearthstone.game.decks;

import ir.sharif.math.ap98.hearthstone.characters.cards.Card;
import ir.sharif.math.ap98.hearthstone.characters.cards.CardFactory;
import ir.sharif.math.ap98.hearthstone.characters.heros.Hero;

public class SimpleDeck extends Deck {

    public static final int DeckCapacity = 20;
    public static final int DeckLimit = 2;
    private Hero.Type HeroType;
    protected String Name;
    private int NumOfGames;
    private int NumOfWins;
    //// Constructor
    public SimpleDeck(Hero.Type heroType, String name) {
        super();
        HeroType = heroType;
        Name = name;
    }

    //// Add and Remove Methods of Deck
    public Result Add(Card card){
        if (getNumOfTotallCards()==DeckCapacity) return Result.Error_DeckFull;
        else if (getNumOfThisCard(card)== DeckLimit) return Result.Error_DeckLimit;
        else if (card.getHeroClass()!= Hero.Type.Neutral && card.getHeroClass()!=this.getHeroType()) return Result.Error_HeroNotMatch;
        else {
            Cards.add(card);
            return Result.Sucess;
        }
    }
    public Result Remove(Card card){
        if (getNumOfTotallCards()==0) return Result.Error_DeckEmpty;
        else{
            Cards.remove(card);
            return Result.Sucess;
        }
    }




    //// Getters and Setters


    public static int getDeckCapacity() {
        return DeckCapacity;
    }

    public static int getDeckLimit() {
        return DeckLimit;
    }

    public Hero.Type getHeroType() {
        return HeroType;
    }

    public void setHeroType(Hero.Type heroType) {
        HeroType = heroType;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getNumOfGames() {
        return NumOfGames;
    }

    public void setNumOfGames(int numOfGames) {
        NumOfGames = numOfGames;
    }

    public int getNumOfWins() {
        return NumOfWins;
    }

    public void setNumOfWins(int numOfWins) {
        NumOfWins = numOfWins;
    }

    public int getWinPercentage(){
        return (NumOfWins/NumOfGames);
    }

    public static SimpleDeck GetDefault(Hero.Type type){
        switch (type){
            case Mage:
                SimpleDeck mageDeck = new SimpleDeck(Hero.Type.Mage,"Mage Default");
                mageDeck.Add(CardFactory.getInstance().make("Polymorph"));
                mageDeck.Add(CardFactory.getInstance().make("Fireball"));
                return mageDeck;
            case Rogue:
                SimpleDeck rogueDeck = new SimpleDeck(Hero.Type.Rogue,"Rogue Default");
                rogueDeck.Add(CardFactory.getInstance().make("Friendly Smith"));
                rogueDeck.Add(CardFactory.getInstance().make("Sprint"));
                return rogueDeck;
            case Warlock:
                SimpleDeck warlockDeck = new SimpleDeck(Hero.Type.Warlock,"Warlock Default");
                warlockDeck.Add(CardFactory.getInstance().make("Dreadscale"));
                warlockDeck.Add(CardFactory.getInstance().make("Blood Fury"));
                return warlockDeck;
            case Hunter:
                SimpleDeck hunterDeck = new SimpleDeck(Hero.Type.Hunter,"Hunter Default");
                hunterDeck.Add(CardFactory.getInstance().make("Swamp King Dred"));
                hunterDeck.Add(CardFactory.getInstance().make("Deadly Shot"));
                return hunterDeck;
            case Priest:
                SimpleDeck priestDeck = new SimpleDeck(Hero.Type.Priest,"Priest Default");
                priestDeck.Add(CardFactory.getInstance().make("Radiance"));
                priestDeck.Add(CardFactory.getInstance().make("High Priest Amet"));
                return priestDeck;
            default:
                return null;
        }
    }

}
