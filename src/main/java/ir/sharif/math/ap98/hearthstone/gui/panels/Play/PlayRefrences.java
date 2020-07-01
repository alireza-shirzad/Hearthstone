package ir.sharif.math.ap98.hearthstone.gui.panels.Play;

import ir.sharif.math.ap98.hearthstone.gui.panels.PrePlay.HandChoosePanel;
import ir.sharif.math.ap98.hearthstone.gui.panels.PrePlay.PassivePanel;

public class PlayRefrences {

    private static PlayPanel playPanel;
    private static BottomPanel bottomPanel;
    private static UpPanel upPanel;

    public static BottomPanel getBottomPanel() {
        return bottomPanel;
    }
    public static void setBottomPanel(BottomPanel bottomPanel) {
        PlayRefrences.bottomPanel = bottomPanel;
    }
    public static UpPanel getUpPanel() {
        return upPanel;
    }
    public static void setUpPanel(UpPanel upPanel) {
        PlayRefrences.upPanel = upPanel;
    }
    public static PlayPanel getPlayPanel() {
        return playPanel;
    }
    public static void setPlayPanel(PlayPanel playPanel) {
        PlayRefrences.playPanel = playPanel;
    }
}
