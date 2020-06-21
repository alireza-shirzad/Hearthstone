package ir.sharif.math.ap98.hearthstone.gui.panels.Play;
import ir.sharif.math.ap98.hearthstone.game.GameEntity;
import ir.sharif.math.ap98.hearthstone.game.MatchState;
import ir.sharif.math.ap98.hearthstone.gui.Drawer;
import ir.sharif.math.ap98.hearthstone.gui.Labels.ManaLabel;
import javax.swing.*;

public class ManaDrawer extends Drawer {
    private GameEntity gameEntity;
    public ManaDrawer(JPanel jPanel) {
        super(jPanel);
    }
    public void drawManas(MatchState.EntityType type){
        if (type== MatchState.EntityType.MY_ENTITY){
            gameEntity = MatchState.get().getMyEntity();
        }else{
            gameEntity = MatchState.get().getOponentEntity();
        }
        int ShinyMana = gameEntity.getNumOfTurn();
        if (ShinyMana>10) ShinyMana = 10;
        for (int i = 0; i <gameEntity.getNumOfMana() ; i++) {
            jPanel.add(new ManaLabel(ManaLabel.Type.SHINY));
        }

        for (int i = 0; i <ShinyMana - MatchState.get().getMyEntity().getNumOfMana(); i++) {
            jPanel.add(new ManaLabel(ManaLabel.Type.DARK));
        }

    }
}
