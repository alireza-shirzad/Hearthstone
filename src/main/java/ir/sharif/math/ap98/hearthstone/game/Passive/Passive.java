package ir.sharif.math.ap98.hearthstone.game.Passive;

public class Passive {

    public Passive(String name, String description) {
        this.name = name;
        Description = description;
    }

    private String name;
    private String Description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
