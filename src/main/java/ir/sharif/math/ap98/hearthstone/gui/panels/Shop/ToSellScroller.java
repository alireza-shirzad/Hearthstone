package ir.sharif.math.ap98.hearthstone.gui.panels.Shop;

import ir.sharif.math.ap98.hearthstone.gui.MyScroller;

import javax.swing.*;

public class ToSellScroller extends MyScroller {
    public ToSellScroller(JPanel jPanel) {
        super(jPanel, "To sell panel");
        setBounds(5,380,1075,250);
        this.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        this.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
    }
}
