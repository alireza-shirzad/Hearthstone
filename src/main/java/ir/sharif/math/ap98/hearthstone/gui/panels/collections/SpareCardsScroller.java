package ir.sharif.math.ap98.hearthstone.gui.panels.collections;

import ir.sharif.math.ap98.hearthstone.gui.MyScroller;

import javax.swing.*;

public class SpareCardsScroller extends MyScroller {
    public SpareCardsScroller(JPanel jPanel) {
        super(jPanel, "Spare deck");
        setBounds(240,370,620,250);
        this.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        this.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
    }
}
