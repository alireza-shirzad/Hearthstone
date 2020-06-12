package ir.sharif.math.ap98.hearthstone.gui.panels.Shop;

import ir.sharif.math.ap98.hearthstone.gui.panels.collections.CurrentDeckCardsPanel;
import ir.sharif.math.ap98.hearthstone.gui.panels.collections.DecksPanel;
import ir.sharif.math.ap98.hearthstone.gui.panels.collections.SearchPanel;
import ir.sharif.math.ap98.hearthstone.gui.panels.collections.SpareCardsPanel;

public class ShopReferences {

    private static ToBuyPanel toBuyPanel;
    private static ToSellPanel toSellPanel;
    private static GoldPanel goldPanel;

    public static GoldPanel getGoldPanel() {
        return goldPanel;
    }

    public static void setGoldPanel(GoldPanel goldPanel) {
        ShopReferences.goldPanel = goldPanel;
    }

    public static ToBuyPanel getToBuyPanel() {
        return toBuyPanel;
    }

    public static void setToBuyPanel(ToBuyPanel toBuyPanel) {
        ShopReferences.toBuyPanel = toBuyPanel;
    }

    public static ToSellPanel getToSellPanel() {
        return toSellPanel;
    }

    public static void setToSellPanel(ToSellPanel toSellPanel) {
        ShopReferences.toSellPanel = toSellPanel;
    }
}
