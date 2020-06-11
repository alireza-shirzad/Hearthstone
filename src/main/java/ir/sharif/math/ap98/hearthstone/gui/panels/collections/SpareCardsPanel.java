package ir.sharif.math.ap98.hearthstone.gui.panels.collections;

import ir.sharif.math.ap98.hearthstone.characters.cards.Card;
import ir.sharif.math.ap98.hearthstone.gui.MainFrame;
import ir.sharif.math.ap98.hearthstone.gui.panels.MyPanel;

import java.awt.*;
import java.util.ArrayList;

public class SpareCardsPanel extends MyPanel {
    private SpareCardsDrawer drawer;
    public SpareCardsPanel(){
        CollectionsReferences.setSpareCardsPanel(this);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        drawer = new SpareCardsDrawer(this);
        design();
    }
    @Override
    public void design() {
        removeAll();
        drawer.designSpareCards(null,true);
        MainFrame.getInstance().Update();
    }
    public void update(ArrayList<Card> cards) {
        removeAll();
        drawer.designSpareCards(cards,false);
        MainFrame.getInstance().Update();
    }
}
