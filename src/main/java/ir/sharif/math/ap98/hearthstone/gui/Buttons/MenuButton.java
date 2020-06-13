package ir.sharif.math.ap98.hearthstone.gui.Buttons;

import ir.sharif.math.ap98.hearthstone.game.GameState;
import ir.sharif.math.ap98.hearthstone.gui.BackgroundPanel;
import ir.sharif.math.ap98.hearthstone.gui.GUIConstants;
import ir.sharif.math.ap98.hearthstone.gui.MainFrame;
import ir.sharif.math.ap98.hearthstone.gui.panels.PrePlay.PrePlayPanel;
import ir.sharif.math.ap98.hearthstone.gui.panels.Settings.SettingsPanel;
import ir.sharif.math.ap98.hearthstone.gui.panels.Shop.ShopPanel;
import ir.sharif.math.ap98.hearthstone.gui.panels.collections.CollectionsPanel;
import ir.sharif.math.ap98.hearthstone.gui.panels.menuPanel.MenuPanel;
import ir.sharif.math.ap98.hearthstone.io.fileOperation.ImageOperater;

import javax.swing.*;
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
                    if (GameState.getInstance().getCurrentDeck()==null) {
                        JOptionPane.showMessageDialog(MainFrame.getInstance(),
                                "Error: You should choose a deck to play",
                                "Play",
                                JOptionPane.INFORMATION_MESSAGE,
                                new ImageIcon(ImageOperater.getInstance()
                                        .Read("Error.png", ImageOperater.imageType.ICON)));
                        BackgroundPanel.getInstance().add(new MenuPanel());
                    }else if (GameState.getInstance().getCurrentDeck().getCards().size()<3){
                        JOptionPane.showMessageDialog(MainFrame.getInstance(),
                                "Error: Your deck should have more than 3 cards",
                                "Play",
                                JOptionPane.INFORMATION_MESSAGE,
                                new ImageIcon(ImageOperater.getInstance()
                                        .Read("Error.png", ImageOperater.imageType.ICON)));
                        BackgroundPanel.getInstance().add(new MenuPanel());
                    }else{
                        BackgroundPanel.getInstance().removeAll();
                        BackgroundPanel.getInstance().add(new PrePlayPanel());
                    }
                break;
            case "Status":
                    //TODO
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
