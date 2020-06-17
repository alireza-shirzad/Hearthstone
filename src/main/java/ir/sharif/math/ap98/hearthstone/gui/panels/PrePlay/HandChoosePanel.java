package ir.sharif.math.ap98.hearthstone.gui.panels.PrePlay;

import ir.sharif.math.ap98.hearthstone.game.GameState;
import ir.sharif.math.ap98.hearthstone.gui.panels.MyPanel;

import java.awt.*;
import java.lang.reflect.GenericArrayType;

public class HandChoosePanel extends MyPanel {
    private HandChooseDrawer drawer;
    public HandChoosePanel(){
        drawer = new HandChooseDrawer(this);
        GameState.getInstance().setCanChangeHand(true);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setBounds(30,340,600,250);
        PrePlayRefrences.setHandChoosePanel(this);
        design();
    }
    @Override
    public void design() {
        removeAll();
        if (GameState.getInstance().isCanChangeHand()) drawer.designHand();
        else drawer.drawHand();
        drawer.designBorder("Hand");
    }
}
