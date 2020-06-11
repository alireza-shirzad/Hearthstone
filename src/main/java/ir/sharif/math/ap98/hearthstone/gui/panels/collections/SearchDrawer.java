package ir.sharif.math.ap98.hearthstone.gui.panels.collections;

import ir.sharif.math.ap98.hearthstone.characters.cards.Card;
import ir.sharif.math.ap98.hearthstone.characters.heros.Hero;
import ir.sharif.math.ap98.hearthstone.game.GameState;
import ir.sharif.math.ap98.hearthstone.gui.Drawer;
import ir.sharif.math.ap98.hearthstone.gui.GUIConstants;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import static java.awt.Component.CENTER_ALIGNMENT;

public class SearchDrawer extends Drawer {
    private Hero.Type currentHeroLimit;
    private boolean manaLimit;
    private int currentManaLimit;
    private String currentNameLimit;
    public SearchDrawer(JPanel jPanel) {
        super(jPanel);
    }
    public void designHeroComboBox(){
        JLabel ComboLabel = new JLabel("Hero Type:");
        ComboLabel.setFont(new Font(GUIConstants.HEADER1_FONT_NAME, Font.BOLD, 20));
        ComboLabel.setForeground(GUIConstants.COLOR5);
        jPanel.add(ComboLabel);
        String[] HeroStrings = { "Neutral", "Mage", "Rogue", "Warlock"};
        JComboBox HeroList = new JComboBox(HeroStrings);
        HeroList.addActionListener(e -> {
            String s = (String) HeroList.getSelectedItem();//get the selected item
            switch (s) {//check for a match
                case "Neutral":
                    currentHeroLimit = Hero.Type.Neutral;
                    break;
                case "Mage":
                    currentHeroLimit = Hero.Type.Mage;
                    break;
                case "Rogue":
                    currentHeroLimit = Hero.Type.Rogue;
                    break;
                case "Warlock":
                    currentHeroLimit = Hero.Type.Warlock;
                    break;
                default:
                    break;
            }
        });
        jPanel.add(HeroList);
        jPanel.add(Box.createRigidArea(new Dimension(0,15)));
    }

    public void designManaComboBox(){
        JLabel ComboLabel = new JLabel("Mana Filter:");
        ComboLabel.setFont(new Font(GUIConstants.HEADER1_FONT_NAME, Font.BOLD, 20));
        ComboLabel.setForeground(GUIConstants.COLOR5);
        jPanel.add(ComboLabel);
        String[] HeroStrings = { "Off", "0", "1", "2", "3", "4", "5"
                , "6", "7", "8", "9", "10"};
        JComboBox HeroList = new JComboBox(HeroStrings);
        HeroList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = (String) HeroList.getSelectedItem();
                if(s.equals("Off")){
                    manaLimit=false;
                }else {
                    manaLimit = true;
                    currentManaLimit = Integer.parseInt(s);
                }
            }
        });
        jPanel.add(HeroList);
        jPanel.add(Box.createRigidArea(new Dimension(0,25)));
    }


    public void designSearchField(){
        JTextField searchField = new JTextField();
        searchField.setBounds(0,0,100,100);
        JButton jButton = new JButton("Search");
        jButton.setAlignmentX(CENTER_ALIGNMENT);
        jButton.addActionListener(e -> {
            currentNameLimit = searchField.getText();
            setcurrentCards();
        });
        searchField.setPreferredSize(new Dimension(150,20));
        jPanel.add(searchField);
        jPanel.add(Box.createRigidArea(new Dimension(0,15)));
        jPanel.add(jButton);
    }


    private void setcurrentCards(){
        ArrayList<Card> allCards = GameState.getInstance().getCurrentPlayer()
                .getAllCards();
        ArrayList<Card> currentCards = new ArrayList<>();
        for (Card currentCard : allCards) {
            boolean NameMatch = currentCard.getName().contains(currentNameLimit);
            if (currentCard.getManaCost()==currentManaLimit&manaLimit
                    &currentCard.getHeroClass()==currentHeroLimit&NameMatch
                    |currentCard.getHeroClass()==currentHeroLimit&!manaLimit&NameMatch) {
                currentCards.add(currentCard);
            }
        }
    CollectionsReferences.getSpareCardsPanel().update(currentCards);
    }

}
