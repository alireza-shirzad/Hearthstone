package ir.sharif.math.ap98.hearthstone.gui.Buttons;

import ir.sharif.math.ap98.hearthstone.game.MatchState;
import ir.sharif.math.ap98.hearthstone.gui.GUIConstants;
import ir.sharif.math.ap98.hearthstone.gui.panels.Play.PlayRefrences;
import ir.sharif.math.ap98.hearthstone.io.fileOperation.ImageOperater;

import javax.swing.*;
import java.awt.*;

public abstract class NextRoundButton extends JButton {
    public NextRoundButton() {
        super("");
        this.setBorder(BorderFactory.createBevelBorder(2));
        this.setHorizontalAlignment(CENTER);
        this.setVerticalAlignment(CENTER);
        this.setForeground(Color.BLACK);
        this.setContentAreaFilled(false);
        this.requestFocus();
        this.setOpaque(false);
        addActionListener(e -> press());
        Image img = ImageOperater.getInstance().Read("EndTurn.png"
                , ImageOperater.imageType.ICON);
        this.setIcon(new ImageIcon(img));
    }
    public abstract void press();

}
