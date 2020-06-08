package ir.sharif.math.ap98.hearthstone.gui.Buttons;

import ir.sharif.math.ap98.hearthstone.gui.BackgroundPanel;
import ir.sharif.math.ap98.hearthstone.gui.Labels.Response;
import ir.sharif.math.ap98.hearthstone.gui.panels.menuPanel.MenuPanel;
import ir.sharif.math.ap98.hearthstone.gui.panels.signPanel.SignDrawer;
import ir.sharif.math.ap98.hearthstone.players.SignInManager;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignInCommitButton extends SignCommitButton {
    private SignDrawer signDrawer;

    public SignInCommitButton(JTextField jTextField, JPasswordField jPasswordField, SignDrawer signDrawer) {
        super("Sign In", jTextField, jPasswordField, signDrawer);
        this.signDrawer = signDrawer;
    }
    public void press(){
        String username = jTextField.getText();
        String password = new String(jPasswordField.getPassword());
        SignInManager.Result result = SignInManager.getInstance().signIn(username,password);
        switch (result){
            case Success:
                signDrawer.designResponse("SignIn successful", Response.type.SUCCESS);
                Timer timer = new Timer(1000, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        BackgroundPanel.getInstance().removeAll();
                        BackgroundPanel.getInstance().add(new MenuPanel());
                    }
                });
                timer.setRepeats(false);
                timer.start();
                break;
            case Error_UsernameNotFound:
                signDrawer.designResponse("Username not found", Response.type.ERROR);
                break;
            case Error_WrongPassword:
                signDrawer.designResponse("Wrong Password", Response.type.ERROR);
                break;
        }
    }
}
