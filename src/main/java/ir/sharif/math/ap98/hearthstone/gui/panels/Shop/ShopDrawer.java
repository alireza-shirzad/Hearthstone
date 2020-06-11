package ir.sharif.math.ap98.hearthstone.gui.panels.Shop;

import ir.sharif.math.ap98.hearthstone.gui.Drawer;
import ir.sharif.math.ap98.hearthstone.gui.Labels.Header;
import ir.sharif.math.ap98.hearthstone.gui.MainFrame;
import ir.sharif.math.ap98.hearthstone.gui.panels.collections.*;

import javax.swing.*;

public class ShopDrawer extends Drawer {
    private Header header;
    private ToBuyScroller toBuyScroller;
    private ToSellScroller toSellScroller;

    public ShopDrawer(JPanel jPanel) {
        super(jPanel);
    }
    public void designHeader(String labelString){
        header = new Header(labelString);
        header.setBounds(0,5,800,70);
        jPanel.add(header);
        MainFrame.getInstance().Update();
    }
    public void designToSellPanel(){
        toSellScroller = new ToSellScroller(new ToSellPanel());
        jPanel.add(toSellScroller);
    }
    public void designToBuyPanel(){
        toBuyScroller = new ToBuyScroller(new ToBuyPanel());
        jPanel.add(toBuyScroller);
    }
}
