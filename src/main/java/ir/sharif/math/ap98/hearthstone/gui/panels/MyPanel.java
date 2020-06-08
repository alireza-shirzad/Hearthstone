package ir.sharif.math.ap98.hearthstone.gui.panels;

import javax.swing.*;

public abstract class MyPanel extends JPanel {
    public MyPanel(){
        setLayout(null);
        setOpaque(false);
    }
    public abstract void design();
}
