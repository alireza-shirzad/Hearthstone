package ir.sharif.math.ap98.hearthstone.gui.Buttons;

import ir.sharif.math.ap98.hearthstone.characters.cards.Card;
import ir.sharif.math.ap98.hearthstone.game.GameState;
import ir.sharif.math.ap98.hearthstone.game.decks.Deck;
import ir.sharif.math.ap98.hearthstone.gui.MainFrame;
import ir.sharif.math.ap98.hearthstone.gui.panels.Shop.ShopPanel;
import ir.sharif.math.ap98.hearthstone.gui.panels.Shop.ShopReferences;
import ir.sharif.math.ap98.hearthstone.gui.panels.Shop.ToSellPanel;
import ir.sharif.math.ap98.hearthstone.io.fileOperation.ImageOperater;
import ir.sharif.math.ap98.hearthstone.players.Player;
import ir.sharif.math.ap98.hearthstone.players.PlayerManager;

import javax.swing.*;

public class ToSellCardButton extends CardButton {
    public ToSellCardButton(Card card, int w, int h) {
        super(card, w, h);
    }

    @Override
    public void press() {
        Object[] options = {"Yes",
                "No"};
        int n = JOptionPane.showOptionDialog(MainFrame.getInstance(),
                "Would you like to sell this card for "
                        + card.getGoldCost() + " coins?",
                "Sell",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                new ImageIcon(ImageOperater.getInstance().Read("ToSellCard.png", ImageOperater.imageType.ICON)),
                options,  //the titles of buttons
                options[0]); //default button title
        if (n == 0) {
            Player currentPlayer = GameState.getInstance().getCurrentPlayer();
            Deck.Result result = currentPlayer.getSpareDeck().Remove(card);
            currentPlayer.setGold(currentPlayer.getGold() + card.getGoldCost());
            //ShopPanel.getInstance().UpdateGold();
            PlayerManager.getInstance().Save(currentPlayer);
            ShopReferences.getToSellPanel().design();
            JOptionPane.showMessageDialog(MainFrame.getInstance(),
                    "Sell was successfull",
                    "Sell",
                    JOptionPane.INFORMATION_MESSAGE,
                    new ImageIcon(ImageOperater.getInstance()
                            .Read("ToSellCardYes.jpg", ImageOperater.imageType.ICON)));
            MainFrame.getInstance().Update();
        }
    }
}
