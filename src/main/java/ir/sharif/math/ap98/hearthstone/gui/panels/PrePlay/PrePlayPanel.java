package ir.sharif.math.ap98.hearthstone.gui.panels.PrePlay;

import ir.sharif.math.ap98.hearthstone.gui.GUIConstants;
import ir.sharif.math.ap98.hearthstone.gui.MainFrame;
import ir.sharif.math.ap98.hearthstone.gui.panels.MyPanel;
import ir.sharif.math.ap98.hearthstone.gui.panels.Shop.ShopDrawer;

import javax.swing.*;
import java.awt.*;

public class PrePlayPanel extends MyPanel {
    private PrePlayDrawer drawer;
    private Timer timer;
    public PrePlayPanel(){
        drawer = new PrePlayDrawer(this);
        design();
    }
    @Override
    public void design() {
        startAnimation();
        drawer.desingPassivePanel();
    }
    private void startAnimation(){
        timer = new Timer(GUIConstants.RENDERING_SPEED, e -> {
            repaint();
            MainFrame.getInstance().Update();
        });
        timer.start();
    }
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2D = (Graphics2D)g;
        drawer.Animate(g2D);
    }
}
