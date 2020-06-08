package ir.sharif.math.ap98.hearthstone.gui.Labels;

import ir.sharif.math.ap98.hearthstone.gui.GUIConstants;

import javax.swing.*;
import java.awt.*;

public class Header extends JLabel {
    public Header(String label) {
        super(label);
        setFont(new Font(GUIConstants.HEADER_FONT_NAME, Font.BOLD, GUIConstants.HEADER_FONT_SIZE));
        setBounds(10, 10, 430, 80);
        setForeground(GUIConstants.COLOR2);
    }
}
