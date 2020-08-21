package ir.sharif.math.ap98.hearthstone.gui.Buttons;

import ir.sharif.math.ap98.hearthstone.characters.cards.Card;
import ir.sharif.math.ap98.hearthstone.characters.cards.Minion_Card;
import ir.sharif.math.ap98.hearthstone.game.MatchState;
import ir.sharif.math.ap98.hearthstone.gui.panels.Play.PlayRefrences;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyMiddleCardButton extends MiddleCardButton {
    public MyMiddleCardButton(Card card, int num) {
        super(card,num);
        this.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(MatchState.get().getTurn()== MatchState.EntityType.MY_ENTITY) {
                    setCursor(new Cursor(Cursor.HAND_CURSOR));
                    paintCard(card, 200, 250);
                    setBounds(getX(), getY(), 200, 250);
                }
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                if(MatchState.get().getTurn()== MatchState.EntityType.MY_ENTITY) {
                    paintCard(card, 130, 160);
                    setBounds(getX(), getY(), 130, 160);
                    setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                }
            }
        });
        switch (num){
            case 0:
                this.setBounds(160,320,130,160);
                break;
            case 1:
                this.setBounds(310,320,130,160);
                break;
            case 2:
                this.setBounds(460,320,130,160);
                break;
            case 3:
                this.setBounds(610,320,130,160);
                break;
            case 4:
                this.setBounds(760,320,130,160);
                break;
            case 5:
                this.setBounds(160,470,130,160);
                break;
            case 6:
                this.setBounds(310,470,130,160);
                break;
            default:
                break;
        }
        addActionListener(e -> PlayRefrences.getBottomPanel().getDrawer().drawMinionDialogue((Minion_Card) card));
    }
}
