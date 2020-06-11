package ir.sharif.math.ap98.hearthstone.gui.panels.collections;

import ir.sharif.math.ap98.hearthstone.gui.GUIConstants;
import ir.sharif.math.ap98.hearthstone.gui.panels.MyPanel;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

import static ir.sharif.math.ap98.hearthstone.gui.GUIConstants.COLOR3;

public abstract class SidePanel extends MyPanel {
    public SidePanel(String name){
        designBorder(name);
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    }
    public void designBorder(String name){
        Border tmpBorder = new LineBorder(COLOR3,3);
        TitledBorder title = new TitledBorder(tmpBorder,name);
        title.setTitleFont(new Font(GUIConstants.HEADER1_FONT_NAME, Font.BOLD, 30));
        title.setTitleColor(COLOR3);
        this.setBorder(title);
    }

}
