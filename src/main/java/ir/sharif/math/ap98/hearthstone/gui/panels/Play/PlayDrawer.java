package ir.sharif.math.ap98.hearthstone.gui.panels.Play;

import ir.sharif.math.ap98.hearthstone.characters.cards.Card;
import ir.sharif.math.ap98.hearthstone.game.MatchState;
import ir.sharif.math.ap98.hearthstone.gui.Buttons.NextRoundButton;
import ir.sharif.math.ap98.hearthstone.gui.Drawer;
import ir.sharif.math.ap98.hearthstone.gui.draggables.MiddleCard;

import javax.swing.*;

public class PlayDrawer extends Drawer {
    private BottomPanel bottomPanel;
    private UpPanel upPanel;
    private CardsPanel cardsPanel;
    public PlayDrawer(JPanel jPanel) {
        super(jPanel);
    }
    public void drawBottomPanel(){
        bottomPanel = new BottomPanel();
        jPanel.add(bottomPanel);
    }
    public void drawUpPanel(){
        upPanel = new UpPanel();
        jPanel.add(upPanel);
    }
    public void drawCardsPanel(){
        if (cardsPanel!=null) PlayRefrences.getPlayPanel().remove(cardsPanel);
        cardsPanel = new CardsPanel();
        jPanel.add(cardsPanel);
    }

}
