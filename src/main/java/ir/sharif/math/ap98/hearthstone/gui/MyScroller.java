package ir.sharif.math.ap98.hearthstone.gui;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

import static ir.sharif.math.ap98.hearthstone.gui.GUIConstants.COLOR3;

public abstract class MyScroller extends JScrollPane {
    protected String borderLabel;
    public MyScroller(JPanel jPanel, String borderLabel){
        super(jPanel);
        this.borderLabel = borderLabel;
        this.setOpaque(false);
        this.getViewport().setOpaque(false);
        designBorder();

    }
    public void designBorder(){
        Border tmpBorder = new LineBorder(COLOR3,3);
        TitledBorder title = new TitledBorder(tmpBorder,borderLabel);
        title.setTitleFont(new Font(GUIConstants.HEADER1_FONT_NAME, Font.BOLD, 30));
        title.setTitleColor(COLOR3);
        this.setBorder(title);
    }

}
