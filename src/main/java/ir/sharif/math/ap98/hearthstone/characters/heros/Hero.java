package ir.sharif.math.ap98.hearthstone.characters.heros;
import ir.sharif.math.ap98.hearthstone.characters.Character;
public class Hero extends Character {

    //// Attributes
    private int HP;
    private Hero.Type HeroType;

    //// Constructor
    public Hero(String name, Hero.Type HeroType) {
        super(name, Character.Type.Hero);
        this.HeroType = HeroType;
        this.HP = 30;
    }



    //// Getters and Setters
    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    //// Hero Types
    public enum Type{
        Mage,
        Warlock,
        Rogue,
        Neutral,
        Hunter,
        Priest;
    }
}
