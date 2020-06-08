package ir.sharif.math.ap98.hearthstone.gui.Labels;

import ir.sharif.math.ap98.hearthstone.gui.GUIConstants;

import javax.swing.*;
import java.awt.*;

public class Header1 extends JLabel {
    public Header1(String label) {
        super(label);
        setFont(new Font(GUIConstants.HEADER1_FONT_NAME, Font.BOLD, GUIConstants.HEADER1_FONT_SIZE));
        setForeground(GUIConstants.COLOR5);
    }
}
