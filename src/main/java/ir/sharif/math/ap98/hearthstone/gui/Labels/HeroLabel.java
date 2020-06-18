package ir.sharif.math.ap98.hearthstone.gui.Labels;

import ir.sharif.math.ap98.hearthstone.characters.heros.Hero;
import ir.sharif.math.ap98.hearthstone.io.fileOperation.ImageOperater;

import javax.swing.*;
import java.awt.*;

public class HeroLabel extends JLabel {
    public HeroLabel(Hero hero){
        setBounds(100,170,130,150);
        this.requestFocus();
        this.setOpaque(false);
        Image img = ImageOperater.getInstance().Read(hero.getHeroType() + ".png"
                , ImageOperater.imageType.HERO);
        this.setIcon(new ImageIcon(img));
    }
}
