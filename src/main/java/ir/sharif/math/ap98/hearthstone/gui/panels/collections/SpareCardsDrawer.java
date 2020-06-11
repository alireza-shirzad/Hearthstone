package ir.sharif.math.ap98.hearthstone.gui.panels.collections;

import ir.sharif.math.ap98.hearthstone.characters.cards.Card;
import ir.sharif.math.ap98.hearthstone.game.GameState;
import ir.sharif.math.ap98.hearthstone.game.decks.SimpleDeck;
import ir.sharif.math.ap98.hearthstone.game.decks.SpareDeck;
import ir.sharif.math.ap98.hearthstone.gui.Buttons.CardButton;
import ir.sharif.math.ap98.hearthstone.gui.Buttons.SpareCardButton;
import ir.sharif.math.ap98.hearthstone.gui.Drawer;
import ir.sharif.math.ap98.hearthstone.gui.MainFrame;

import javax.swing.*;
import java.util.ArrayList;

public class SpareCardsDrawer extends Drawer {
    public SpareCardsDrawer(JPanel jPanel) {
        super(jPanel);
    }

    public void designSpareCards(ArrayList<Card> toDrawCards, boolean defaultCards) {
        jPanel.removeAll();
        if (defaultCards) {
            SpareDeck spareDeck = GameState.getInstance().getCurrentPlayer().getSpareDeck();
            if (spareDeck != null) {
                ArrayList<Card> cards = spareDeck.getCards();
                for (int i = 0; i < cards.size(); i++) {
                    CardButton deckCardButton = new SpareCardButton(cards.get(i), 130, 180);
                    jPanel.add(deckCardButton);
                }
            }
        } else {
            for (int i = 0; i < toDrawCards.size(); i++) {
                CardButton deckCardButton = new SpareCardButton(toDrawCards.get(i), 130, 180);
                jPanel.add(deckCardButton);
            }
            MainFrame.getInstance().Update();
        }
    }
}
