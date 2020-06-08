package ir.sharif.math.ap98.hearthstone.gui.Buttons;

import javax.swing.*;
import java.awt.*;
import java.awt.font.TextAttribute;
import java.util.Map;

public class MyButton extends JButton {
    public MyButton(String name){
        this.setLayout(null);
        this.setText(name);
        this.setContentAreaFilled(false);
        this.requestFocus();
        this.setOpaque(false);
        this.addMouseListener(new java.awt.event.MouseAdapter() {
            Font originalFont = null;
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                originalFont = getFont();
                Map attributes = originalFont.getAttributes();
                attributes.put(TextAttribute.WEIGHT, TextAttribute.WEIGHT_LIGHT);
                setFont(originalFont.deriveFont(attributes));
                setCursor(new Cursor(Cursor.HAND_CURSOR));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                setFont(originalFont);
                setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });
    }

}
