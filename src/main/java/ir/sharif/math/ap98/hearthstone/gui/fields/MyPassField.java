package ir.sharif.math.ap98.hearthstone.gui.fields;

import ir.sharif.math.ap98.hearthstone.gui.GUIConstants;

import javax.swing.*;

public class MyPassField extends JPasswordField {
    public MyPassField(){
        setBorder(BorderFactory.createLineBorder(GUIConstants.COLOR3,4,true));
        setForeground(GUIConstants.COLOR5);
        setOpaque(false);
    }
}
