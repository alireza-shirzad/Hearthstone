package ir.sharif.math.ap98.hearthstone;

import ir.sharif.math.ap98.hearthstone.game.GameState;
import ir.sharif.math.ap98.hearthstone.gui.BackgroundPanel;
import ir.sharif.math.ap98.hearthstone.gui.MainFrame;

import ir.sharif.math.ap98.hearthstone.gui.panels.menuPanel.MenuPanel;
import ir.sharif.math.ap98.hearthstone.gui.panels.startPanel.StartPanel;
import ir.sharif.math.ap98.hearthstone.players.PlayerManager;

import java.awt.*;

public class Program {
    public static void main(String[] args){
        run();
    }
    private static void run(){
        GameState.getInstance().setCurrentPlayer(PlayerManager.getInstance().Load("ali"));
        BackgroundPanel.getInstance().add(new MenuPanel());
        MainFrame.getInstance().add(BackgroundPanel.getInstance(), BorderLayout.CENTER);
    }
}
