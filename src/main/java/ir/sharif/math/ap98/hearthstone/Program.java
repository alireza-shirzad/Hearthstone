package ir.sharif.math.ap98.hearthstone;

import ir.sharif.math.ap98.hearthstone.gui.BackgroundPanel;
import ir.sharif.math.ap98.hearthstone.gui.MainFrame;
import ir.sharif.math.ap98.hearthstone.gui.panels.signPanel.SignInPanel;
import ir.sharif.math.ap98.hearthstone.gui.panels.startPanel.StartPanel;

import java.awt.*;

public class Program {
    public static void main(String[] args){
        run();
    }
    private static void run(){
        BackgroundPanel.getInstance().add(new StartPanel());
        MainFrame.getInstance().add(BackgroundPanel.getInstance(), BorderLayout.CENTER);
    }
}
