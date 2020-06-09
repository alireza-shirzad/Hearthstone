package ir.sharif.math.ap98.hearthstone.gui.panels.collections;

import ir.sharif.math.ap98.hearthstone.characters.cards.Card;
import ir.sharif.math.ap98.hearthstone.game.GameState;
import ir.sharif.math.ap98.hearthstone.game.decks.SimpleDeck;
import ir.sharif.math.ap98.hearthstone.gui.Drawer;

import javax.swing.*;
import java.util.ArrayList;

public class CurrentDeckCardsDrawer extends Drawer {
    public CurrentDeckCardsDrawer(JPanel jPanel) {
        super(jPanel);
    }

    public void designCurrentDeckCards() {
        jPanel.removeAll();
        SimpleDeck simpleDeck = GameState.getInstance().getCurrentDeck();
        if (simpleDeck != null) {
            ArrayList<Card> cards = simpleDeck.getCards();
            for (int i = 0; i < cards.size(); i++) {
//                CardButton deckCardButton = new CardButton(cards.get(i));
//                this.add(deckCardButton);
            }
        }
    }
}
