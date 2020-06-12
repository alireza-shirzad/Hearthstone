package ir.sharif.math.ap98.hearthstone.gui.panels.Settings;

import ir.sharif.math.ap98.hearthstone.gui.MainFrame;
import ir.sharif.math.ap98.hearthstone.gui.panels.MyPanel;

public class SettingsPanel extends MyPanel {
    private SettingsDrawer drawer;
    public SettingsPanel(){
        drawer = new SettingsDrawer(this);
        design();
    }
    @Override
    public void design() {
        removeAll();
        drawer.designHeader("Settings");
        drawer.designChangeBGPanel();
        drawer.designChangeSoundPanel();
        MainFrame.getInstance().Update();
    }
}
