package ir.sharif.math.ap98.hearthstone.characters.cards.ability;

public abstract class Ability {
    private AbilityType type;
    public Ability(AbilityType type){
        this.type = type;
    }
    public abstract void deploy();
}

