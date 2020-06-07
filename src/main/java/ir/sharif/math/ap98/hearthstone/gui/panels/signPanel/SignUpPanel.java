package ir.sharif.math.ap98.hearthstone.gui.panels.signPanel;
import ir.sharif.math.ap98.hearthstone.gui.panels.MyPanel;

public class SignUpPanel extends MyPanel {
    private SignDrawer signDrawer;
    public SignUpPanel(){
        super();
        signDrawer = new SignDrawer(this);
        designSignUpLabel();
    }
    private void designSignUpLabel(){
        signDrawer.designLabel("Sign Up");
    }
}
