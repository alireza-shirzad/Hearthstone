package ir.sharif.math.ap98.hearthstone.gui.Buttons;

import ir.sharif.math.ap98.hearthstone.gui.Labels.Response;
import ir.sharif.math.ap98.hearthstone.gui.panels.signPanel.SignDrawer;
import ir.sharif.math.ap98.hearthstone.players.SignInManager;
import ir.sharif.math.ap98.hearthstone.players.SignUpManager;

import javax.swing.*;

public class SignUpCommitButton extends SignCommitButton {
    public SignUpCommitButton(JTextField jTextField, JPasswordField jPasswordField, SignDrawer signDrawer) {
        super("Sign Up", jTextField, jPasswordField, signDrawer);
        addActionListener(e -> {
            String username = jTextField.getText();
            String password = new String(jPasswordField.getPassword());
            if (username.equals("")){
                signDrawer.designResponse("username field is empty", Response.type.ERROR);
            }else{
                SignUpManager.Result result = SignUpManager.getInstance().signUp(username,password);
                switch (result){
                    case Success:
                            signDrawer.designResponse("SignUp successful", Response.type.SUCCESS);
                        break;
                    case Error_UsernameAlreadyUsed:
                            signDrawer.designResponse("Username already taken", Response.type.ERROR);
                        break;
                }
            }
        });
    }
}
