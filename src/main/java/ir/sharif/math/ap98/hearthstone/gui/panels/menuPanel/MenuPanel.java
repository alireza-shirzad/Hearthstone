package ir.sharif.math.ap98.hearthstone.gui.panels.menuPanel;

import ir.sharif.math.ap98.hearthstone.gui.panels.MyPanel;
import ir.sharif.math.ap98.hearthstone.gui.panels.signPanel.SignDrawer;

public class MenuPanel extends MyPanel {
    private MenuDrawer menuDrawer;

    public MenuPanel(){
        super();
        menuDrawer = new MenuDrawer(this);
        design();
    }

    @Override
    public void design() {
        menuDrawer.designHeader("Menu");
        menuDrawer.designOptions();
    }
}
