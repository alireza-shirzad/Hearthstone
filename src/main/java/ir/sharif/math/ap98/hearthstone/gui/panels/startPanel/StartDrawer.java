package ir.sharif.math.ap98.hearthstone.gui.panels.startPanel;

import ir.sharif.math.ap98.hearthstone.gui.Buttons.SignButton;
import ir.sharif.math.ap98.hearthstone.gui.Buttons.SignInButton;
import ir.sharif.math.ap98.hearthstone.gui.Buttons.SignUpButton;
import ir.sharif.math.ap98.hearthstone.gui.CanAnimate;
import ir.sharif.math.ap98.hearthstone.gui.Drawer;
import ir.sharif.math.ap98.hearthstone.io.fileOperation.ImageOperater;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class StartDrawer extends Drawer implements CanAnimate {
    private int animatedX,animatedY;
    private Image animatedImage;
    private SignButton signUpButton;
    private SignButton signInButton;
    public StartDrawer(StartPanel startPanel){
        super(startPanel);
        animatedImage = ImageOperater.getInstance().Read("start.png" , ImageOperater.imageType.LOGO);
        animatedX = 340;
        animatedY =-100;
    }
    public void Animate(Graphics2D g2D){
        if(animatedY<120)animatedY = animatedY + 4;
        g2D.drawImage(this.animatedImage,animatedX,animatedY,null);
    }

    public void designSignInButton(){
        signUpButton = new SignUpButton();
        jPanel.add(signUpButton);
    }

    public void designSignUpButton(){
        signInButton = new SignInButton();
        jPanel.add(signInButton);
    }

}
