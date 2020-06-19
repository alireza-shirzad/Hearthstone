package ir.sharif.math.ap98.hearthstone.gui.panels.Play;

import ir.sharif.math.ap98.hearthstone.game.MatchState;
import ir.sharif.math.ap98.hearthstone.gui.Buttons.HeroPowerButton;
import ir.sharif.math.ap98.hearthstone.gui.Buttons.ShowHandButton;
import ir.sharif.math.ap98.hearthstone.gui.Drawer;
import ir.sharif.math.ap98.hearthstone.gui.Labels.HeroLabel;

import javax.swing.*;

public class UpDrawer extends Drawer {
    private HeroLabel heroLabel;
    private HeroPowerButton heroPowerButton;
    private ShowHandButton showHandButton;
    public UpDrawer(JPanel jPanel) {
        super(jPanel);
    }

    public void drawHeroLabel(){
        heroLabel = new HeroLabel(MatchState.get().getMyEntity().getHero());
        heroLabel.setBounds(160,0,130,150);
        jPanel.add(heroLabel);
    }
    public void drawHeroPowerButton(){
        heroPowerButton = new HeroPowerButton(MatchState.get().getMyEntity().getHero());
        heroPowerButton.setBounds(62,50,90,80);
        jPanel.add(heroPowerButton);
    }
    public void drawshowHandButton(){
        showHandButton = new ShowHandButton();
        showHandButton.setBounds(915,0,130,50);
        jPanel.add(showHandButton);
    }
}
