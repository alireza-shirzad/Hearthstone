package ir.sharif.math.ap98.hearthstone.gui.panels.signPanel;
import ir.sharif.math.ap98.hearthstone.gui.panels.MyPanel;

public class SignInPanel extends MyPanel {
    private SignDrawer signDrawer;
    public SignInPanel(){
        super();
        signDrawer = new SignDrawer(this);
        design();

    }

    @Override
    public void design() {
        signDrawer.designHeader("Sign In");
        signDrawer.designUserPassLabel();
        signDrawer.designUserPassField();
        signDrawer.designSignInButton();
    }

}
