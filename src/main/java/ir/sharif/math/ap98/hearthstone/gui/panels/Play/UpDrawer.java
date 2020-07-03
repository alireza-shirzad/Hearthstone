package ir.sharif.math.ap98.hearthstone.gui.panels.Play;

import ir.sharif.math.ap98.hearthstone.characters.cards.Minion_Card;
import ir.sharif.math.ap98.hearthstone.game.Hand;
import ir.sharif.math.ap98.hearthstone.game.MatchState;
import ir.sharif.math.ap98.hearthstone.gui.Buttons.*;
import ir.sharif.math.ap98.hearthstone.gui.Drawer;
import ir.sharif.math.ap98.hearthstone.gui.Labels.HeroLabel;
import ir.sharif.math.ap98.hearthstone.gui.dialogs.HandDialog;
import ir.sharif.math.ap98.hearthstone.gui.dialogs.MyMinionDialog;
import ir.sharif.math.ap98.hearthstone.gui.dialogs.OponentMinonDialog;

import javax.swing.*;
import java.awt.*;

public class UpDrawer extends Drawer {
    private JDialog handDialog;
    private HeroLabel heroLabel;
    private HeroPowerButton heroPowerButton;
    private ShowHandButton showHandButton;
    private OponentManaPanel oponentManaPanel;
    private OponentNextRoundButton oponentNextRoundButton;
    private OponentMinonDialog oponentMinonDialog;

    public UpDrawer(JPanel jPanel) {
        super(jPanel);
    }

    public void drawHeroLabel(){
        if (heroLabel!=null) jPanel.remove(heroLabel);
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
        showHandButton = new ShowHandButton(MatchState.EntityType.OPONENT_ENTITY);
        showHandButton.setBounds(915,0,130,50);
        jPanel.add(showHandButton);
    }

    public void drawHandDialogue(){
        if (handDialog!=null) handDialog.dispose();
        Hand hand = MatchState.get().getOponentEntity().getHand();
        handDialog = new HandDialog(hand, MatchState.EntityType.OPONENT_ENTITY);
    }

    public void drawMana(){
        if(oponentManaPanel!=null) jPanel.remove(oponentManaPanel);
        oponentManaPanel = new OponentManaPanel();
        jPanel.add(oponentManaPanel);
    }
    public void drawOponentNextRoundButton(){
        oponentNextRoundButton = new OponentNextRoundButton();
        jPanel.add(oponentNextRoundButton);
    }

    public void drawMinionDialogue(Minion_Card attacker){
        if (oponentMinonDialog!=null) oponentMinonDialog.dispose();
        oponentMinonDialog = new OponentMinonDialog(attacker);
    }


    public JDialog getHandDialog() {
        return handDialog;
    }
    public void setHandDialog(JDialog handDialog) {
        this.handDialog = handDialog;
    }
    public HeroLabel getHeroLabel() {
        return heroLabel;
    }
    public void setHeroLabel(HeroLabel heroLabel) {
        this.heroLabel = heroLabel;
    }
    public HeroPowerButton getHeroPowerButton() {
        return heroPowerButton;
    }
    public void setHeroPowerButton(HeroPowerButton heroPowerButton) {
        this.heroPowerButton = heroPowerButton;
    }
    public ShowHandButton getShowHandButton() {
        return showHandButton;
    }
    public void setShowHandButton(ShowHandButton showHandButton) {
        this.showHandButton = showHandButton;
    }
    public OponentManaPanel getOponentManaPanel() {
        return oponentManaPanel;
    }
    public void setOponentManaPanel(OponentManaPanel oponentManaPanel) {
        this.oponentManaPanel = oponentManaPanel;
    }
    public OponentNextRoundButton getOponentNextRoundButton() {
        return oponentNextRoundButton;
    }
    public void setOponentNextRoundButton(OponentNextRoundButton oponentNextRoundButton) {
        this.oponentNextRoundButton = oponentNextRoundButton;
    }
}
