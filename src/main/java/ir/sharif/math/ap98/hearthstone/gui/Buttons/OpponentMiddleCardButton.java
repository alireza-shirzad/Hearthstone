package ir.sharif.math.ap98.hearthstone.gui.Buttons;

import ir.sharif.math.ap98.hearthstone.characters.cards.Card;
import ir.sharif.math.ap98.hearthstone.game.MatchState;

public class OpponentMiddleCardButton extends MiddleCardButton {
    public OpponentMiddleCardButton(Card card, int num) {
        super(card,num);
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
    }
}
