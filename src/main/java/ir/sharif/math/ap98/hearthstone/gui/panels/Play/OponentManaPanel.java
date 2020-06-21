package ir.sharif.math.ap98.hearthstone.gui.panels.Play;

import ir.sharif.math.ap98.hearthstone.game.MatchState;
import ir.sharif.math.ap98.hearthstone.gui.panels.MyPanel;

import javax.swing.*;
import java.awt.*;

public class OponentManaPanel extends MyPanel {
    private ManaDrawer drawer;
    public OponentManaPanel(){
        drawer = new ManaDrawer(this);
        this.setBounds(658,100,500,200);
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        design();
    }
    @Override
    public void design() {
        drawer.drawManas(MatchState.EntityType.OPONENT_ENTITY);
    }
}
