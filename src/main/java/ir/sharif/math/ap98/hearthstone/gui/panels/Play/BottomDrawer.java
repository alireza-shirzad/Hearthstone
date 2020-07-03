package ir.sharif.math.ap98.hearthstone.gui.panels.Play;

import ir.sharif.math.ap98.hearthstone.characters.cards.Minion_Card;
import ir.sharif.math.ap98.hearthstone.game.Hand;
import ir.sharif.math.ap98.hearthstone.game.MatchState;
import ir.sharif.math.ap98.hearthstone.gui.Buttons.HandCardButton;
import ir.sharif.math.ap98.hearthstone.gui.Buttons.HeroPowerButton;
import ir.sharif.math.ap98.hearthstone.gui.Buttons.MyNextRoundButton;
import ir.sharif.math.ap98.hearthstone.gui.Buttons.ShowHandButton;
import ir.sharif.math.ap98.hearthstone.gui.Drawer;
import ir.sharif.math.ap98.hearthstone.gui.Labels.HeroLabel;
import ir.sharif.math.ap98.hearthstone.gui.dialogs.HandDialog;
import ir.sharif.math.ap98.hearthstone.gui.dialogs.MyMinionDialog;

import javax.swing.*;
import java.awt.*;

public class BottomDrawer extends Drawer {
    private JDialog handDialog;
    private HeroLabel heroLabel;
    private HeroPowerButton heroPowerButton;
    private ShowHandButton showHandButton;
    private MyManaPanel myManaPanel;
    private MyNextRoundButton myNextRoundButton;
    private MyMinionDialog myMinionDialog;
    public BottomDrawer(JPanel jPanel) {
        super(jPanel);
    }
    public void drawHeroLabel(){
        if (heroLabel!=null) jPanel.remove(heroLabel);
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
        showHandButton = new ShowHandButton(MatchState.EntityType.MY_ENTITY);
        showHandButton.setBounds(915,252,130,50);
        jPanel.add(showHandButton);
    }
    public void drawHandDialogue(){
        if (handDialog!=null) handDialog.dispose();
        Hand hand = MatchState.get().getMyEntity().getHand();
        handDialog = new HandDialog(hand, MatchState.EntityType.MY_ENTITY);
    }
    public void drawMana(){
        if(myManaPanel!=null) jPanel.remove(myManaPanel);
        myManaPanel = new MyManaPanel();
        jPanel.add(myManaPanel);
    }
    public void drawMyNextRoundButton(){
        myNextRoundButton = new MyNextRoundButton();
        jPanel.add(myNextRoundButton);
    }
    public void drawMinionDialogue(Minion_Card attacker){
        if (myMinionDialog!=null) myMinionDialog.dispose();
        myMinionDialog = new MyMinionDialog (attacker);
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
    public MyManaPanel getMyManaPanel() {
        return myManaPanel;
    }
    public void setMyManaPanel(MyManaPanel myManaPanel) {
        this.myManaPanel = myManaPanel;
    }
}
