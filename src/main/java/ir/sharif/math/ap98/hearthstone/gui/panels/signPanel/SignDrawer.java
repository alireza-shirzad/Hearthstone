package ir.sharif.math.ap98.hearthstone.gui.panels.signPanel;

import ir.sharif.math.ap98.hearthstone.gui.Buttons.SignInCommitButton;
import ir.sharif.math.ap98.hearthstone.gui.Buttons.SignUpCommitButton;
import ir.sharif.math.ap98.hearthstone.gui.Drawer;
import ir.sharif.math.ap98.hearthstone.gui.GUIConstants;
import ir.sharif.math.ap98.hearthstone.gui.Labels.Header;
import ir.sharif.math.ap98.hearthstone.gui.Labels.Header1;
import ir.sharif.math.ap98.hearthstone.gui.Labels.Response;
import ir.sharif.math.ap98.hearthstone.gui.MainFrame;
import ir.sharif.math.ap98.hearthstone.gui.fields.MyPassField;
import ir.sharif.math.ap98.hearthstone.gui.fields.MyTextField;
import ir.sharif.math.ap98.hearthstone.players.SignInManager;

import javax.swing.*;
import java.awt.*;

public class SignDrawer extends Drawer {
    private Header header;
    private Header1 usernameHeader1;
    private Header1 passwordHeader1;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private SignInCommitButton signInCommitButton;
    private SignUpCommitButton signUpCommitButton;
    private Response responseLabel;
    public SignDrawer(JPanel jPanel) {
        super(jPanel);
    }
    public void designHeader(String labelString){
        header = new Header(labelString);
        jPanel.add(header);
        MainFrame.getInstance().Update();
    }
    public void designUserPassLabel(){
        usernameHeader1 = new Header1("Username");
        usernameHeader1.setBounds(290, 190, 250, 80);
        passwordHeader1 = new Header1("Password");
        passwordHeader1.setBounds(290, 270, 250, 80);
        jPanel.add(usernameHeader1);
        jPanel.add(passwordHeader1);
        MainFrame.getInstance().Update();
    }
    public void designUserPassField(){
        usernameField = new MyTextField();
        usernameField.setBounds(540, 210, 250, 30);
        passwordField = new MyPassField();
        passwordField.setBounds(540, 290, 250, 30);
        jPanel.add(usernameField);
        jPanel.add(passwordField);
        MainFrame.getInstance().Update();
    }
    public void designSignInButton(){
        signInCommitButton = new SignInCommitButton(usernameField,passwordField,this);
        signInCommitButton.setBounds(410, 350, 260, 70);
        jPanel.add(signInCommitButton);
    }
    public void designSignUpButton(){
        signUpCommitButton = new SignUpCommitButton(usernameField,passwordField,this);
        signUpCommitButton.setBounds(410, 350, 260, 70);
        jPanel.add(signUpCommitButton);
    }
    public void designResponse(String response, Response.type type){
        responseLabel = new Response(response,type);
        jPanel.add(responseLabel);
    }
}
