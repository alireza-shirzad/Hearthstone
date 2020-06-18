package ir.sharif.math.ap98.hearthstone.gui.panels.Play;

import ir.sharif.math.ap98.hearthstone.gui.Buttons.NextRoundButton;
import ir.sharif.math.ap98.hearthstone.gui.Drawer;

import javax.swing.*;

public class PlayDrawer extends Drawer {
    private BottomPanel bottomPanel;
    private UpPanel upPanel;
    private NextRoundButton nextRoundButton;
    public PlayDrawer(JPanel jPanel) {
        super(jPanel);
    }
    public void drawBottomPanel(){
        bottomPanel = new BottomPanel();
        jPanel.add(bottomPanel);
    }
    public void drawUpPanel(){
        upPanel = new UpPanel();
        jPanel.add(upPanel);
    }
    public void drawNextRoundButton(){
        nextRoundButton = new NextRoundButton();
        jPanel.add(nextRoundButton);
    }
}
