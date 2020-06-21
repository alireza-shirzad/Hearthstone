package ir.sharif.math.ap98.hearthstone.gui.Buttons;
import ir.sharif.math.ap98.hearthstone.game.GameEntity;
import ir.sharif.math.ap98.hearthstone.game.GameState;
import ir.sharif.math.ap98.hearthstone.game.MatchState;
import ir.sharif.math.ap98.hearthstone.gui.panels.Play.BottomDrawer;
import ir.sharif.math.ap98.hearthstone.gui.panels.Play.PlayRefrences;
import ir.sharif.math.ap98.hearthstone.io.fileOperation.ImageOperater;
import javax.swing.*;
import java.awt.*;

public class ShowHandButton extends MyButton {
    private MatchState.EntityType type;
    public ShowHandButton(MatchState.EntityType type) {
        super("");
        this.type = type;
        this.setHorizontalAlignment(CENTER);
        this.setVerticalAlignment(CENTER);
        this.setForeground(Color.BLACK);
        this.setContentAreaFilled(false);
        this.requestFocus();
        this.setOpaque(false);
        this.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                setCursor(new Cursor(Cursor.HAND_CURSOR));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
            }
        });
        Image img = ImageOperater.getInstance().Read("Hand.png"
                , ImageOperater.imageType.ICON);
        this.setIcon(new ImageIcon(img));
    }

    @Override
    public void press() {
        if(type== MatchState.EntityType.MY_ENTITY){
            PlayRefrences.getBottomPanel().getDrawer().drawHandDialogue();
        }else{
            PlayRefrences.getUpPanel().getDrawer().drawHandDialogue();
        }
    }
}
