package ir.sharif.math.ap98.hearthstone.gui.Buttons;

import ir.sharif.math.ap98.hearthstone.characters.cards.Card;
import ir.sharif.math.ap98.hearthstone.game.GameState;
import ir.sharif.math.ap98.hearthstone.game.decks.Deck;
import ir.sharif.math.ap98.hearthstone.game.decks.SimpleDeck;
import ir.sharif.math.ap98.hearthstone.gui.MainFrame;
import ir.sharif.math.ap98.hearthstone.gui.panels.collections.CollectionsReferences;
import ir.sharif.math.ap98.hearthstone.io.fileOperation.ImageOperater;
import ir.sharif.math.ap98.hearthstone.players.Player;
import ir.sharif.math.ap98.hearthstone.players.PlayerManager;

import javax.swing.*;

public class DeckCardButton extends CardButton {
    public DeckCardButton(Card card, int w, int h) {
        super(card, w, h);
    }

    @Override
    public void press() {
        Object[] options = {"Delete from deck",
                "Sell"};
        int n = JOptionPane.showOptionDialog(MainFrame.getInstance(),
                "What would you like to do with this card?",
                "Deck card",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                new ImageIcon(ImageOperater.getInstance().Read("DeckCard.png", ImageOperater.imageType.ICON)),     //do not use a custom Icon
                options,  //the titles of buttons
                options[0]); //default button title
        switch (n){
            case 0:
                Player currentPlayer = GameState.getInstance().getCurrentPlayer();
                SimpleDeck currentDeck = GameState.getInstance().getCurrentDeck();
                currentDeck.Remove(card);
                currentPlayer.getSpareDeck().Add(card);
                CollectionsReferences.getCurrentDeckCardsPanel().design();
                CollectionsReferences.getSpareCardsPanel().design();
                PlayerManager.getInstance().Save(currentPlayer);
                JOptionPane.showMessageDialog(MainFrame.getInstance(),
                        "Card removed from deck successfully",
                        "Add",
                        JOptionPane.INFORMATION_MESSAGE,
                        new ImageIcon(ImageOperater.getInstance()
                                .Read("DeckCardRemoved.png", ImageOperater.imageType.ICON)));
                MainFrame.getInstance().Update();
                break;
            default:
                break;
        }
    }
}
