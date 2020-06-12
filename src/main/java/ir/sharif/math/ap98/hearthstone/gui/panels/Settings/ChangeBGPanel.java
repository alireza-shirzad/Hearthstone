package ir.sharif.math.ap98.hearthstone.gui.panels.Settings;

import ir.sharif.math.ap98.hearthstone.gui.MainFrame;
import ir.sharif.math.ap98.hearthstone.gui.panels.MyPanel;

import java.awt.*;

public class ChangeBGPanel extends MyPanel {
    private ChangeBGDrawer drawer;
    public ChangeBGPanel(){
        super();
        drawer = new ChangeBGDrawer(this);
        setBounds(5,120,1075,210);
        SettingsReferences.setChangeBGPanel(this);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        design();
    }
    @Override
    public void design() {
        removeAll();
        drawer.designBorder("Background");
        drawer.designBackgroundButtons();
        MainFrame.getInstance().Update();
    }
}
