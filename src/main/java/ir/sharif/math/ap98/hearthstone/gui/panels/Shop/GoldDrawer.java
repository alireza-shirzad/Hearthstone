package ir.sharif.math.ap98.hearthstone.gui.panels.Shop;

import ir.sharif.math.ap98.hearthstone.game.GameState;
import ir.sharif.math.ap98.hearthstone.gui.Drawer;
import ir.sharif.math.ap98.hearthstone.gui.GUIConstants;
import ir.sharif.math.ap98.hearthstone.io.fileOperation.ImageOperater;

import javax.swing.*;
import java.awt.*;

public class GoldDrawer extends Drawer {
    private JLabel goldLabel;
    private JLabel coinLabel;
    public GoldDrawer(JPanel jPanel) {
        super(jPanel);
    }
    public void designCoin(){
        Image CoinIcon = ImageOperater.getInstance().Read("Coin.png"
                , ImageOperater.imageType.LOGO);
        ImageIcon imageIcon = new ImageIcon(CoinIcon);
        coinLabel = new JLabel(imageIcon);
        coinLabel.setBounds(0,0,200,200);
        jPanel.add(coinLabel);
    }
    public void designGoldNumber(){
        goldLabel = new JLabel(": " + String.valueOf(GameState.getInstance()
                .getCurrentPlayer().getGold()));
        goldLabel.setBounds(200, 15, 200, 200);
        goldLabel.setFont(new Font(GUIConstants.HEADER1_FONT_NAME, Font.BOLD, 50));
        goldLabel.setForeground(GUIConstants.COLOR5);
        jPanel.add(goldLabel);
    }
}
