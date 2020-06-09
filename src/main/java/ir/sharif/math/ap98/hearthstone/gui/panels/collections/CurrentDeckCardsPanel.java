package ir.sharif.math.ap98.hearthstone.gui.panels.collections;

import ir.sharif.math.ap98.hearthstone.gui.panels.MyPanel;

import javax.swing.*;
import java.awt.*;

public class CurrentDeckCardsPanel extends MyPanel {
    private CurrentDeckCardsDrawer drawer;
    public CurrentDeckCardsPanel(){
        setLayout(new FlowLayout(FlowLayout.LEFT));
        drawer = new CurrentDeckCardsDrawer(this);
        design();
    }
    @Override
    public void design() {
        drawer.designCurrentDeckCards();
    }
}
