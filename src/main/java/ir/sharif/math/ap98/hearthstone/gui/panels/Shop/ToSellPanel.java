package ir.sharif.math.ap98.hearthstone.gui.panels.Shop;

import ir.sharif.math.ap98.hearthstone.gui.MainFrame;
import ir.sharif.math.ap98.hearthstone.gui.panels.MyPanel;

import java.awt.*;

public class ToSellPanel extends MyPanel {
    private ToSellDrawer drawer;
    public ToSellPanel(){
        ShopReferences.setToSellPanel(this);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        drawer = new ToSellDrawer(this);
        design();
    }
    @Override
    public void design() {
        removeAll();
        drawer.designToSellCards();
        MainFrame.getInstance().Update();
    }
}
