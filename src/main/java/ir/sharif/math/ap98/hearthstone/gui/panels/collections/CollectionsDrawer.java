package ir.sharif.math.ap98.hearthstone.gui.panels.collections;

import ir.sharif.math.ap98.hearthstone.gui.Drawer;
import ir.sharif.math.ap98.hearthstone.gui.Labels.Header;
import ir.sharif.math.ap98.hearthstone.gui.MainFrame;
import ir.sharif.math.ap98.hearthstone.gui.panels.MyPanel;

import javax.swing.*;

public class CollectionsDrawer extends Drawer {
    private Header header;
    private DecksScroller decksScroller;
    private SpareCardsScroller spareCardsScroller;
    private CurrentDeckScroller currentDeckScroller;
    private SearchPanel searchPanel;
    public CollectionsDrawer(JPanel jPanel) {
        super(jPanel);
    }
    public void designHeader(String labelString){
        header = new Header(labelString);
        header.setBounds(0,5,800,70);
        jPanel.add(header);
        MainFrame.getInstance().Update();
    }
    public void designDecksPanels(){
        decksScroller = new DecksScroller(new DecksPanel());
        jPanel.add(decksScroller);
    }
    public void designSpareCardsPanel(){
        currentDeckScroller = new CurrentDeckScroller(new CurrentDeckCardsPanel());
        jPanel.add(currentDeckScroller);
    }
    public void designCurrentDeckCards(){
        spareCardsScroller = new SpareCardsScroller(new SpareCardsPanel());
        jPanel.add(spareCardsScroller);
    }
    public void designSearchPanel(){

    }
}
