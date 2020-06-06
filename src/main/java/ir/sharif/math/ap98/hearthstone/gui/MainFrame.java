package ir.sharif.math.ap98.hearthstone.gui;

import ir.sharif.math.ap98.hearthstone.io.confLoader.GraphicConfigLoader;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private int frameWidth ;
    private int frameHeight ;
    private String gameTitle;

    public MainFrame(){
        this.frameWidth = Integer.valueOf(GraphicConfigLoader.getInstance().getPropVal("frameWidth"));
        this.frameHeight = Integer.valueOf(GraphicConfigLoader.getInstance().getPropVal("frameHeight"));
        this.gameTitle = GraphicConfigLoader.getInstance().getPropVal("frameTitle");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(frameWidth,frameHeight);
        this.setTitle(gameTitle);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        this.setLayout(new BorderLayout());
    }
    public void Update(){
        repaint();
        revalidate();
    }

    //// Singleton Design
    private static MainFrame mainFrame;
    public static MainFrame getInstance() {
        if(mainFrame==null) { mainFrame = new MainFrame();}
        return mainFrame;
    }

}
