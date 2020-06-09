package ir.sharif.math.ap98.hearthstone.gui.panels.collections;

import ir.sharif.math.ap98.hearthstone.game.GameState;
import ir.sharif.math.ap98.hearthstone.game.decks.SimpleDeck;
import ir.sharif.math.ap98.hearthstone.gui.Buttons.DeckButton;
import ir.sharif.math.ap98.hearthstone.gui.Drawer;
import ir.sharif.math.ap98.hearthstone.gui.Labels.Header;
import ir.sharif.math.ap98.hearthstone.gui.MainFrame;
import ir.sharif.math.ap98.hearthstone.players.Player;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import static java.awt.Component.CENTER_ALIGNMENT;

public class DecksDrawer extends Drawer {
    public DecksDrawer(JPanel jPanel) {
        super(jPanel);
    }

    public void designDecks(){
        jPanel.removeAll();
        Player player = GameState.getInstance().getCurrentPlayer();
        ArrayList<SimpleDeck> simpleDecks = player.getSimpleDecks();
            for (int i=0; i<simpleDecks.size(); i++) {
            DeckButton deckButton = new DeckButton(simpleDecks.get(i));
            deckButton.setAlignmentX(CENTER_ALIGNMENT);
            jPanel.add(deckButton);
            jPanel.add(Box.createRigidArea(new Dimension(0,15)));
        }
        MainFrame.getInstance().Update();
    }
}
