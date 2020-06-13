package ir.sharif.math.ap98.hearthstone.gui.panels.PrePlay;

import ir.sharif.math.ap98.hearthstone.gui.panels.MyPanel;

public class PassivePanel extends MyPanel {
    private PassiveDrawer passiveDrawer;
    public PassivePanel(){
        passiveDrawer = new PassiveDrawer(this);
        PrePlayRefrences.setPassivePanel(this);
        design();
    }
    @Override
    public void design() {

    }
}
