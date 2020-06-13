package ir.sharif.math.ap98.hearthstone.gui.Buttons;

import ir.sharif.math.ap98.hearthstone.gui.BackgroundPanel;
import ir.sharif.math.ap98.hearthstone.gui.GUIConstants;
import ir.sharif.math.ap98.hearthstone.gui.MainFrame;
import ir.sharif.math.ap98.hearthstone.gui.panels.menuPanel.MenuPanel;

import javax.swing.*;
import java.awt.*;

public class BackButton extends MyButton {
    public BackButton() {
        super("Back");
        this.setFont(new Font("MAD hacker", Font.BOLD, 40));
        this.setForeground(GUIConstants.COLOR2);
        this.setBorder(BorderFactory.createEmptyBorder());
        this.setBounds(870, 603, 280, 80);
    }

    @Override
    public void press() {
        BackgroundPanel.getInstance().removeAll();
        BackgroundPanel.getInstance().add(new MenuPanel());
        MainFrame.getInstance().Update();
    }
}
