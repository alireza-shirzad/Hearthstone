package ir.sharif.math.ap98.hearthstone.gui.Labels;

import ir.sharif.math.ap98.hearthstone.game.MatchState;
import ir.sharif.math.ap98.hearthstone.io.fileOperation.ImageOperater;

import javax.swing.*;
import java.awt.*;

public class ManaLabel extends JLabel {
    private Image manaIcon;
    private ImageIcon manaImageIcon;
    public ManaLabel(Type type){
        if (type==Type.SHINY){
            manaIcon = ImageOperater.getInstance().Read("ManaShine.png"
                    , ImageOperater.imageType.ICON);
        } else{
            manaIcon = ImageOperater.getInstance().Read("ManaDark.png"
                    , ImageOperater.imageType.ICON);
        }
        manaImageIcon = new ImageIcon(manaIcon);
        this.setIcon(manaImageIcon);
    }

    public enum Type {
        SHINY,
        DARK;
    }
}
