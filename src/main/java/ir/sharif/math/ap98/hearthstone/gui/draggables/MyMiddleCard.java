package ir.sharif.math.ap98.hearthstone.gui.draggables;

import ir.sharif.math.ap98.hearthstone.characters.cards.Card;
import ir.sharif.math.ap98.hearthstone.game.MatchState;

import javax.swing.*;
import java.awt.*;

public class MyMiddleCard extends MiddleCard {
    public MyMiddleCard(Card card, int num) {
        super(card,num);
        lockDnD(MatchState.EntityType.MY_ENTITY);
        switch (num){
            case 0:
                this.setBounds(0,320,130,160);
                break;
            case 1:
                this.setBounds(150,320,130,160);
                break;
            case 2:
                this.setBounds(300,320,130,160);
                break;
            case 3:
                this.setBounds(450,320,130,160);
                break;
            case 4:
                this.setBounds(600,320,130,160);
                break;
            case 5:
                this.setBounds(0,470,130,160);
                break;
            case 6:
                this.setBounds(150,470,130,160);
                break;
            default:
                break;
        }
    }
}
