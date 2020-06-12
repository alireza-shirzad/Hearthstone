package ir.sharif.math.ap98.hearthstone.gui.Buttons;

import ir.sharif.math.ap98.hearthstone.characters.cards.Card;
import ir.sharif.math.ap98.hearthstone.game.GameState;
import ir.sharif.math.ap98.hearthstone.game.decks.Deck;
import ir.sharif.math.ap98.hearthstone.gui.MainFrame;
import ir.sharif.math.ap98.hearthstone.gui.panels.Shop.ShopReferences;
import ir.sharif.math.ap98.hearthstone.io.fileOperation.ImageOperater;
import ir.sharif.math.ap98.hearthstone.players.Player;
import ir.sharif.math.ap98.hearthstone.players.PlayerManager;

import javax.swing.*;

public class ToBuyCardButton extends CardButton {
    public ToBuyCardButton(Card card, int w, int h) {
        super(card, w, h);
    }

    @Override
    public void press() {
        Object[] options = {"Yes",
                "No"};
        int n = JOptionPane.showOptionDialog(MainFrame.getInstance(),
                "Would you like to buy this card for " + card.getGoldCost()+" coins?",
                "Buy",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                new ImageIcon(ImageOperater.getInstance()
                        .Read("ToBuyCard.jpg", ImageOperater.imageType.ICON)),
                options,  //the titles of buttons
                options[0]); //default button title
        if (n==0) {
            Player currentPlayer = GameState.getInstance().getCurrentPlayer();
            if (currentPlayer.getGold()>=card.getGoldCost()){
                currentPlayer.getSpareDeck().Add(card);
                currentPlayer.setGold(currentPlayer.getGold()-card.getGoldCost());
                ShopReferences.getGoldPanel().design();
                ShopReferences.getToSellPanel().design();
                PlayerManager.getInstance().Save(currentPlayer);
                JOptionPane.showMessageDialog(MainFrame.getInstance(),
                        "Purchase was successfull",
                        "Buy",
                        JOptionPane.INFORMATION_MESSAGE,
                        new ImageIcon(ImageOperater.getInstance()
                                .Read("ToBuyCardYes.jpg", ImageOperater.imageType.ICON)));
            }else{
                JOptionPane.showMessageDialog(MainFrame.getInstance(),
                        "Error: You don't have enough gold",
                        "Buy",
                        JOptionPane.INFORMATION_MESSAGE,
                        new ImageIcon(ImageOperater.getInstance()
                                .Read("Error.png", ImageOperater.imageType.ICON)));
            }
            MainFrame.getInstance().Update();
        }
    }
}
