package ir.sharif.math.ap98.hearthstone.characters.cards;
import ir.sharif.math.ap98.hearthstone.characters.cards.Card;
import ir.sharif.math.ap98.hearthstone.characters.heros.Hero;

public class Weapon_Card extends Card {
    private int attack;
    private int durability;

    public Weapon_Card(String Name, Hero.Type heroClass, Card.RarityType rarity, int manaCost
            , String description, int goldCost, int attack, int durability) {
        super(Name, Type.Weapon, heroClass, rarity, manaCost, description, goldCost);
        this.attack = attack;
        this.durability = durability;
    }
    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }
}
