package ir.sharif.math.ap98.hearthstone.gui.panels.PrePlay;

import ir.sharif.math.ap98.hearthstone.game.GameState;
import ir.sharif.math.ap98.hearthstone.game.Hand;
import ir.sharif.math.ap98.hearthstone.game.Passive.Passive;
import ir.sharif.math.ap98.hearthstone.gui.Buttons.HandChooseCardButton;
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

public class HandChooseDrawer extends Drawer {
    private Border border;
    public HandChooseDrawer(JPanel jPanel) {
        super(jPanel);
    }
    public void designHand(){
        GameState.getInstance().initiatePlayDeck();
        GameState.getInstance().setHand(new Hand());
        for (int i=0; i<3; i++) {
            jPanel.add(new HandChooseCardButton(GameState.getInstance()
                    .getHand().getCards().get(i),150,200));
        }
    }
    public void drawHand(){
        for (int i=0; i<3; i++) {
            jPanel.add(new HandChooseCardButton(GameState.getInstance()
                    .getHand().getCards().get(i),150,200));
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
