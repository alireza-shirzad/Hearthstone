package ir.sharif.math.ap98.hearthstone.gui.Buttons;

import ir.sharif.math.ap98.hearthstone.game.GameState;
import ir.sharif.math.ap98.hearthstone.game.decks.SimpleDeck;
import ir.sharif.math.ap98.hearthstone.gui.GUIConstants;
import ir.sharif.math.ap98.hearthstone.gui.MainFrame;
import ir.sharif.math.ap98.hearthstone.io.fileOperation.ImageOperater;

import javax.swing.*;
import java.awt.*;
import java.awt.font.TextAttribute;
import java.util.Map;

public class DeckButton extends MyButton {
    private SimpleDeck simpleDeck;
    public DeckButton(SimpleDeck simpleDeck) {
        super(simpleDeck.getName());
        this.simpleDeck = simpleDeck;
        setHorizontalAlignment(CENTER);
        setVerticalAlignment(CENTER);
        setHorizontalTextPosition(CENTER);
        setVerticalTextPosition(CENTER);
        setForeground(GUIConstants.COLOR2);
        setFont(new Font(GUIConstants.HEADER1_FONT_NAME, Font.ITALIC, 15));
        Image img = ImageOperater.getInstance().Read(simpleDeck.getHeroType() + ".png"
                , ImageOperater.imageType.DECK);
        this.setIcon(new ImageIcon(img));
        setBorder(BorderFactory.createLineBorder(GUIConstants.COLOR5,2,true));
        this.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                setBorder(BorderFactory.createLineBorder(GUIConstants.COLOR5,4,true));
                setCursor(new Cursor(Cursor.HAND_CURSOR));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                setBorder(BorderFactory.createLineBorder(GUIConstants.COLOR5,2,true));
                setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });
    }

    @Override
    public void press() {
        GameState.getInstance().setCurrentDeck(simpleDeck);
//        DeckCardsPanel.getInstance().Update();
//        DeckOptionPanel.getInstance().Update();
        MainFrame.getInstance().Update();
    }
}
