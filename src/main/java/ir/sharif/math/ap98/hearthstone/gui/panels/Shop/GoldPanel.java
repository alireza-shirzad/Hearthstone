package ir.sharif.math.ap98.hearthstone.gui.panels.Shop;

import ir.sharif.math.ap98.hearthstone.gui.MainFrame;
import ir.sharif.math.ap98.hearthstone.gui.panels.MyPanel;
import ir.sharif.math.ap98.hearthstone.gui.panels.collections.SearchDrawer;

import javax.swing.*;

public class GoldPanel extends MyPanel {
    private GoldDrawer drawer;
    public GoldPanel(){
        super();
        drawer = new GoldDrawer(this);
        setBounds(600,-30,500,200);
        ShopReferences.setGoldPanel(this);
        design();
    }
    @Override
    public void design() {
        removeAll();
        drawer.designCoin();
        drawer.designGoldNumber();
        MainFrame.getInstance().Update();
    }
}
