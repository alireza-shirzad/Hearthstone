package ir.sharif.math.ap98.hearthstone.gui.panels.PrePlay;

import ir.sharif.math.ap98.hearthstone.gui.panels.MyPanel;

import java.awt.*;

public class PassivePanel extends MyPanel {
    private PassiveDrawer drawer;
    public PassivePanel(){
        drawer = new PassiveDrawer(this);
        PrePlayRefrences.setPassivePanel(this);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setBounds(250,60,600,250);
        design();
    }
    @Override
    public void design() {
        drawer.drawPassives();
        drawer.designBorder("Passive");
    }
}
