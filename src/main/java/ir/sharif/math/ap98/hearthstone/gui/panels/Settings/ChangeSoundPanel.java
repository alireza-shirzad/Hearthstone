package ir.sharif.math.ap98.hearthstone.gui.panels.Settings;

import ir.sharif.math.ap98.hearthstone.gui.GUIConstants;
import ir.sharif.math.ap98.hearthstone.gui.MainFrame;
import ir.sharif.math.ap98.hearthstone.gui.panels.MyPanel;

public class ChangeSoundPanel extends MyPanel {
    private ChangeSoundDrawer drawer;
    public ChangeSoundPanel(){
        super();
        drawer = new ChangeSoundDrawer(this);
        this.setBounds(10,340,
                GUIConstants.FRAME_WIDTH /4,250);
        SettingsReferences.setChangeSoundPanel(this);
        design();
    }
    @Override
    public void design() {
        removeAll();
        drawer.designBorder("Sound");

        MainFrame.getInstance().Update();
    }
}
