package ir.sharif.math.ap98.hearthstone.gui.panels.collections;

public class CollectionsReferences {

    private static DecksPanel decksPanel;
    private static CurrentDeckCardsPanel currentDeckCardsPanel;
    private static SpareCardsPanel spareCardsPanel;
    private static SearchPanel searchPanel;

    public static DecksPanel getDecksPanel() {
        return decksPanel;
    }

    public static void setDecksPanel(DecksPanel decksPanel) {
        CollectionsReferences.decksPanel = decksPanel;
    }

    public static CurrentDeckCardsPanel getCurrentDeckCardsPanel() {
        return currentDeckCardsPanel;
    }

    public static void setCurrentDeckCardsPanel(CurrentDeckCardsPanel currentDeckCardsPanel) {
        CollectionsReferences.currentDeckCardsPanel = currentDeckCardsPanel;
    }

    public static SpareCardsPanel getSpareCardsPanel() {
        return spareCardsPanel;
    }

    public static void setSpareCardsPanel(SpareCardsPanel spareCardsPanel) {
        CollectionsReferences.spareCardsPanel = spareCardsPanel;
    }

    public static SearchPanel getSearchPanel() {
        return searchPanel;
    }

    public static void setSearchPanel(SearchPanel searchPanel) {
        CollectionsReferences.searchPanel = searchPanel;
    }
}
