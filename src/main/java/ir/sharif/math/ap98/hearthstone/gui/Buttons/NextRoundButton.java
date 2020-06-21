package ir.sharif.math.ap98.hearthstone.gui.Buttons;

import ir.sharif.math.ap98.hearthstone.game.MatchState;
import ir.sharif.math.ap98.hearthstone.gui.GUIConstants;
import ir.sharif.math.ap98.hearthstone.gui.panels.Play.PlayRefrences;
import ir.sharif.math.ap98.hearthstone.io.fileOperation.ImageOperater;

import javax.swing.*;
import java.awt.*;

public class NextRoundButton extends MyButton {
    public NextRoundButton() {
        super("");
        setBounds(15,307,290,50);
        this.setBorder(BorderFactory.createBevelBorder(2));
        this.setHorizontalAlignment(CENTER);
        this.setVerticalAlignment(CENTER);
        this.setForeground(Color.BLACK);
        this.setContentAreaFilled(false);
        this.requestFocus();
        this.setOpaque(false);
        this.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                setBorder(BorderFactory.createLineBorder(GUIConstants.COLOR5,4,true));
                setCursor(new Cursor(Cursor.HAND_CURSOR));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                setBorder(BorderFactory.createEmptyBorder());
            }
        });
        Image img = ImageOperater.getInstance().Read("EndTurn.png"
                , ImageOperater.imageType.ICON);
        this.setIcon(new ImageIcon(img));
    }

    @Override
    public void press() {
        MatchState.get().getMyEntity().nextTurn();
        PlayRefrences.getBottomPanel().getDrawer().drawMana();
        //DesignHand();
        if (PlayRefrences.getBottomPanel().getDrawer().getHandDialog() !=null)
            PlayRefrences.getBottomPanel().getDrawer().getHandDialog().dispose();
    }

}
