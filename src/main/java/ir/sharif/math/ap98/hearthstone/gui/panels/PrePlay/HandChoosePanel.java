package ir.sharif.math.ap98.hearthstone.gui.panels.PrePlay;

import ir.sharif.math.ap98.hearthstone.gui.panels.MyPanel;

import java.awt.*;

public class HandChoosePanel extends MyPanel {
    private HandChooseDrawer drawer;
    public HandChoosePanel(){
        drawer = new HandChooseDrawer(this);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setBounds(30,340,600,250);
        design();
    }
    @Override
    public void design() {
        drawer.designHand();
        drawer.designBorder("Hand");
    }
}
