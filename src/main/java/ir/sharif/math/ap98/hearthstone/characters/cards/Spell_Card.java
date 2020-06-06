package ir.sharif.math.ap98.hearthstone.characters.cards;
import ir.sharif.math.ap98.hearthstone.characters.heros.Hero;

public class Spell_Card extends Card {

    public Spell_Card(String Name, Hero.Type heroClass,
                      RarityType rarity, int manaCost, String description, int goldCost) {
    super(Name, Type.Spell, heroClass, rarity, manaCost, description, goldCost);
    }
}
