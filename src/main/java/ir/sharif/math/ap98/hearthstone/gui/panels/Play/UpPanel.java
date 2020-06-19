package ir.sharif.math.ap98.hearthstone.gui.panels.Play;

import ir.sharif.math.ap98.hearthstone.gui.BackgroundPanel;
import ir.sharif.math.ap98.hearthstone.gui.GUIConstants;
import ir.sharif.math.ap98.hearthstone.gui.panels.MyPanel;

import javax.swing.*;
import java.awt.*;

public class UpPanel extends MyPanel {
    private UpDrawer drawer;

    public UpPanel(){
        drawer = new UpDrawer(this);
        this.setBounds(0,10,1090,330);
        BackgroundPanel.getInstance().setImage(GUIConstants.DEFAULTPLAYBACKGROUND_ADDRESS);
        design();
    }
    @Override
    public void design() {
        drawer.drawHeroLabel();
        drawer.drawHeroPowerButton();
    }
}
