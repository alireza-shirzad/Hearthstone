package ir.sharif.math.ap98.hearthstone.gui.Buttons;

import ir.sharif.math.ap98.hearthstone.gui.BackgroundPanel;
import ir.sharif.math.ap98.hearthstone.gui.MainFrame;
import ir.sharif.math.ap98.hearthstone.io.fileOperation.ImageOperater;

import javax.swing.*;
import java.awt.*;

public class BackgroundButton extends MyButton {
    private String imageName;
    public BackgroundButton(String name) {
        super(name);
        this.imageName = name;
        int w = 250;
        int h = 150;
        this.setPreferredSize(new Dimension(w,h));
        Image img = ImageOperater.getInstance().Read(name, ImageOperater.imageType.BACKGROUND);
        this.setIcon(new ImageIcon(img));
        this.setBorderPainted(true);
        this.setContentAreaFilled(false);
        this.requestFocus();
        this.setOpaque(false);
    }

    @Override
    public void press() {
        BackgroundPanel.getInstance().setImage(imageName);
        MainFrame.getInstance().Update();
    }
}
