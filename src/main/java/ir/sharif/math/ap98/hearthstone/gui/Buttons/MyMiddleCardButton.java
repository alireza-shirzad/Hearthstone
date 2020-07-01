package ir.sharif.math.ap98.hearthstone.gui.Buttons;

import ir.sharif.math.ap98.hearthstone.characters.cards.Card;
import ir.sharif.math.ap98.hearthstone.game.MatchState;

public class MyMiddleCardButton extends MiddleCardButton {
    public MyMiddleCardButton(Card card, int num) {
        super(card,num);
        switch (num){
            case 0:
                this.setBounds(160,320,130,160);
                break;
            case 1:
                this.setBounds(310,320,130,160);
                break;
            case 2:
                this.setBounds(460,320,130,160);
                break;
            case 3:
                this.setBounds(610,320,130,160);
                break;
            case 4:
                this.setBounds(760,320,130,160);
                break;
            case 5:
                this.setBounds(160,470,130,160);
                break;
            case 6:
                this.setBounds(310,470,130,160);
                break;
            default:
                break;
        }
    }
}
