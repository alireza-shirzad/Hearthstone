package ir.sharif.math.ap98.hearthstone.gui.panels.Play;

import ir.sharif.math.ap98.hearthstone.gui.BackgroundPanel;
import ir.sharif.math.ap98.hearthstone.gui.GUIConstants;
import ir.sharif.math.ap98.hearthstone.gui.panels.MyPanel;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class BottomPanel extends MyPanel {
    private BottomDrawer drawer;

    public BottomPanel(){
        drawer = new BottomDrawer(this);
        this.setBounds(0,330,1090,330);
        BackgroundPanel.getInstance().setImage(GUIConstants.DEFAULTPLAYBACKGROUND_ADDRESS);
        PlayRefrences.setBottomPanel(this);
        design();
    }
    @Override
    public void design() {
        drawer.drawMyNextRoundButton();
        drawer.drawHeroLabel();
        drawer.drawHeroPowerButton();
        drawer.drawshowHandButton();
        drawer.drawMana();
    }

    public BottomDrawer getDrawer() {
        return drawer;
    }
    public void setDrawer(BottomDrawer drawer) {
        this.drawer = drawer;
    }
}
