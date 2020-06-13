package ir.sharif.math.ap98.hearthstone.gui.panels.Settings;

import ir.sharif.math.ap98.hearthstone.gui.Buttons.BackButton;
import ir.sharif.math.ap98.hearthstone.gui.Drawer;
import ir.sharif.math.ap98.hearthstone.gui.Labels.Header;
import ir.sharif.math.ap98.hearthstone.gui.MainFrame;

import javax.swing.*;

public class SettingsDrawer extends Drawer {
    private Header header;
    private ChangeBGPanel changeBGPanel;
    private ChangeSoundPanel changeSoundPanel;
    private BackButton backButton;
    public SettingsDrawer(JPanel jPanel) {
        super(jPanel);
    }
    public void designHeader(String labelString){
        header = new Header(labelString);
        header.setBounds(0,5,800,70);
        jPanel.add(header);
        MainFrame.getInstance().Update();
    }
    public void designChangeBGPanel(){
        changeBGPanel = new ChangeBGPanel();
        jPanel.add(changeBGPanel);
    }
    public void designChangeSoundPanel(){
        changeSoundPanel = new ChangeSoundPanel();
        jPanel.add(changeSoundPanel);
    }
    public void designBackButton(){
        backButton = new BackButton();
        jPanel.add(backButton);
    }
}
