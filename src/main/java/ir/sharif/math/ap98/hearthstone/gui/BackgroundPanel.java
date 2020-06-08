package ir.sharif.math.ap98.hearthstone.gui;

import ir.sharif.math.ap98.hearthstone.io.confLoader.GraphicConfigLoader;
import ir.sharif.math.ap98.hearthstone.io.fileOperation.ImageOperater;

import javax.swing.*;
import java.awt.*;

public class BackgroundPanel extends JPanel {
    private Image image;
    private BackgroundPanel(){
        setLayout(new BorderLayout());
        image = ImageOperater.getInstance().Read(GUIConstants.DEFAULTBACKGROUND_ADDRESS
                , ImageOperater.imageType.BACKGROUND);
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(this.image, 0, 0,GUIConstants.FRAME_WIDTH , GUIConstants.FRAME_HEIGHT, null);
    }
    //// Singletone Design
    private static BackgroundPanel backgroundPanel;
    public static BackgroundPanel getInstance() {
        if(backgroundPanel==null) {backgroundPanel =  new BackgroundPanel();}
        return backgroundPanel;
    }
}
