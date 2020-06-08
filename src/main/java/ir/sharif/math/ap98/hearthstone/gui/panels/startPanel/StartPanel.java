package ir.sharif.math.ap98.hearthstone.gui.panels.startPanel;
import ir.sharif.math.ap98.hearthstone.gui.GUIConstants;
import ir.sharif.math.ap98.hearthstone.gui.MainFrame;
import ir.sharif.math.ap98.hearthstone.gui.panels.MyPanel;

import javax.swing.*;
import java.awt.*;

public class StartPanel extends MyPanel {
    private StartDrawer startDrawer;
    private Timer timer;

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2D = (Graphics2D)g;
        startDrawer.Animate(g2D);
    }

    public StartPanel(){
        super();
        startDrawer = new StartDrawer(this);
        design();
    }

    @Override
    public void design() {
        startAnimation();
        DesginButtons();
    }

    private void startAnimation(){
        timer = new Timer(GUIConstants.RENDERING_SPEED, e -> {
            repaint();
            MainFrame.getInstance().Update();
        });
        timer.start();
    }
    private void DesginButtons(){
        startDrawer.designSignInButton();
        startDrawer.designSignUpButton();
        MainFrame.getInstance().Update();
    }

}
