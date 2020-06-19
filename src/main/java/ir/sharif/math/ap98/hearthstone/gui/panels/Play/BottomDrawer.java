package ir.sharif.math.ap98.hearthstone.gui.panels.Play;

import ir.sharif.math.ap98.hearthstone.game.MatchState;
import ir.sharif.math.ap98.hearthstone.gui.Buttons.HeroPowerButton;
import ir.sharif.math.ap98.hearthstone.gui.Buttons.ShowHandButton;
import ir.sharif.math.ap98.hearthstone.gui.Drawer;
import ir.sharif.math.ap98.hearthstone.gui.Labels.HeroLabel;

import javax.swing.*;

public class BottomDrawer extends Drawer {
    private HeroLabel heroLabel;
    private HeroPowerButton heroPowerButton;
    private ShowHandButton showHandButton;
    public BottomDrawer(JPanel jPanel) {
        super(jPanel);
    }
    public void drawHeroLabel(){
        heroLabel = new HeroLabel(MatchState.get().getMyEntity().getHero());
        heroLabel.setBounds(160,170,130,150);
        jPanel.add(heroLabel);
    }
    public void drawHeroPowerButton(){
        heroPowerButton = new HeroPowerButton(MatchState.get().getMyEntity().getHero());
        heroPowerButton.setBounds(62,220,90,80);
        jPanel.add(heroPowerButton);
    }
    public void drawshowHandButton(){
        showHandButton = new ShowHandButton();
        showHandButton.setBounds(915,252,130,50);
        jPanel.add(showHandButton);
    }
}
