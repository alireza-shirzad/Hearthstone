package ir.sharif.math.ap98.hearthstone.gui.panels.PrePlay;

import ir.sharif.math.ap98.hearthstone.gui.CanAnimate;
import ir.sharif.math.ap98.hearthstone.gui.Drawer;
import ir.sharif.math.ap98.hearthstone.gui.GUIConstants;
import ir.sharif.math.ap98.hearthstone.gui.Labels.Header;
import ir.sharif.math.ap98.hearthstone.gui.MainFrame;

import javax.swing.*;
import java.awt.*;

public class PrePlayDrawer extends Drawer implements CanAnimate {
    private Header header;
    private int fontSize;
    private boolean fontSizeIncreasing;
    private PassivePanel passivePanel;
    private HandChoosePanel handChoosePanel;
    public PrePlayDrawer(JPanel jPanel) {
        super(jPanel);
        fontSize = 30;
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

    public void desingPassivePanel(){
        passivePanel = new PassivePanel();
        jPanel.add(passivePanel);
    }
    public void designHandChoosePanel(){

    }

}
