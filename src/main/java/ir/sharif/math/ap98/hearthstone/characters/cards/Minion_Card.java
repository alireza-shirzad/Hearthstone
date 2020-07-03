package ir.sharif.math.ap98.hearthstone.characters.cards;
import ir.sharif.math.ap98.hearthstone.characters.Character;
import ir.sharif.math.ap98.hearthstone.characters.cards.Card;
import ir.sharif.math.ap98.hearthstone.characters.heros.Hero;


public class Minion_Card extends Card {

    private int attack;
    private int health;
    private Type subtype;
    public Minion_Card(String Name, Hero.Type heroClass, Card.RarityType rarity, int manaCost,
                       String description, int goldCost, int attack, int health, Type subtype) {
        super(Name, Card.Type.Minion, heroClass, rarity, manaCost, description,goldCost);
        this.attack = attack;
        this.health = health;
        this.subtype = subtype;
    }


    public void attack(Hero hero){
        hero.setHP(hero.getHP()-attack);
    }

    public void attack(Minion_Card minion_card){
        minion_card.setHealth(minion_card.getHealth()-attack);
    }

    public void attack(Weapon_Card weapon_card){
        weapon_card.setDurability(weapon_card.getDurability()-attack);
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Type getSubtype() {
        return subtype;
    }

    public void setSubtype(Type subtype) {
        this.subtype = subtype;
    }

    public enum Type{
        Beast,
        Murlock,
        Dragon,
        Mech,
        Demon;
    }
}




