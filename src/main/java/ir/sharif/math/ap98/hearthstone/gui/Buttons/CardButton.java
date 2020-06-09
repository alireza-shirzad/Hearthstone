package ir.sharif.math.ap98.hearthstone.gui.Buttons;

import ir.sharif.math.ap98.hearthstone.characters.cards.Card;
import ir.sharif.math.ap98.hearthstone.gui.GUIConstants;
import ir.sharif.math.ap98.hearthstone.io.fileOperation.ImageOperater;

import javax.swing.*;
import java.awt.*;

public class CardButton extends MyButton {
    public CardButton(Card card) {
        super("");
        int w = 130;
        int h = 180;
        this.setPreferredSize(new Dimension(w,h));
        this.setBorder(BorderFactory.createBevelBorder(2));
        Image img = ImageOperater.getInstance().Read(card.getName() + ".png"
                , ImageOperater.imageType.CARD);
        Image newimg = img.getScaledInstance( w, h,  java.awt.Image.SCALE_SMOOTH ) ;
        this.setIcon(new ImageIcon(newimg));
        this.setHorizontalAlignment(CENTER);
        this.setVerticalAlignment(CENTER);
        this.setForeground(Color.BLACK);
        this.setBorderPainted(true);
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
    }


    @Override
    public void press() {

    }
}
