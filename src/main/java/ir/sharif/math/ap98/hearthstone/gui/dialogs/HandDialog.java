package ir.sharif.math.ap98.hearthstone.gui.dialogs;

import ir.sharif.math.ap98.hearthstone.game.Hand;
import ir.sharif.math.ap98.hearthstone.game.MatchState;
import ir.sharif.math.ap98.hearthstone.gui.Buttons.HandCardButton;

import javax.swing.*;
import java.awt.*;

public class HandDialog extends JDialog {
    public HandDialog(Hand hand, MatchState.EntityType type){
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        int w,h;
        if (hand.getSize()<=5) {
            w = ((hand.getSize()+1)*150);
            h = 250;
        }
        else {
            w = 6 * 150;
            h = ((int) (hand.getSize()/5)+1)*250;
        }
        this.setPreferredSize(new Dimension(w,h));
        Container pane = this.getContentPane();
        for (int i = 0; i <hand.getSize() ; i++) {
            HandCardButton cardButton = new HandCardButton(hand.getCards().get(i),type);
            pane.add(cardButton);
        }
        this.pack();
    }
}
