package ir.sharif.math.ap98.hearthstone.gui.Buttons;

import ir.sharif.math.ap98.hearthstone.characters.cards.Card;
import ir.sharif.math.ap98.hearthstone.game.GameEntity;
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
        GameEntity.PlayCardResult result;
        if(type== MatchState.EntityType.MY_ENTITY
                & MatchState.get().getTurn()== MatchState.EntityType.MY_ENTITY){
            result = MatchState.get().getMyEntity().playCard(card);
            if(result== GameEntity.PlayCardResult.SUCCESS)
                PlayRefrences.getBottomPanel().getDrawer().drawMana();
        }else if (type== MatchState.EntityType.OPONENT_ENTITY
                & MatchState.get().getTurn()== MatchState.EntityType.OPONENT_ENTITY){
            result = MatchState.get().getOponentEntity().playCard(card);
            if(result== GameEntity.PlayCardResult.SUCCESS)
                PlayRefrences.getUpPanel().getDrawer().drawMana();
        }
    }
}
