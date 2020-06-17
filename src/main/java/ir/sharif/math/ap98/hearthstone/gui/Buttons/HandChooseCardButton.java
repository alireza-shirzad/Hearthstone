package ir.sharif.math.ap98.hearthstone.gui.Buttons;

import ir.sharif.math.ap98.hearthstone.characters.cards.Card;
import ir.sharif.math.ap98.hearthstone.game.GameState;
import ir.sharif.math.ap98.hearthstone.gui.BackgroundPanel;
import ir.sharif.math.ap98.hearthstone.gui.MainFrame;
import ir.sharif.math.ap98.hearthstone.gui.panels.PrePlay.PrePlayRefrences;
import ir.sharif.math.ap98.hearthstone.io.fileOperation.ImageOperater;

import javax.swing.*;

public class HandChooseCardButton extends CardButton {
    public HandChooseCardButton(Card card, int w, int h) {
        super(card, w, h);
    }

    @Override
    public void press() {
        if(GameState.getInstance().isCanChangeHand()) {
            Object[] options = {"Yes",
                    "No"};
            int n = JOptionPane.showOptionDialog(MainFrame.getInstance(),
                    "Would you like to change this card?",
                    "Hand",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    new ImageIcon(ImageOperater.getInstance().Read("DeckCard.png", ImageOperater.imageType.ICON)),     //do not use a custom Icon
                    options,  //the titles of buttons
                    options[0]); //default button title
            if(n==0){
                GameState.getInstance().setCanChangeHand(false);
                GameState.getInstance().getHand().returnCard(card);
                GameState.getInstance().getHand().addRandom();
                PrePlayRefrences.getHandChoosePanel().design();
                MainFrame.getInstance().Update();
            }
        }else {
            JOptionPane.showMessageDialog(MainFrame.getInstance(),
                    "Error: You can't change your hand anymore!",
                    "Hand",
                    JOptionPane.INFORMATION_MESSAGE,
                    new ImageIcon(ImageOperater.getInstance()
                            .Read("Error.png", ImageOperater.imageType.ICON)));
        }
    }
}
