package ir.sharif.math.ap98.hearthstone.gui.panels.Play;

import ir.sharif.math.ap98.hearthstone.gui.BackgroundPanel;
import ir.sharif.math.ap98.hearthstone.gui.GUIConstants;
import ir.sharif.math.ap98.hearthstone.gui.panels.MyPanel;

public class UpPanel extends MyPanel {
    private UpDrawer drawer;

    public UpPanel(){
        drawer = new UpDrawer(this);
        this.setBounds(0,30,1090,330);
        BackgroundPanel.getInstance().setImage(GUIConstants.DEFAULTPLAYBACKGROUND_ADDRESS);
        PlayRefrences.setUpPanel(this);
        design();
    }
    @Override
    public void design() {
        drawer.drawHeroLabel();
        drawer.drawHeroPowerButton();
        drawer.drawshowHandButton();
        //drawer.drawMana();
    }

    public UpDrawer getDrawer() {
        return drawer;
    }
    public void setDrawer(UpDrawer drawer) {
        this.drawer = drawer;
    }
}
