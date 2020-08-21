package ir.sharif.math.ap98.hearthstone.gui.Buttons;

import ir.sharif.math.ap98.hearthstone.gui.BackgroundPanel;
import ir.sharif.math.ap98.hearthstone.gui.MainFrame;
import ir.sharif.math.ap98.hearthstone.gui.panels.signPanel.SignDrawer;
import ir.sharif.math.ap98.hearthstone.gui.panels.signPanel.SignInPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignInButton extends SignButton {
    public SignInButton(){
        super("Sign In");
        this.setBounds(770, 200, 300, 80);
    }

    @Override
    public void press() {
        BackgroundPanel.getInstance().remove(0);
        BackgroundPanel.getInstance().add(new SignInPanel());
    }
}
