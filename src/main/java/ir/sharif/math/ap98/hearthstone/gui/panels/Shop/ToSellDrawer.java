package ir.sharif.math.ap98.hearthstone.gui.panels.Shop;

import ir.sharif.math.ap98.hearthstone.characters.cards.Card;
import ir.sharif.math.ap98.hearthstone.characters.cards.CardFactory;
import ir.sharif.math.ap98.hearthstone.game.GameState;
import ir.sharif.math.ap98.hearthstone.gui.Buttons.ToBuyCardButton;
import ir.sharif.math.ap98.hearthstone.gui.Buttons.ToSellCardButton;
import ir.sharif.math.ap98.hearthstone.gui.Drawer;
import ir.sharif.math.ap98.hearthstone.gui.MainFrame;

import javax.swing.*;
import java.util.ArrayList;

public class ToSellDrawer extends Drawer {
    public ToSellDrawer(JPanel jPanel) {
        super(jPanel);
    }
    public void designToSellCards(){
        jPanel.removeAll();
        ArrayList<Card> cards = GameState.getInstance()
                .getCurrentPlayer().getSpareDeck().getCards();
        for (Card card : cards) {
            jPanel.add(new ToSellCardButton(card,130,180));
        }
        MainFrame.getInstance().Update();
    }
}
