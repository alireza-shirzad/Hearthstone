package ir.sharif.math.ap98.hearthstone.gui.dialogs;

import ir.sharif.math.ap98.hearthstone.characters.cards.Card;
import ir.sharif.math.ap98.hearthstone.characters.cards.Minion_Card;
import ir.sharif.math.ap98.hearthstone.characters.cards.Weapon_Card;
import ir.sharif.math.ap98.hearthstone.game.MatchState;
import ir.sharif.math.ap98.hearthstone.gui.MainFrame;
import ir.sharif.math.ap98.hearthstone.gui.panels.Play.PlayRefrences;
import ir.sharif.math.ap98.hearthstone.io.fileOperation.ImageOperater;

import javax.swing.*;

public class OponentMinonDialog extends MinionDialog {
    public OponentMinonDialog(Minion_Card attacker) {
        super(attacker);
        int numOfMiddleCards = MatchState.get().getMyEntity().getMiddleCards().size();
        Object[] possibilities = new Object[numOfMiddleCards+1];
        possibilities[0] = "Hero: " + MatchState.get().getMyEntity().getHero().getHP();
        for (int i = 0; i <numOfMiddleCards ; i++) {
            Minion_Card minion_card = (Minion_Card) MatchState.get().getMyEntity().getMiddleCards().get(i);
            possibilities[i+1] = i + minion_card.getName() + ": attack = " + minion_card.getAttack() + ", HP= " + minion_card.getHealth();
        }
        String s = (String) JOptionPane.showInputDialog(
                MainFrame.getInstance(),
                "Which character do you want to attack?",
                "Attack",
                JOptionPane.PLAIN_MESSAGE,
                new ImageIcon(ImageOperater.getInstance()
                        .Read("LetsAttack.png", ImageOperater.imageType.ICON)),
                possibilities,
                "Hero");
        if ((s != null) && (s.length() > 0)) {
            s = s.substring(0,4);
            switch (s){
                case "Hero":
                    attacker.attack(MatchState.get().getMyEntity().getHero());
                break;
                default:
                    Card card = MatchState.get().getMyEntity().getMiddleCards().get(Integer.parseInt(s.substring(0,1)));
                    if (card.getCardType()== Card.Type.Minion) {
                        Minion_Card minion_card = (Minion_Card) card;
                        attacker.attack(minion_card);
                        if (minion_card.getHealth()<=0)
                            MatchState.get().getMyEntity().getMiddleCards().remove(card);
                    }
                    else {
                        Weapon_Card weapon_card = (Weapon_Card) card;
                        attacker.attack(weapon_card);
                        if(weapon_card.getDurability()<=0)
                            MatchState.get().getMyEntity().getMiddleCards().remove(card);
                    }
                    break;
            }
        }
        PlayRefrences.getPlayPanel().getDrawer().drawCardsPanel();
        PlayRefrences.getBottomPanel().getDrawer().drawHeroLabel();
    }
}
