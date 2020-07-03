package ir.sharif.math.ap98.hearthstone.gui.dialogs;

import ir.sharif.math.ap98.hearthstone.characters.cards.Minion_Card;
import ir.sharif.math.ap98.hearthstone.game.Hand;
import ir.sharif.math.ap98.hearthstone.game.MatchState;
import ir.sharif.math.ap98.hearthstone.gui.Buttons.HandCardButton;

import javax.swing.*;
import java.awt.*;

public abstract class MinionDialog extends JDialog {
    public MinionDialog(Minion_Card attacker) {
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
    }
}
