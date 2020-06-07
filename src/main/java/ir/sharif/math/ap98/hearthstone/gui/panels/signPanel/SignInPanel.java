package ir.sharif.math.ap98.hearthstone.gui.panels.signPanel;
import ir.sharif.math.ap98.hearthstone.gui.panels.MyPanel;

public class SignInPanel extends MyPanel {
    private SignDrawer signDrawer;
    public SignInPanel(){
        super();
        signDrawer = new SignDrawer(this);
        designSignInLabel();
    }
    private void designSignInLabel(){
        signDrawer.designLabel("Sign In");
    }
}
