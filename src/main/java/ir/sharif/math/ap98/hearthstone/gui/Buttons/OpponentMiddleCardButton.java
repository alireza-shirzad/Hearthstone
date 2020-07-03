package ir.sharif.math.ap98.hearthstone.gui.Buttons;

import ir.sharif.math.ap98.hearthstone.characters.cards.Card;
import ir.sharif.math.ap98.hearthstone.characters.cards.Minion_Card;
import ir.sharif.math.ap98.hearthstone.game.MatchState;
import ir.sharif.math.ap98.hearthstone.gui.panels.Play.PlayRefrences;

import java.awt.*;

public class OpponentMiddleCardButton extends MiddleCardButton {
    public OpponentMiddleCardButton(Card card, int num) {
        super(card,num);
        this.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(MatchState.get().getTurn()== MatchState.EntityType.OPONENT_ENTITY) {
                    setCursor(new Cursor(Cursor.HAND_CURSOR));
                    paintCard(card, 200, 250);
                    setBounds(getX(), getY(), 200, 250);
                    setCursor(new Cursor(Cursor.HAND_CURSOR));
                }
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                if(MatchState.get().getTurn()== MatchState.EntityType.OPONENT_ENTITY) {
                    paintCard(card, 130, 160);
                    setBounds(getX(), getY(), 130, 160);
                    setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                }
            }
        });
        switch (num){
            case 0:
                this.setBounds(160,5,130,160);
                break;
            case 1:
                this.setBounds(310,5,130,160);
                break;
            case 2:
                this.setBounds(160,155,130,160);
                break;
            case 3:
                this.setBounds(310,155,130,160);
                break;
            case 4:
                this.setBounds(460,155,130,160);
                break;
            case 5:
                this.setBounds(700,155,130,160);
                break;
            case 6:
                this.setBounds(850,155,130,160);
                break;
            default:
                break;
        }
        addActionListener(e -> PlayRefrences.getUpPanel().getDrawer().drawMinionDialogue((Minion_Card) card));
    }
}
