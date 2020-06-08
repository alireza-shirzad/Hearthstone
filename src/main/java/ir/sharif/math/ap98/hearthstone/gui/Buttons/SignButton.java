package ir.sharif.math.ap98.hearthstone.gui.Buttons;

import ir.sharif.math.ap98.hearthstone.gui.GUIConstants;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class SignButton extends MyButton {

    public SignButton(String name) {
        super(name);
        this.setFont(new Font("MAD hacker", Font.BOLD, 60));
        this.setForeground(new Color(176, 177, 171));
        this.setBorder(BorderFactory.createEmptyBorder());
    }
}
