package ir.sharif.math.ap98.hearthstone.gui.panels.collections;

import ir.sharif.math.ap98.hearthstone.gui.MyScroller;

import javax.swing.*;

public class CurrentDeckScroller extends MyScroller {
    public CurrentDeckScroller(JPanel jPanel) {
        super(jPanel, "Current Deck");
        setBounds(240,100,620,250);
        this.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        this.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
    }
}
