package ir.sharif.math.ap98.hearthstone.gui.panels.Settings;

import ir.sharif.math.ap98.hearthstone.gui.panels.Shop.GoldPanel;
import ir.sharif.math.ap98.hearthstone.gui.panels.Shop.ToBuyPanel;
import ir.sharif.math.ap98.hearthstone.gui.panels.Shop.ToSellPanel;

public class SettingsReferences {

    private static ChangeBGPanel changeBGPanel;
    private static ChangeSoundPanel changeSoundPanel;

    public static ChangeBGPanel getChangeBGPanel() {
        return changeBGPanel;
    }

    public static void setChangeBGPanel(ChangeBGPanel changeBGPanel) {
        SettingsReferences.changeBGPanel = changeBGPanel;
    }

    public static ChangeSoundPanel getChangeSoundPanel() {
        return changeSoundPanel;
    }

    public static void setChangeSoundPanel(ChangeSoundPanel changeSoundPanel) {
        SettingsReferences.changeSoundPanel = changeSoundPanel;
    }
}
