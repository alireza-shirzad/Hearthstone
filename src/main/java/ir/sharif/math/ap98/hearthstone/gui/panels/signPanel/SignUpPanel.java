package ir.sharif.math.ap98.hearthstone.gui.panels.signPanel;
import ir.sharif.math.ap98.hearthstone.gui.panels.MyPanel;

import java.awt.*;

public class SignUpPanel extends MyPanel {
    private SignDrawer signDrawer;
    public SignUpPanel(){
        super();
        signDrawer = new SignDrawer(this);
        design();
    }
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2D = (Graphics2D)g;
        signDrawer.Animate(g2D);
    }
    @Override
    public void design() {
        signDrawer.designHeader("Sign Up");
        signDrawer.designUserPassLabel();
        signDrawer.designUserPassField();
        signDrawer.designSignUpButton();
    }

}
