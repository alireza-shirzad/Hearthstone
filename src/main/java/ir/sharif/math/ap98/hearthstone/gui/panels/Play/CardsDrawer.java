package ir.sharif.math.ap98.hearthstone.gui.panels.Play;


import ir.sharif.math.ap98.hearthstone.game.MatchState;
import ir.sharif.math.ap98.hearthstone.gui.Buttons.MyMiddleCardButton;
import ir.sharif.math.ap98.hearthstone.gui.Buttons.OpponentMiddleCardButton;
import ir.sharif.math.ap98.hearthstone.gui.Drawer;
import ir.sharif.math.ap98.hearthstone.gui.MainFrame;


import javax.swing.*;

public class CardsDrawer extends Drawer {
    public CardsDrawer(JPanel jPanel) {
        super(jPanel);
    }
    public void drawCards(){
        for (int i = 0; i < MatchState.get().getMyEntity().getMiddleCards().size(); i++) {
            System.out.println(i);
            jPanel.add(new MyMiddleCardButton(MatchState.get().getMyEntity().getMiddleCards().get(i),i));
        }
        for (int i = 0; i < MatchState.get().getOponentEntity().getMiddleCards().size(); i++) {
            jPanel.add(new OpponentMiddleCardButton(MatchState.get().getOponentEntity().getMiddleCards().get(i),i));
        }
        MainFrame.getInstance().Update();
    }
}
