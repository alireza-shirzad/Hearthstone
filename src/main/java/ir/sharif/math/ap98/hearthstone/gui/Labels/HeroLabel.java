package ir.sharif.math.ap98.hearthstone.gui.Labels;

import ir.sharif.math.ap98.hearthstone.characters.heros.Hero;
import ir.sharif.math.ap98.hearthstone.gui.GUIConstants;
import ir.sharif.math.ap98.hearthstone.io.fileOperation.ImageOperater;

import javax.swing.*;
import java.awt.*;

public class HeroLabel extends JLabel {
    public HeroLabel(Hero hero){
        this.requestFocus();
        this.setOpaque(false);
        paintHP(hero);
    }
    private void paintHP(Hero hero){
        Image img = ImageOperater.getInstance().Read(hero.getHeroType() + ".png"
                , ImageOperater.imageType.HERO);
        Font font = new Font(GUIConstants.HEADER1_FONT_NAME,Font.BOLD,23);
        Graphics2D g2D = (Graphics2D) img.getGraphics();
        g2D.setFont(font);
        g2D.drawImage(ImageOperater.getInstance().Read("HP.png", ImageOperater.imageType.ICON),85,90,40,55,null);
        g2D.drawString(String.valueOf(hero.getHP()),92,133);
        this.setIcon(new ImageIcon(img));
    }
}
