package ir.sharif.math.ap98.hearthstone.gui.Buttons;

import ir.sharif.math.ap98.hearthstone.gui.GUIConstants;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public abstract class SignButton extends MyButton {

    public SignButton(String name) {
        super(name);
        this.setFont(new Font("MAD hacker", Font.BOLD, 60));
        this.setForeground(GUIConstants.COLOR2);
        this.setBorder(BorderFactory.createEmptyBorder());
    }
}
