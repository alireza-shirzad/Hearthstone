package ir.sharif.math.ap98.hearthstone.gui.Buttons;

import ir.sharif.math.ap98.hearthstone.gui.GUIConstants;
import ir.sharif.math.ap98.hearthstone.gui.panels.signPanel.SignDrawer;

import javax.swing.*;
import java.awt.*;

public abstract class SignCommitButton extends MyButton{
    protected JTextField jTextField;
    protected JPasswordField jPasswordField;
    protected SignDrawer signDrawer;
    public SignCommitButton(String name , JTextField jTextField, JPasswordField jPasswordField, SignDrawer signDrawer) {
        super(name);
        this.jTextField = jTextField;
        this.jPasswordField = jPasswordField;
        this.setFont(new Font(GUIConstants.HEADER1_FONT_NAME, Font.BOLD, 50));
        this.setForeground(GUIConstants.COLOR5);
        this.setBorder(BorderFactory.createLineBorder(GUIConstants.COLOR2,7,true));
    }
}
