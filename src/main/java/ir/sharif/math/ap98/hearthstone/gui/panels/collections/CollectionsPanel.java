package ir.sharif.math.ap98.hearthstone.gui.panels.collections;

import ir.sharif.math.ap98.hearthstone.gui.MainFrame;
import ir.sharif.math.ap98.hearthstone.gui.panels.MyPanel;

public class CollectionsPanel extends MyPanel {
    private CollectionsDrawer drawer;
    public CollectionsPanel(){
        drawer = new CollectionsDrawer(this);
        design();
    }
    @Override
    public void design() {
        drawer.designHeader("Collections");
        drawer.designDecksPanels();
        drawer.designCurrentDeckCards();
        drawer.designSpareCardsPanel();
        drawer.designSearchPanel();
        drawer.designBackButton();
        MainFrame.getInstance().Update();
    }
}
