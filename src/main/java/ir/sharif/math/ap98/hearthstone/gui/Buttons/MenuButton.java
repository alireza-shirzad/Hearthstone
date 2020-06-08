package ir.sharif.math.ap98.hearthstone.gui.Buttons;

import ir.sharif.math.ap98.hearthstone.gui.BackgroundPanel;
import ir.sharif.math.ap98.hearthstone.gui.GUIConstants;

import java.awt.*;

public class MenuButton extends MyButton {
    public MenuButton(String name) {
        super(name);
        this.setFont(new Font("MAD hacker", Font.BOLD, 40));
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

                break;
            case "Shop":

                break;
            case "Settings":

                break;
        }
    }
}
