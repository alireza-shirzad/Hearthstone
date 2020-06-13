package ir.sharif.math.ap98.hearthstone.gui.Buttons;

import ir.sharif.math.ap98.hearthstone.characters.cards.Card;
import ir.sharif.math.ap98.hearthstone.game.GameState;
import ir.sharif.math.ap98.hearthstone.game.Passive.Passive;
import ir.sharif.math.ap98.hearthstone.gui.GUIConstants;
import ir.sharif.math.ap98.hearthstone.gui.MainFrame;
import ir.sharif.math.ap98.hearthstone.io.fileOperation.ImageOperater;

import javax.swing.*;
import java.awt.*;

public class PassiveButton extends MyButton {
    private Passive passive;
    public PassiveButton(Passive passive, int w, int h) {
        super("");
        this.passive = passive;
        this.setPreferredSize(new Dimension(w,h));
        this.setBorder(BorderFactory.createBevelBorder(2));
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
        Image img = ImageOperater.getInstance().Read(passive.getName() + ".png"
                , ImageOperater.imageType.CARD);
        Image newimg = img.getScaledInstance( w, h,  java.awt.Image.SCALE_SMOOTH ) ;
        this.setIcon(new ImageIcon(newimg));
    }

    @Override
    public void press() {
        //GameState.getInstance().setPassive(passive);
        JOptionPane.showMessageDialog(MainFrame.getInstance(),
                "Special power added",
                "Special power",
                JOptionPane.INFORMATION_MESSAGE,
                new ImageIcon(ImageOperater.getInstance()
                        .Read("PassiveAdded.jpg", ImageOperater.imageType.ICON)));
    }
}
