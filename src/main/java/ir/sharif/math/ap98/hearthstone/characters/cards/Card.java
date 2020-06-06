package ir.sharif.math.ap98.hearthstone.characters.cards;
import ir.sharif.math.ap98.hearthstone.characters.Character;
import ir.sharif.math.ap98.hearthstone.characters.heros.Hero;

public abstract class Card extends Character{

    //// Attributes
    private Type cardType;
    private Hero.Type heroClass;
    private RarityType rarity;
    private int manaCost;
    private String description;
    private int goldCost;

    //// Constructor

    public Card(String Name,Card.Type type, Hero.Type heroClass, RarityType rarity, int manaCost
            , String description, int goldCost) {
        super(Name, Character.Type.Card);
        this.cardType = type;
        this.heroClass = heroClass;
        this.rarity = rarity;
        this.manaCost = manaCost;
        this.description = description;
        this.goldCost = goldCost;
    }

    public Card(){
        super();
    }



    public Hero.Type getHeroClass() {
        return heroClass;
    }

    public void setHeroClass(Hero.Type heroClass) {
        this.heroClass = heroClass;
    }

    public RarityType getRarity() {
        return rarity;
    }

    public void setRarity(RarityType rarity) {
        this.rarity = rarity;
    }

    public int getManaCost() {
        return manaCost;
    }

    public void setManaCost(int manaCost) {
        this.manaCost = manaCost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getGoldCost() {
        return goldCost;
    }

    public void setGoldCost(int goldCost) {
        this.goldCost = goldCost;
    }

    public Type getCardType() {
        return cardType;
    }

    public void setCardType(Type cardType) {
        this.cardType = cardType;
    }

    public enum Type{
        Spell,
        Minion,
        Weapon;
    }

    public enum RarityType{
        Rare,
        Common,
        Free,
        Legendary,
        Epic;
    }
}
