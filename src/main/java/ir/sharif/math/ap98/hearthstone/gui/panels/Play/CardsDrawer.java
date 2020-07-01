package ir.sharif.math.ap98.hearthstone.gui.panels.Play;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import ir.sharif.math.ap98.hearthstone.characters.cards.Card;
import ir.sharif.math.ap98.hearthstone.game.MatchState;
import ir.sharif.math.ap98.hearthstone.gui.Drawer;
import ir.sharif.math.ap98.hearthstone.gui.MainFrame;
import ir.sharif.math.ap98.hearthstone.gui.draggables.MiddleCard;
import ir.sharif.math.ap98.hearthstone.gui.draggables.MyMiddleCard;
import ir.sharif.math.ap98.hearthstone.gui.draggables.OpponentMiddleCard;

import javax.swing.*;

public class CardsDrawer extends Drawer {
    public CardsDrawer(JPanel jPanel) {
        super(jPanel);
    }
    public void drawCards(){
        for (int i = 0; i < MatchState.get().getMyEntity().getMiddleCards().size(); i++) {
            System.out.println(i);
            jPanel.add(new MyMiddleCard(MatchState.get().getMyEntity().getMiddleCards().get(i),i));
        }
        for (int i = 0; i < MatchState.get().getOponentEntity().getMiddleCards().size(); i++) {
            jPanel.add(new OpponentMiddleCard(MatchState.get().getOponentEntity().getMiddleCards().get(i),i));
        }
        MainFrame.getInstance().Update();
    }
}
