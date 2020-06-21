package ir.sharif.math.ap98.hearthstone.gui.Buttons;

import ir.sharif.math.ap98.hearthstone.characters.cards.Card;
import ir.sharif.math.ap98.hearthstone.game.MatchState;
import ir.sharif.math.ap98.hearthstone.gui.panels.Play.PlayRefrences;

public class HandCardButton extends CardButton {
    private MatchState.EntityType type;
    public HandCardButton(Card card, MatchState.EntityType type) {
        super(card, 150, 200);
        this.type = type;
    }

    @Override
    public void press() {
        if(type== MatchState.EntityType.MY_ENTITY){
            MatchState.get().getMyEntity().playCard(card);
            PlayRefrences.getBottomPanel().getDrawer().drawMana();
        }else{
            MatchState.get().getOponentEntity().playCard(card);
        }
    }
}
