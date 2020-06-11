package ir.sharif.math.ap98.hearthstone.gui.panels.Shop;

import ir.sharif.math.ap98.hearthstone.gui.panels.MyPanel;
import ir.sharif.math.ap98.hearthstone.gui.panels.collections.CollectionsDrawer;

public class ShopPanel extends MyPanel {
    private ShopDrawer drawer;
    public ShopPanel(){
        drawer = new ShopDrawer(this);
        design();
    }
    @Override
    public void design() {
        drawer.designHeader("Shop");
        drawer.designToSellPanel();
        drawer.designToBuyPanel();
    }
}
