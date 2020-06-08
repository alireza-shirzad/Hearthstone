package ir.sharif.math.ap98.hearthstone.gui.Buttons;

import ir.sharif.math.ap98.hearthstone.gui.BackgroundPanel;
import ir.sharif.math.ap98.hearthstone.gui.Labels.Response;
import ir.sharif.math.ap98.hearthstone.gui.panels.menuPanel.MenuPanel;
import ir.sharif.math.ap98.hearthstone.gui.panels.signPanel.SignDrawer;
import ir.sharif.math.ap98.hearthstone.players.SignInManager;
import ir.sharif.math.ap98.hearthstone.players.SignUpManager;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SignUpCommitButton extends SignCommitButton  {
    private SignDrawer signDrawer;
    public SignUpCommitButton(JTextField jTextField, JPasswordField jPasswordField, SignDrawer signDrawer) {
        super("Sign Up", jTextField, jPasswordField, signDrawer);
        this.signDrawer = signDrawer;
    }
    public void press(){
        String username = jTextField.getText();
        String password = new String(jPasswordField.getPassword());
        if (username.equals("")){
            signDrawer.designResponse("username field is empty", Response.type.ERROR);
        }else{
            SignUpManager.Result result = SignUpManager.getInstance().signUp(username,password);
            switch (result){
                case Success:
                    signDrawer.designResponse("SignUp successful", Response.type.SUCCESS);
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
                case Error_UsernameAlreadyUsed:
                    signDrawer.designResponse("Username already taken", Response.type.ERROR);
                    break;
            }
        }
    }

}
