package ir.sharif.math.ap98.hearthstone.gui.panels.Shop;

import ir.sharif.math.ap98.hearthstone.characters.cards.Card;
import ir.sharif.math.ap98.hearthstone.characters.cards.CardFactory;
import ir.sharif.math.ap98.hearthstone.game.GameState;
import ir.sharif.math.ap98.hearthstone.game.decks.SimpleDeck;
import ir.sharif.math.ap98.hearthstone.gui.Buttons.CardButton;
import ir.sharif.math.ap98.hearthstone.gui.Buttons.DeckCardButton;
import ir.sharif.math.ap98.hearthstone.gui.Buttons.ToBuyCardButton;
import ir.sharif.math.ap98.hearthstone.gui.Drawer;
import ir.sharif.math.ap98.hearthstone.gui.MainFrame;

import javax.swing.*;
import java.util.ArrayList;

public class ToBuyDrawer extends Drawer {
    public ToBuyDrawer(JPanel jPanel) {
        super(jPanel);
    }
    public void designToBuyCards(){
        jPanel.removeAll();
        ArrayList<Card> cards = CardFactory.getInstance().makeAllCards();
        for (Card card : cards) {
            jPanel.add(new ToBuyCardButton(card,130,180));
        }
        MainFrame.getInstance().Update();
    }
}
