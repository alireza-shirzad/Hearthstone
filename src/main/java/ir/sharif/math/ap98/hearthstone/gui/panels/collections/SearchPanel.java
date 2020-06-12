package ir.sharif.math.ap98.hearthstone.gui.panels.collections;

import javax.swing.*;

public class SearchPanel extends SidePanel {
    private SearchDrawer drawer;
    public SearchPanel() {
        super("Search");
        drawer = new SearchDrawer(this);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBounds(850,230,230,250);
        design();
    }

    @Override
    public void design() {
        drawer.designHeroComboBox();
        drawer.designManaComboBox();
        drawer.designSearchField();
    }
}
