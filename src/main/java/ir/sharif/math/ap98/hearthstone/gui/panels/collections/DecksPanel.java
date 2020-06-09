package ir.sharif.math.ap98.hearthstone.gui.panels.collections;

import ir.sharif.math.ap98.hearthstone.gui.panels.MyPanel;

import javax.swing.*;

public class DecksPanel extends MyPanel {
    private DecksDrawer drawer;
    public DecksPanel(){
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        drawer = new DecksDrawer(this);
        design();
    }
    @Override
    public void design() {
        drawer.designDecks();
    }
}
