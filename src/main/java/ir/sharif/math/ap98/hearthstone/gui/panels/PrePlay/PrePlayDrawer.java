package ir.sharif.math.ap98.hearthstone.gui.panels.PrePlay;

import ir.sharif.math.ap98.hearthstone.gui.Buttons.PlayButton;
import ir.sharif.math.ap98.hearthstone.gui.CanAnimate;
import ir.sharif.math.ap98.hearthstone.gui.Drawer;
import ir.sharif.math.ap98.hearthstone.gui.GUIConstants;
import ir.sharif.math.ap98.hearthstone.gui.Labels.Header;
import ir.sharif.math.ap98.hearthstone.gui.MainFrame;
import ir.sharif.math.ap98.hearthstone.io.fileOperation.ImageOperater;

import javax.swing.*;
import java.awt.*;

public class PrePlayDrawer extends Drawer implements CanAnimate {
    private Image monsterImage;
    private int fontSize;
    private boolean fontSizeIncreasing;
    private PassivePanel passivePanel;
    private HandChoosePanel handChoosePanel;
    private PlayButton playButton;
    public PrePlayDrawer(JPanel jPanel) {
        super(jPanel);
        fontSize = 30;
        monsterImage = ImageOperater.getInstance().Read("Play.png"
                , ImageOperater.imageType.LOGO);
        monsterImage = monsterImage.getScaledInstance( 250, 333,  java.awt.Image.SCALE_SMOOTH ) ;
    }

    @Override
    public void Animate(Graphics2D g2D) {
        if(fontSize>=40)
            fontSizeIncreasing=false;
        else if (fontSize<=30)
            fontSizeIncreasing = true;
        if (fontSizeIncreasing)
            fontSize = fontSize + 1;
        else
            fontSize = fontSize - 1;
        Rectangle rect = new Rectangle(400,30,300,10);
        Font font = new Font(GUIConstants.HEADER1_FONT_NAME,Font.BOLD,fontSize);
        g2D.setFont(font);
        g2D.setColor(GUIConstants.COLOR5);
        FontMetrics metrics = g2D.getFontMetrics(font);
        String text = "let's prepare to play";
        int x = rect.x + (rect.width - metrics.stringWidth(text)) / 2;
        int y = rect.y + ((rect.height - metrics.getHeight()) / 2) + metrics.getAscent();
        g2D.drawString(text,x,y);
    }

    public void drawMonster(Graphics2D g2D){
        g2D.drawImage(monsterImage,720,100,null);
    }
    public void desingPassivePanel(){
        passivePanel = new PassivePanel();
        jPanel.add(passivePanel);
    }
    public void designHandChoosePanel(){
        handChoosePanel = new HandChoosePanel();
        jPanel.add(handChoosePanel);
    }
    public void designPlayButton(){
        playButton = new PlayButton();
        jPanel.add(playButton);
    }

}
