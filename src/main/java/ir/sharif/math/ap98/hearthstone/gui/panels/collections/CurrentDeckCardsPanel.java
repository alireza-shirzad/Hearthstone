package ir.sharif.math.ap98.hearthstone.gui.panels.collections;

import ir.sharif.math.ap98.hearthstone.gui.MainFrame;
import ir.sharif.math.ap98.hearthstone.gui.panels.MyPanel;

import javax.swing.*;
import java.awt.*;

public class CurrentDeckCardsPanel extends MyPanel {
    private CurrentDeckCardsDrawer drawer;
    public CurrentDeckCardsPanel(){
        CollectionsReferences.setCurrentDeckCardsPanel(this);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        drawer = new CurrentDeckCardsDrawer(this);
        design();
    }
    @Override
    public void design() {
        removeAll();
        drawer.designCurrentDeckCards();
        MainFrame.getInstance().Update();
    }
}
