package ir.sharif.math.ap98.hearthstone.gui.panels.Play;

import ir.sharif.math.ap98.hearthstone.gui.panels.MyPanel;

import javax.swing.*;
import java.awt.*;

import static java.awt.Color.RED;

public class CardsPanel extends MyPanel {
    private CardsDrawer drawer;
    public CardsPanel() {
        drawer = new CardsDrawer(this);
        this.setBounds(155,10,910,645);
        this.setLayout(null);
        design();
    }
    @Override
    public void design() {
        drawer.drawCards();
    }
}
