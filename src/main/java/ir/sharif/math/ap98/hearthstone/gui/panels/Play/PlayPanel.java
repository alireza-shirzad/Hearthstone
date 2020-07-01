package ir.sharif.math.ap98.hearthstone.gui.panels.Play;
import ir.sharif.math.ap98.hearthstone.gui.BackgroundPanel;
import ir.sharif.math.ap98.hearthstone.gui.GUIConstants;
import ir.sharif.math.ap98.hearthstone.gui.panels.MyPanel;


public class PlayPanel extends MyPanel {
    private PlayDrawer drawer;

    public PlayPanel(){
        drawer = new PlayDrawer(this);
        BackgroundPanel.getInstance().setImage(GUIConstants.DEFAULTPLAYBACKGROUND_ADDRESS);
        PlayRefrences.setPlayPanel(this);
        design();
    }
    @Override
    public void design() {
        drawer.drawBottomPanel();
        drawer.drawUpPanel();
    }

    public PlayDrawer getDrawer() {
        return drawer;
    }
    public void setDrawer(PlayDrawer drawer) {
        this.drawer = drawer;
    }
}
