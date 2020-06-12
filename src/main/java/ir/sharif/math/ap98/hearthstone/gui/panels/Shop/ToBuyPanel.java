package ir.sharif.math.ap98.hearthstone.gui.panels.Shop;

import ir.sharif.math.ap98.hearthstone.gui.MainFrame;
import ir.sharif.math.ap98.hearthstone.gui.panels.MyPanel;

import java.awt.*;

public class ToBuyPanel extends MyPanel {
    private ToBuyDrawer drawer;
    public ToBuyPanel(){
        ShopReferences.setToBuyPanel(this);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        drawer = new ToBuyDrawer(this);
        design();
    }
    @Override
    public void design() {
        removeAll();
        drawer.designToBuyCards();
        MainFrame.getInstance().Update();
    }
}
