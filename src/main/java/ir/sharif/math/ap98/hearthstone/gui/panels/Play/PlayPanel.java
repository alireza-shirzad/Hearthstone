package ir.sharif.math.ap98.hearthstone.gui.panels.Play;

import ir.sharif.math.ap98.hearthstone.gui.BackgroundPanel;
import ir.sharif.math.ap98.hearthstone.gui.GUIConstants;
import ir.sharif.math.ap98.hearthstone.gui.panels.MyPanel;
import ir.sharif.math.ap98.hearthstone.gui.panels.PrePlay.PrePlayDrawer;
import ir.sharif.math.ap98.hearthstone.io.fileOperation.ImageOperater;

import java.awt.*;

public class PlayPanel extends MyPanel {
    private PlayDrawer drawer;

    public PlayPanel(){
        drawer = new PlayDrawer(this);
        BackgroundPanel.getInstance().setImage(GUIConstants.DEFAULTPLAYBACKGROUND_ADDRESS);
        design();
    }
    @Override
    public void design() {
        drawer.drawNextRoundButton();
        drawer.drawBottomPanel();
    }

}
