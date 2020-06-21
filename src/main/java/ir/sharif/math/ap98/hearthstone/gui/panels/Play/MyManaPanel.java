package ir.sharif.math.ap98.hearthstone.gui.panels.Play;

import ir.sharif.math.ap98.hearthstone.game.MatchState;
import ir.sharif.math.ap98.hearthstone.gui.panels.MyPanel;
import java.awt.*;

public class MyManaPanel extends MyPanel {
    private ManaDrawer drawer;
    public MyManaPanel(){
        drawer = new ManaDrawer(this);
        this.setBounds(658,185,500,200);
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        design();
    }
    @Override
    public void design() {
        drawer.drawManas(MatchState.EntityType.MY_ENTITY);
    }
}
