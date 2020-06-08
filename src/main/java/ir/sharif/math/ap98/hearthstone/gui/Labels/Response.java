package ir.sharif.math.ap98.hearthstone.gui.Labels;

import ir.sharif.math.ap98.hearthstone.gui.GUIConstants;

import javax.swing.*;
import java.awt.*;

public class Response extends JLabel {
    public Response(String label,type type) {
        super(label);
        setFont(new Font(GUIConstants.HEADER1_FONT_NAME, Font.BOLD, GUIConstants.HEADER1_FONT_SIZE));
        setBounds(240, 400, 600, 200);
        if (type== Response.type.ERROR) setForeground(Color.RED);
        else if(type== Response.type.SUCCESS) setForeground(Color.GREEN);
        setHorizontalAlignment(CENTER);
    }
    public enum type{
        ERROR,
        SUCCESS;
    }
}
