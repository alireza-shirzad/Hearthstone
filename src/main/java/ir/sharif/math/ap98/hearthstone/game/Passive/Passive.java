package ir.sharif.math.ap98.hearthstone.game.Passive;

import java.util.ArrayList;

public class Passive {
    public static final int numOfPassives = 5;
    public final static ArrayList<Passive> passives = new ArrayList<>();
    static {
        passives.add(new FreePower());
        passives.add(new ManaJump());
        passives.add(new OffCards());
        passives.add(new TwiceDraw());
        passives.add(new Warriors());
    }
    private String name;
    public Passive(String name) {
        this.name = name;
    }

    public static ArrayList<Passive> getPassives() {
        return passives;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public static int getNumOfPassives() {
        return numOfPassives;
    }

}
