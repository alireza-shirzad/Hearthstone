package ir.sharif.math.ap98.hearthstone.gui.panels.PrePlay;

import ir.sharif.math.ap98.hearthstone.game.Passive.Passive;
import ir.sharif.math.ap98.hearthstone.gui.Buttons.PassiveButton;
import ir.sharif.math.ap98.hearthstone.gui.Drawer;
import ir.sharif.math.ap98.hearthstone.gui.GUIConstants;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

import static ir.sharif.math.ap98.hearthstone.gui.GUIConstants.COLOR3;

public class PassiveDrawer extends Drawer {
    private Border border;
    public PassiveDrawer(JPanel jPanel) {
        super(jPanel);
    }
    public void drawPassives(){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i<= Passive.numOfPassives-1; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        for (int i=0; i<3; i++) {
            jPanel.add(new PassiveButton(Passive.getPassives().get(list.get(i)),150,200));
        }
    }
    public void designBorder(String name){
        border = new LineBorder(COLOR3,3);
        TitledBorder title = new TitledBorder(border,name);
        title.setTitleFont(new Font(GUIConstants.HEADER1_FONT_NAME, Font.BOLD, 30));
        title.setTitleColor(COLOR3);
        jPanel.setBorder(title);
    }
}
