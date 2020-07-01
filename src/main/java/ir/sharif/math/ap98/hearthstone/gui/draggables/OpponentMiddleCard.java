package ir.sharif.math.ap98.hearthstone.gui.draggables;

import ir.sharif.math.ap98.hearthstone.characters.cards.Card;

public class OpponentMiddleCard extends MiddleCard {
    public OpponentMiddleCard(Card card, int num) {
        super(card,num);
        switch (num){
            case 0:
                this.setBounds(0,5,130,160);
                break;
            case 1:
                this.setBounds(150,5,130,160);
                break;
            case 2:
                this.setBounds(0,155,130,160);
                break;
            case 3:
                this.setBounds(150,155,130,160);
                break;
            case 4:
                this.setBounds(300,155,130,160);
                break;
            case 5:
                this.setBounds(600,155,130,160);
                break;
            case 6:
                this.setBounds(750,155,130,160);
                break;
            default:
                break;
        }
    }
}
