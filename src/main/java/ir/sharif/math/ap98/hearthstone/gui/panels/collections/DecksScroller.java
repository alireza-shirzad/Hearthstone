package ir.sharif.math.ap98.hearthstone.gui.panels.collections;

import ir.sharif.math.ap98.hearthstone.gui.MyScroller;

import javax.swing.*;

public class DecksScroller extends MyScroller {
    public DecksScroller(JPanel jPanel) {
        super(jPanel, "Decks");
        setBounds(2,100,220,520);
        this.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        this.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    }
}
