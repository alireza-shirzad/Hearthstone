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

public class SpareCardButton extends CardButton {
    public SpareCardButton(Card card, int w, int h) {
        super(card, w, h);
    }

    @Override
    public void press() {
        Object[] options = {"Add to deck",
                "Sell"};
        int n = JOptionPane.showOptionDialog(MainFrame.getInstance(),
                "What would you like to do with this card?",
                "Spare Card",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                new ImageIcon(ImageOperater.getInstance().Read("SpareCard.jpg", ImageOperater.imageType.ICON)),     //do not use a custom Icon
                options,  //the titles of buttons
                options[0]); //default button title
        SimpleDeck currentDeck = GameState.getInstance().getCurrentDeck();
        switch (n){
            case 0:
                if(currentDeck==null){
                    JOptionPane.showMessageDialog(MainFrame.getInstance(),
                            "Error: No deck has been chosen",
                            "Add",
                            JOptionPane.INFORMATION_MESSAGE,
                            new ImageIcon(ImageOperater.getInstance()
                                    .Read("Error.png", ImageOperater.imageType.ICON)));
                    MainFrame.getInstance().Update();
                }else{
                    Player currentPlayer = GameState.getInstance().getCurrentPlayer();
                    Deck.Result result = currentDeck.Add(card);
                    switch (result){
                        case Sucess:
                            currentPlayer.getSpareDeck().Remove(card);
                            CollectionsReferences.getCurrentDeckCardsPanel().design();
                            CollectionsReferences.getSpareCardsPanel().design();
                            for (SimpleDeck simpleDeck : currentPlayer.getSimpleDecks()) {
                                if (simpleDeck.getName().equals(currentDeck.getName()))
                                    simpleDeck = currentDeck;
                            }
                            PlayerManager.getInstance().Save(currentPlayer);
                            JOptionPane.showMessageDialog(MainFrame.getInstance(),
                                    "Card added to deck successfully",
                                    "Add",
                                    JOptionPane.INFORMATION_MESSAGE,
                                    new ImageIcon(ImageOperater.getInstance()
                                            .Read("SpareCardAdd.jpg", ImageOperater.imageType.ICON)));
                            MainFrame.getInstance().Update();
                            break;
                        case Error_DeckFull:
                            JOptionPane.showMessageDialog(MainFrame.getInstance(),
                                    "Error: Deck is full",
                                    "Add",
                                    JOptionPane.INFORMATION_MESSAGE,
                                    new ImageIcon(ImageOperater.getInstance()
                                            .Read("Error.png", ImageOperater.imageType.ICON)));
                            MainFrame.getInstance().Update();
                            break;
                        case Error_HeroNotMatch:
                            JOptionPane.showMessageDialog(MainFrame.getInstance(),
                                    "Error: Hero mismatch",
                                    "Add",
                                    JOptionPane.INFORMATION_MESSAGE,
                                    new ImageIcon(ImageOperater.getInstance()
                                            .Read("Error.png", ImageOperater.imageType.ICON)));
                            MainFrame.getInstance().Update();
                            break;
                        case Error_DeckLimit:
                            JOptionPane.showMessageDialog(MainFrame.getInstance(),
                                    "Error: You can not have more than two of this card",
                                    "Add",
                                    JOptionPane.INFORMATION_MESSAGE,
                                    new ImageIcon(ImageOperater.getInstance()
                                            .Read("Error.png", ImageOperater.imageType.ICON)));
                            MainFrame.getInstance().Update();
                            break;
                    }
                }
                break;
            case 1:
                //DeckManager.getInstance().DirectSell();
                break;
            default:
                break;
        }
    }
}
