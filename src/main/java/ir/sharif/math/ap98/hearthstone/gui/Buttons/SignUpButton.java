package ir.sharif.math.ap98.hearthstone.gui.Buttons;

import ir.sharif.math.ap98.hearthstone.gui.BackgroundPanel;
import ir.sharif.math.ap98.hearthstone.gui.panels.signPanel.SignInPanel;
import ir.sharif.math.ap98.hearthstone.gui.panels.signPanel.SignUpPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUpButton extends SignButton {
    public SignUpButton(){
        super("Sign Up");
        this.setBounds(30, 200, 280, 80);
        addActionListener(e -> {
            BackgroundPanel.getInstance().remove(0);
            BackgroundPanel.getInstance().add(new SignUpPanel());
        });
    }
}
