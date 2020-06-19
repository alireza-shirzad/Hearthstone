package ir.sharif.math.ap98.hearthstone.gui.Buttons;

import ir.sharif.math.ap98.hearthstone.game.GameEntity;
import ir.sharif.math.ap98.hearthstone.game.MatchState;
import ir.sharif.math.ap98.hearthstone.gui.BackgroundPanel;
import ir.sharif.math.ap98.hearthstone.gui.GUIConstants;
import ir.sharif.math.ap98.hearthstone.gui.MainFrame;
import ir.sharif.math.ap98.hearthstone.gui.panels.Play.PlayPanel;
import ir.sharif.math.ap98.hearthstone.io.fileOperation.ImageOperater;

import javax.swing.*;
import java.awt.*;

public class PlayButton extends MyButton {
    public PlayButton() {
        super("");
        setBounds(695,460,300,180);
        this.setHorizontalAlignment(CENTER);
        this.setVerticalAlignment(CENTER);
        this.setForeground(Color.BLACK);
        this.setContentAreaFilled(false);
        this.requestFocus();
        this.setOpaque(false);
        this.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                setCursor(new Cursor(Cursor.HAND_CURSOR));
            }
        });
        Image img = ImageOperater.getInstance().Read("PlayButton.png"
                , ImageOperater.imageType.ICON);
        this.setIcon(new ImageIcon(img));
    }

    @Override
    public void press() {
        MatchState.createMatch();
        BackgroundPanel.getInstance().removeAll();
        BackgroundPanel.getInstance().add(new PlayPanel());
        MainFrame.getInstance().Update();
    }
}
