package ir.sharif.math.ap98.hearthstone.gui.panels.Settings;

import ir.sharif.math.ap98.hearthstone.gui.Drawer;
import ir.sharif.math.ap98.hearthstone.gui.GUIConstants;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

import static ir.sharif.math.ap98.hearthstone.gui.GUIConstants.COLOR3;

public class ChangeSoundDrawer extends Drawer {
    private Border border;
    public ChangeSoundDrawer(JPanel jPanel) {
        super(jPanel);
    }

    public void designBorder(String name){
        border = new LineBorder(COLOR3,3);
        TitledBorder title = new TitledBorder(border,name);
        title.setTitleFont(new Font(GUIConstants.HEADER1_FONT_NAME, Font.BOLD, 30));
        title.setTitleColor(COLOR3);
        jPanel.setBorder(title);
    }

}
