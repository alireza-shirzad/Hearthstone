package ir.sharif.math.ap98.hearthstone.gui.panels.PrePlay;

import ir.sharif.math.ap98.hearthstone.gui.panels.Shop.GoldPanel;
import ir.sharif.math.ap98.hearthstone.gui.panels.Shop.ToBuyPanel;
import ir.sharif.math.ap98.hearthstone.gui.panels.Shop.ToSellPanel;

public class PrePlayRefrences {

    private static PassivePanel passivePanel;
    private static HandChoosePanel handChoosePanel;

    public static PassivePanel getPassivePanel() {
        return passivePanel;
    }

    public static void setPassivePanel(PassivePanel passivePanel) {
        PrePlayRefrences.passivePanel = passivePanel;
    }

    public static HandChoosePanel getHandChoosePanel() {
        return handChoosePanel;
    }

    public static void setHandChoosePanel(HandChoosePanel handChoosePanel) {
        PrePlayRefrences.handChoosePanel = handChoosePanel;
    }
}
