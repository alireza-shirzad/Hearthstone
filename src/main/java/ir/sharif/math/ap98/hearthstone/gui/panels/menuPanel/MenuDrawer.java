package ir.sharif.math.ap98.hearthstone.gui.panels.menuPanel;

import ir.sharif.math.ap98.hearthstone.gui.Buttons.MenuButton;
import ir.sharif.math.ap98.hearthstone.gui.Drawer;
import ir.sharif.math.ap98.hearthstone.gui.Labels.Header;
import ir.sharif.math.ap98.hearthstone.gui.MainFrame;


import javax.swing.*;

public class MenuDrawer extends Drawer {
    private Header header;
    private MenuButton playButton;
    private MenuButton statusButton;
    private MenuButton collectionsButton;
    private MenuButton shopButton;
    private MenuButton settingsButton;
    public MenuDrawer(JPanel jPanel) {
        super(jPanel);
    }
    public void designHeader(String labelString){
        header = new Header(labelString);
        header.setBounds(400, 10, 430, 80);
        jPanel.add(header);
        MainFrame.getInstance().Update();
    }
    public void designOptions(){
        playButton = new MenuButton("Play");
        playButton.setBounds(375,120,360,80);
        statusButton = new MenuButton("Status");
        statusButton.setBounds(375,220,360,80);
        collectionsButton = new MenuButton("Collections");
        collectionsButton.setBounds(375,320,360,80);
        shopButton = new MenuButton("Shop");
        shopButton.setBounds(375,420,360,80);
        settingsButton = new MenuButton("Settings");
        settingsButton.setBounds(375,520,360,80);
        jPanel.add(playButton);
        jPanel.add(statusButton);
        jPanel.add(collectionsButton);
        jPanel.add(shopButton);
        jPanel.add(settingsButton);
    }
}
