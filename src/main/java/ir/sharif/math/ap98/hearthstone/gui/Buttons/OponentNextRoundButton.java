package ir.sharif.math.ap98.hearthstone.gui.Buttons;

import ir.sharif.math.ap98.hearthstone.game.MatchState;
import ir.sharif.math.ap98.hearthstone.gui.GUIConstants;
import ir.sharif.math.ap98.hearthstone.gui.panels.Play.PlayRefrences;

import javax.swing.*;
import java.awt.*;

public class OponentNextRoundButton extends NextRoundButton {
    public OponentNextRoundButton(){
        super();
        setBounds(15,247,290,50);
        this.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(MatchState.get().getTurn()== MatchState.EntityType.OPONENT_ENTITY) {
                    setBorder(BorderFactory.createLineBorder(GUIConstants.COLOR5, 5, true));
                    setCursor(new Cursor(Cursor.HAND_CURSOR));
                }else{
                    setBorder(BorderFactory.createEmptyBorder());
                    setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                if(MatchState.get().getTurn()== MatchState.EntityType.OPONENT_ENTITY)
                setBorder(BorderFactory.createEmptyBorder());
            }
        });
    }
    @Override
    public void press() {
        setBorder(BorderFactory.createEmptyBorder());
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        if(MatchState.get().getTurn()== MatchState.EntityType.OPONENT_ENTITY) {
            MatchState.get().getOponentEntity().nextTurn();
            PlayRefrences.getUpPanel().getDrawer().drawMana();
            //DesignHand();
            if (PlayRefrences.getUpPanel().getDrawer().getHandDialog() != null)
                PlayRefrences.getUpPanel().getDrawer().getHandDialog().dispose();
            MatchState.get().setTurn(MatchState.EntityType.MY_ENTITY);
        }
    }
}
