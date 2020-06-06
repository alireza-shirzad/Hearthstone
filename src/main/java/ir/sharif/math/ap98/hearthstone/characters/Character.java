package ir.sharif.math.ap98.hearthstone.characters;

public abstract class Character {

    //// Attributes
    private String name;
    private Type characterType;


    //// Constructor
    public Character(String name, Type type) {
        this.name = name;
        this.characterType = type;
    }

    public Character(){
        super();
    }


    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                '}';
    }

    //// Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getCharacterType() {
        return characterType;
    }

    public void setCharacterType(Type characterType) {
        this.characterType = characterType;
    }

    //// Card_Management.Character Type Definitions
    public enum Type{
        Hero,
        Card;
    }
}
