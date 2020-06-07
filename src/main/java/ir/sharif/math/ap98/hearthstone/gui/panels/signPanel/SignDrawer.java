package ir.sharif.math.ap98.hearthstone.gui.panels.signPanel;

import ir.sharif.math.ap98.hearthstone.gui.Drawer;
import ir.sharif.math.ap98.hearthstone.gui.Labels.Header;
import ir.sharif.math.ap98.hearthstone.gui.MainFrame;
import ir.sharif.math.ap98.hearthstone.gui.Labels.MyLabel;

import javax.swing.*;

public class SignDrawer extends Drawer {
    protected MyLabel label;
    public SignDrawer(JPanel jPanel) {
        super(jPanel);
    }
    public void designLabel(String labelString){
        label = new Header(labelString);
        label.setBounds(120, 100, 330, 80);
        jPanel.add(label);
        MainFrame.getInstance().Update();
    }
}
