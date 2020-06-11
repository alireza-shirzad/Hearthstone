package ir.sharif.math.ap98.hearthstone.gui.panels.Shop;

import ir.sharif.math.ap98.hearthstone.gui.MyScroller;

import javax.swing.*;

public class ToBuyScroller extends MyScroller {
    public ToBuyScroller(JPanel jPanel) {
        super(jPanel, "To buy panel");
        setBounds(5,100,1075,250);
        this.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        this.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
    }
}
