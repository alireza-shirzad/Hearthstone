package ir.sharif.math.ap98.hearthstone.gui.panels.Play;

import ir.sharif.math.ap98.hearthstone.gui.panels.MyPanel;

import javax.swing.*;
import java.awt.*;

public class CardsPanel extends MyPanel {
    private CardsDrawer drawer;
    public CardsPanel() {
        drawer = new CardsDrawer(this);
        this.setBounds(315,10,750,645);
        this.setLayout(null);
        design();
    }
    @Override
    public void design() {
        drawer.drawCards();
    }
}
