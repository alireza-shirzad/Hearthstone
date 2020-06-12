package ir.sharif.math.ap98.hearthstone.gui.Buttons;

import ir.sharif.math.ap98.hearthstone.gui.BackgroundPanel;
import ir.sharif.math.ap98.hearthstone.gui.GUIConstants;
import ir.sharif.math.ap98.hearthstone.gui.MainFrame;
import ir.sharif.math.ap98.hearthstone.gui.panels.Settings.SettingsPanel;
import ir.sharif.math.ap98.hearthstone.gui.panels.Shop.ShopPanel;
import ir.sharif.math.ap98.hearthstone.gui.panels.collections.CollectionsPanel;

import java.awt.*;

public class MenuButton extends MyButton {
    public MenuButton(String name) {
        super(name);
        this.setFont(new Font(GUIConstants.HEADER_FONT_NAME, Font.BOLD, 40));
        this.setForeground(GUIConstants.COLOR5);
    }

    @Override
    public void press() {
        String name = this.getText();
        BackgroundPanel.getInstance().removeAll();
        switch (name){
            case "Play":

                break;
            case "Status":

                break;
            case "Collections":
                    BackgroundPanel.getInstance().add(new CollectionsPanel());
                break;
            case "Shop":
                    BackgroundPanel.getInstance().add(new ShopPanel());
                break;
            case "Settings":
                BackgroundPanel.getInstance().add(new SettingsPanel());
                break;
        }
        MainFrame.getInstance().Update();
    }
}
