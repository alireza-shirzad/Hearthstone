package ir.sharif.math.ap98.hearthstone.gui.Buttons;

import ir.sharif.math.ap98.hearthstone.characters.cards.Card;
import ir.sharif.math.ap98.hearthstone.gui.MainFrame;
import ir.sharif.math.ap98.hearthstone.io.fileOperation.ImageOperater;

import javax.swing.*;

public class HandChooseCardButton extends CardButton {
    public HandChooseCardButton(Card card, int w, int h) {
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
    }
}
